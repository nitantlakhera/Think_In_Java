package DSA.Recursion;

public class Palendrom {
	public static void main (String args []) {
//		String s = "abcba";
//		checkPalendrome(0, s.length()-1, s);
//		s = "a";
//		checkPalendrome(0, s.length()-1, s);
//		s = "abc";
//		checkPalendrome(0, s.length()-1, s);
//	    String s =  "abcbca";
//		System.out.println(check(s, 0, s.length() -1));
	
		validation("abcba");
	}
	
    public static void validation(String str) {
    	if (str.isBlank() || str.isEmpty()) {
    		System.out.println("Please provide valid String");
    	} else {
    		System.out.println(check2(str));
    	}
    }
    
	public static boolean check2 (String str) 
	{
	    if (str.length() == 1 || str.length() == 0) {
			return true;
		}
		
		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			return check2(str.substring(1, str.length() -1));
		}
		
		return false;
	}
	
	public static void checkPalendrome (int i , int j , String str) {
		if (j < i) {
            System.out.println("Palendrome");
			return;
		}
		if (str.charAt(i) == str.charAt(j)) {
			checkPalendrome(i + 1, j - 1, str);
		} else {
			System.out.println("Not Palendrome");
		}
	}
	
	public static boolean check (String str, int s, int e) {
		
		if (s == e)
            return true;
 
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;
 
        if (s < e + 1)
            return check(str, s + 1, e - 1);
 
        return true;
	}
}
