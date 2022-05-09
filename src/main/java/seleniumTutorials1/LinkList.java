package seleniumTutorials1;

import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



			LinkedList ls = new LinkedList();

			ls.add("selenium");
			ls.add("testng");
			ls.add("cucumber");
			ls.add(1000);
			ls.add(true);
			ls.add(null);
			ls.add("selenium");
			
			System.out.println(ls);
			
			ls.addFirst("Jenkins");
			
			System.out.println(ls);
			ls.addLast("HTML");
			
			System.out.println(ls);	
			
//			System.out.println(ls);
//			
//			System.out.println(ls.remove(0));
//			//System.out.println(ls.removeFirst());
//			
//			System.out.println(ls);
			
			
			//System.out.println(ls.getLast());
			
			
//			System.out.println(ls.getFirst());
//			
//			System.out.println(ls.get(0));
			
	//System.out.println(ls);

//			for(int i=0;i<ls.size();i++)
//			{
//				System.out.println(ls.get(i));
//			}

//			for(Object o: ls)
//			{
//				System.out.println(o);
//			

	}

}
