package nitant.Excercises.Exec;

import java.util.HashSet;
import java.util.Set;

public class Annagram {
  public static void main(String args []) 
  {
	  String s1 = "word";
	  String s2 = "nrod";
	  Set<Character> hash = new HashSet<Character>();
	  for (int i = 0; i < s1.length(); i ++) {
		  hash.add(s1.charAt(i));
	  }
	  boolean check = false;
	  for ( int i =0; i < s2.length(); i ++) {
		  if (hash.contains(s2.charAt(i)))
		  {
			  check = true;
		  } else {
			  check = false;
			  break;
		  }
	  }
	  System.out.println(check);
  }
}