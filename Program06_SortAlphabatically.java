import java.util.Arrays;
import java.util.Scanner;
public class Program06_SortAlphabatically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int temp, string_size;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a String");
	      String input_string = sc.nextLine();
	     
	      
	      char charArray[] = input_string.toLowerCase().toCharArray();
	      string_size = charArray.length;
	      for(int i = 0; i < string_size; i++ ) {
	         for(int j = i+1; j < string_size; j++) {
	        	 if(charArray[i]>charArray[j])
		            {
		            	temp = charArray[i];
			            charArray[i] = charArray[j];
			            charArray[j] = (char) temp;
		            }
	         }
	      }
	      System.out.println("\nThe characters of the string after sorting is: "+Arrays.toString(charArray));

	}

}
