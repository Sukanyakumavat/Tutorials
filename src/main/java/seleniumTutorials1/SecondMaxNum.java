package seleniumTutorials1;

public class SecondMaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {-10,20,30,40,-50,60};
		
		int m = a[0]; //10
		
		for(int i=1; i<=a.length-1; i++) {
			
			if(m<a[i])// 10<20  10<30 T 10<40 10<50 10<60
				
			// If find 1st minimum num	
			//if(m>a[i])  
			{
				
				m=a[i]; //20 30 40 50 60
			}
		}
		
		System.out.println("1st max number" +m); //60
		
		int k =a[0]; //10
		for(int i=1; i<=a.length-1; i++)
		{
			if(a[i]!=m) // 20!= 60 T  30!=60  40!=60 50!=60 60!=60 F
			{
				if(a[i]>k) // 20>10 30>10 40>10 50>10
				
					// If find 2nd minimum num	
					//if(a[i]<k)
				{
					k = a[i]; //20 30 40 50
				}
			}
		}
		System.out.println("Second max number is " +k);
	}
	

}
