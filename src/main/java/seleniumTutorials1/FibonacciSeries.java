package seleniumTutorials1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1=0, n2=1, n;
		
		System.out.println("first number = " +n1);
		System.out.println("second number = " +n2);
		
		for(int i = 0; i<=10; i++) {
			
			n=n1+n2;  
			System.out.println(n);  
			n1=n2;
			n2=n;
		}
	}

}
