package seleniumTutorials1;

public class RemoveDupliFromString3 {
// Converting string into char Array
	
	public static void main(String[] args) {

	String str = "Hello World"; 
	//int a = 0;  
	 char abc[] = str.toCharArray();  
	 
	 for(int i =0; i<str.length(); i++)
	 {
		 for(int j=i+1; j<str.length(); j++)  
		 {
			 if(abc[i]==abc[j])  
			 {
				 System.out.println(abc[j]);  
			//	 a++;
				 break; 		
			 }
			
		
		 }
	 }	 
	
	}
	

}