package seleniumTutorials1;

public class PalindromeString {

	public static void main(String[] args) {
		String str= "Radar", rstr="";  
		 
		
		int strlen = str.length();
		
		//Reverse string
		for(int i = (strlen-1); i>=0; i-- ) {
			
			rstr = rstr+str.charAt(i);
		}
      //compare for paliondrome 
		
		if(str.toLowerCase().equals(rstr.toLowerCase())) {
			
			System.out.println("Given string is palindrome  " +rstr);
		}
		else {

			System.out.println("Given string is not a palindrome  " +rstr);
		}
	}

}
