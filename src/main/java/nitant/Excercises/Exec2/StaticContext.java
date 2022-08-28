package nitant.Excercises.Exec2;

public class StaticContext {
static int i = 0;


public void get() {
	i = i + 10;
	System.out.println(i);
}
public static void main(String args[]) {
	new StaticContext().get();
}
}
