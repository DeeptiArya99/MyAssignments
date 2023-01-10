package week1.day1;

public class FibonnciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=11, firstNum = 0, secNum = 1, sum = 0;
		System.out.println(firstNum);
		
		for( int i=1; i<= n; i++)
		{
			sum= firstNum + secNum;
			secNum = firstNum;
			firstNum =sum;
			System.out.println(sum);
		}
		
	
	}

}
