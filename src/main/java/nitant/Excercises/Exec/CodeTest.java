package nitant.Excercises.Exec;

public class CodeTest {
	  static int [] myList = {90,45};
	  public static void main(String args[]) 
      {
    	performHandover(3, 1);
      }
      public static void performHandover (int iterationNumber ,int numberOfHandover) {
    	for (int iteration = 0; iteration < iterationNumber ; iteration++ ) {  
      		for (int handover = iteration; handover < numberOfHandover + iteration; handover++) {
      			 System.out.print(" " +myList[handover % myList.length]);
      			 System.out.print("position " + handover % myList.length +" " );
      		}
      		System.out.println();
      	}
      }
}
