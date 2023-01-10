package week1.day2;

public class stringLastWordCount {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		char[] charArray = str.toCharArray();
		
		String[] split = str.split(" ");
		System.out.println(split[1]);
		
		int length = split.length();
		for(int i=0; i<charArray.length; i++)
		{
			System.out.println(length);
		}
		
		
		
		

	}

}
