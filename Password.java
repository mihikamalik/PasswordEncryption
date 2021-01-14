import java.util.*; 

public class password {

	public static void main(String[] args) {
		
		int key = 2;
		Scanner scan= new Scanner(System.in);
		System.out.println( "Enter your password to encrypt: ");
        String text=scan.nextLine();
        System.out.println("Your Encrypted password is: ");
		
		char[] chars = text.toCharArray();
		for (char c: chars) {
			c+= 2;
			
			System.out.print(c);
		}
		
	}

}
