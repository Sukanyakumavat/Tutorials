package seleniumTutorials1;

public class ArraySorting {

	public static void main(String[] args) {
		Object[] a = {'A', 224,"Selenium", 'Z', 345};  
		for (int i =0; i<a.length; i++) {
			if(a[i].getClass() == Integer.class) {
				System.out.println(a[i]);
			}
			else if (a[i].getClass() == Character.class) {
				System.out.println(a[i]);
		
			}
			else {
				System.out.println(a[i]);
			}
		}
}
}