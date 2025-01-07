package java8prog;

public class Factorial {

	public static void main(String[] args) {
		
		
		int num = 5;
		
		int t = 0;
		int t1 = 1;
		int fact = 0;
		for(int n = num; n <= 0; n-- )
		{
			if(t == 0 & t1 == 1)
			{
				fact = 1;
				t= n;
				
			}
			else
			{
				fact = fact * n;
			}
		}
		
		System.out.println("Factorial of no : "+ fact);
		
	}
}

