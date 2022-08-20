
public class Program02_ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Think Twice";
		String s2 = "";
		
		for(int i=0;i<=s1.length()-1;i++){
			
			if(s1.charAt(i)>='A'  && s1.charAt(i)<='Z')
			{
				s2 = s2 + (char) (s1.charAt(i)+32);
			}
			else
				s2 = s2 + (char) (s1.charAt(i));
			
		}
		
		
		
		
		String arr[] = s2.split(" ");
		String s3="";
		String s4="";
		
		for(int i=arr[0].length()-1;i>=0;i--){
			
			s3 = s3 + (char)(arr[0].charAt(i));
			
		}
		
		
		for(int i=arr[1].length()-1;i>=0;i--){
			
			s4 = s4 + (char)(arr[1].charAt(i));
			
		}
		
		System.out.println(s3+" "+s4);

		

	}

}
