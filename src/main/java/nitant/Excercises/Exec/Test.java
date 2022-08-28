package nitant.Excercises.Exec;

import java.util.HashMap;
import java.util.StringTokenizer;

public class Test {
   public static void main(String args[]) {
	   HashMap<String, Integer> map = new HashMap<String, Integer>();
	   String paragraph = "hello gourav do you know gaurav";
	   String[] s = paragraph.split(" ");
	   int count = 0;
	   for (int i = 0; i < s.length; i++ ) {
		    if (map.containsKey(s[i])) { 
		    	map.put(s[i], count + 1);
		    } else { 
		    	map.put(s[i], 1);
		    }
	   }
	   System.out.println(map);
	   System.out.println(countWordsUsingStringTokenizer(paragraph));
   }
   
   public static int countWordsUsingStringTokenizer(String sentence) { if (sentence == null || sentence.isEmpty()) { return 0; } StringTokenizer tokens = new StringTokenizer(sentence); return tokens.countTokens(); }
}
