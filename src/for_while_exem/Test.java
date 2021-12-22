package for_while_exem;

public class Test {

	public static void main(String[] args) {
		
//		int total = 0;
//		
//		for(int i = 1; i <= 10; i++)
//		{
//			total += i;
//		}
//		
//		System.out.println("1 ~ 10까지의 합 : " + total);
//		
//
//		
//		int i = 1;
//		
//		while(i <= 10)
//		{
//			total += i;
//			i++;
//		}
//		
//		System.out.println("1 ~ 10까지의 합 : " + total);
		
//		int total = 0;
//		
//		for(int i = 1; i <= 100; i++)
//		{
//			
//			if(i % 3 == 0)
//			{
//				System.out.println("3의 배수 : " + i + " ");
//				total += i;
//			}
//			
//			
//		}
//		
//		System.out.println("1 ~ 100까지의 3의배수 총 합 : " + total);
//		
		for(int i = 1; i <= 100; i++)
		{
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9 || i / 10 == 3 || i / 10 == 6 || i / 10 == 9)
			{
				System.out.print("짝");
				
				if( i % 30 == 3 || i % 30 == 6 || i % 30 == 9)
				{
					System.out.print
					("짝");
				}
				System.out.println("");
			}
				
			else
			{
				System.out.println(i + " ");
			}
		}
		
	}

}
