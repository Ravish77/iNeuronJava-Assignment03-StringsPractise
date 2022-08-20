
public class Program01_ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "iNeuron";
		String s2 = "";
		
		
//		Traversing from last to first
		for(int i=s1.length()-1;i>=0;i--) {
//			Assigning each character to String s2
			s2 = s2 + (char)(s1.charAt(i));
			
		}
		
		System.out.println(s2);

	}

}
