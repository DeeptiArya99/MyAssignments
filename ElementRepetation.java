package week1.day2;

public class ElementRepetation {

	public static void main(String[] args) {
		
		int num[] = {4,1,2,1,2};
		int length =num.length;
		for(int i=0; i<num.length ; i++)
		{
			for(int j=i+1; j<num.length ; j++)
			{
				if(num[i] != num[j])
				{
				 System.out.println(num[i]);	
				 break;
				}
			}

		}
			
		
		

	}

}
