package seleniumTutorials1;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int n = 3553, reverseNum= 0, remainder ;
		
		int originalNum = n;
		
		//Reverse number
		while(n>0) {
			
			remainder = n%10; //3  5  5 3
			
			reverseNum =(reverseNum*10) + remainder; // 0+3= 3   30+5= 35  50+5=55  30+3= 
			 n =n/10; //3553/10 =355.3=355   355/10=35  35/10=3 3/10=0.3
		}
		
		//Compare number is palindromeor not 
		if(originalNum==reverseNum) {
			System.out.println("Given number is palindrome " +reverseNum);
		}
		else {
			System.out.println("Given number is not a palindrome " +reverseNum);
		}
	}

}
