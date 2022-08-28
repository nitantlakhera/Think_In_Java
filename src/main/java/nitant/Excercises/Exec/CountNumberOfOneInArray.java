package nitant.Excercises.Exec;

public class CountNumberOfOneInArray {
  public static void main (String args[]) {
	  int array [] = {0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1};
	  System.out.println(getCounter(array));
  }

  public static int getCounter(int array[]) {
	int i = 0 ; 
	int j = array.length - 1;
	while (i < j) {  
		int mid = (i + j)/2;
		if (array[mid] == 0 || array[mid -1] == 0 && array[mid + 1] == 1) {
	        return array.length - mid - 1;	
		}
		if (array[mid] == 0){
		   i = mid + 1;
		} else {
			j = mid -1;
		}
	}
	return -1;
  }
}
