
import java.util.Scanner;
public class Program05_RepeatedChar {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s1 = sc.nextLine();
		
//		To convert string into a array of character 
		char s1Arr[]= s1.toCharArray();
		System.out.println("Repeated Character in this string: ");
		
		for(int i=0;i<=s1.length()-1;i++) {
			for(int j=i+1; j<=s1.length()-1;j++) {
				
				if(s1Arr[i]==' ' || s1Arr[j]==' ')
				{
					continue;
				}
				else if(s1Arr[i]==s1Arr[j]) {
					System.out.print(s1Arr[j]+ " ");
					break;
				}
			}
		}
		
		
	}
	
}