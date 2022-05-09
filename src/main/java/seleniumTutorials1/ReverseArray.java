package seleniumTutorials1;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



			String[] xyz = new String[5];

			xyz[0] = "Rest Assured";
			xyz[1] = "JDBC";
			xyz[2] = "github";
			xyz[3] = "jenkins";
			xyz[4] = "pune";

			
		System.out.println(xyz.length);
			
			
			for(int i=xyz.length-1;i>=0;i--)
			{
				System.out.print(" "+xyz[i]);// xyz[] = [ab c ]
			}
	}

}
