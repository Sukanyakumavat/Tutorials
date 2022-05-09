package seleniumTutorials1;

public class RemoveDupliFromString {

	public static void main(String[] args) {
		
		String str = "Hello World";  
		
		String duplicatestr = "";  
		String duplicate2 ="";
		for(int i =0; i<str.length(); i++) {
			if(!duplicatestr.contains(String.valueOf(str.charAt(i))))
			{
				duplicatestr+= str.charAt(i);
				
				// duplicatestr = duplicatestr+str.charAt(i);
			} 
			
	
		//System.out.println(duplicatestr);
	
		else
				
			
			{
				duplicate2+= str.charAt(i);
		}
			
			
		}
	
		  System.out.println(duplicate2);
	}
}


