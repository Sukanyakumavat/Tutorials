package seleniumTutorials1;

import java.util.LinkedHashSet;

public class RemoveDupliFromString2 {

	public static void main(String[] args) {
		String str = "Hello World";  
		char abc[] = str.toCharArray();  
		
   LinkedHashSet<Character> st = new LinkedHashSet<Character>();  
   for(char ch: abc)
   {
	   st.add(ch);
   }
  for(char char1 : st)
  {
	  System.out.println(char1);
  }
	}

}
