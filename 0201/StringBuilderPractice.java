public class StringBuilderPractice {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello ");
		sb.append("SSAFY");
		sb.append("!!!");
		
		System.out.println(sb.toString());
		
		sb.setLength(sb.length()-1);
		
		System.out.println(sb.toString());		
		
	}
}
