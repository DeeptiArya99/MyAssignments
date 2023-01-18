package week1.day2;

public class DistinctElement {

	public static void main(String[] args) {
		
		int nums[] = {1,2,3,1};
		boolean b=true;
		boolean d=false;
		
		for(int i=0; i<nums.length; i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					System.out.println(b);
					break;
				}
				
				else
				{
					System.out.println(d);
					break;
				}
			}
		}
		

	}

}
