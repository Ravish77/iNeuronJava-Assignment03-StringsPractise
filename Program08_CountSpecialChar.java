import java.util.Scanner;

public class Program08_CountSpecialChar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s1 = sc.nextLine();
		
		int n=0;
		for(int i=0;i<s1.length();i++) {
			if((s1.charAt(i)>=32 && s1.charAt(i)<=47) || (s1.charAt(i)>=58 && s1.charAt(i)<=64) || (s1.charAt(i)>=91 && s1.charAt(i)<=96)  || (s1.charAt(i)>=123 && s1.charAt(i)<=126))
			{
				n++;
			}
		}
		System.out.println("Total number of Special Character in the String: " +n);
		
	}

}