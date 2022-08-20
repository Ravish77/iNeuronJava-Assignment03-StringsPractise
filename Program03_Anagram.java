import java.util.Arrays;  
   
public class Program03_Anagram {  
	
	
    static void checkAnagram(String str1, String str2) {  
        String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        
        boolean condition = true;  
        
        if (s1.length() != s2.length()) 
        {  
            condition = false;  
        } 
        else 
        {  
            char[] arrayS1 = s1.toLowerCase().toCharArray();  
            char[] arrayS2 = s2.toLowerCase().toCharArray();  
            
            Arrays.sort(arrayS1);  
            Arrays.sort(arrayS2);  
            
            condition = Arrays.equals(arrayS1, arrayS2);  
        } 
        
        
        if (condition) 
        {  
            System.out.println(s1 + " and " + s2 + " are anagrams");  
        } 
        else 
        {  
            System.out.println(s1 + " and " + s2 + " are not anagrams");  
        }  
        
    }  
   
    
    
    public static void main(String[] args) {  
    	
        checkAnagram("below", "elbow");  
 
    }  
}  