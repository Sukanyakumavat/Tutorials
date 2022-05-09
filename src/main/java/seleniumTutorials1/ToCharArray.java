package seleniumTutorials1;

public class ToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			String a="selenium";
		
			char[] abc =a.toCharArray();
			
			System.out.println(abc.length);
			
			System.out.println(abc[3]);
			
			for(int i=abc.length-1;i>=0;i--)
			{
				System.out.print(abc[i]);
			}
			
			
			
		}


	}

