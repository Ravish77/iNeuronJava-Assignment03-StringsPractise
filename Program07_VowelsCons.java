import java.util.Scanner;

public class Program07_VowelsCons {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to FInd Vowels and Consonents: ");
		String s1=sc.nextLine();
		int vowelCount = 0;
		int consCount = 0;
		
		s1= s1.toLowerCase();
		
		
		for(int i=0;i<=s1.length()-1;i++) {
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
			{
				vowelCount ++;
			}
			else if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
				consCount ++;
		}
		
		System.out.println("Total Number of vowels in the given String is: "+vowelCount);
		System.out.println("Total Number of Consonent in the given String is: "+consCount);
		
		
		
	}

}
