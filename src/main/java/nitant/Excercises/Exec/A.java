package nitant.Excercises.Exec;



class B {
	static int add(int a , int b) {  
		return a + b;
	}
}
class A extends B {
	public static void main(String args[]) {
		short s = 9;
		System.out.println(add(s,6));
	}
}
