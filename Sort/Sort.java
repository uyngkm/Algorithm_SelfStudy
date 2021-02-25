
public class Sort {
	public static void countingSort(int[] list) {

		final int SIZE = list.length;
		int[] result = new int[SIZE];

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < SIZE; i++) {
			if (list[i] < min)
				min = list[i];
			if (list[i] > max)
				max = list[i]; // 최소값부터 개수를 세면 되니까 min 값을 구한다.
		}

		// count 배열 생성
		int[] count = new int[max + 1];

		// 배열 원소 카운트
		for (int i = 0; i < SIZE; i++) {
			count[list[i]]++;
		}

		// 카운트 배열을 변형
		for (int i = min + 1; i <= max; i++) {
			count[i] = count[i - 1] + count[i];
		}

		// 배열원소 하나씩 들여다보며 결과 배열의 각 우너소값에 해당하는 위치에 채운다.
		for (int i = SIZE - 1; i >= 0; i--) {
			result[--count[list[i]]] = list[i];
		}

		System.arraycopy(result, 0, list, 0, SIZE);
	}

	// mergeSort - 외부에 공개
	public static void mergeSort(int[] list) {
		mergeSort(list, 0, list.length - 1); // 나누자
	}

	// 배열의 나누는 메소드 - 외부에 공개 X
	private static void mergeSort(int[] list, int start, int end) {

		// <<기저조건>>
		if (start == end) { // 1개 짜리 배열
			return;
		}

		// <<유도파트>>
		// 2집합으로 분할하여 각각 정렬
		int middle = (start + end) / 2; // 2집합으로 분할
		mergeSort(list, start, middle); // 왼쪽 집합 정렬
		mergeSort(list, middle + 1, end); // 오른쪽 집합 정렬

		// 정렬된 2집합을 이용하여 병합
		merge(list, start, middle, end);
	}

	private static void merge(int[] list, int start, int middle, int end) {
		int[] newArr = new int[end - start + 1]; // 최종 결과 배열
		int left = start, right = middle + 1;
		int i = 0; // 결과 배열 인덱스

		do {
			if (list[left] < list[right]) {
				newArr[i++] = list[left++];
			} else {
				newArr[i++] = list[right++];
			}
		} while (left <= middle && right <= end); // 왼쪽, 오른쪽 모두 끝나지 않았다. (한 쪽 경계 벗어난다면 조건 만족하지 않는다.)

		// 오른쪽 집합이 다 처리된 경우
		while (left <= middle) {
			newArr[i++] = list[left++];
		}
		
		// 왼쪽 집합이 다 처리된 경우
		while (right <= end) {
			newArr[i++] = list[right++];
		}
		
		System.arraycopy(newArr, 0, list, start, newArr.length); // 갖다 붙인다. 

	}

}
