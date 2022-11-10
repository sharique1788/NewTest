package Test;

public class defaultdatatypesExample {

static int a;//declaration
static int b=10;//initialization
static boolean c;
static String st;
//if the global variable is declared but not initialized then compiler will assign default value to it
	public static void main(String[] args) {
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(st);
		
add();
	}

	public static void add() {
		int d;/*local variable declaration without assigning value then
		compiler will not set a default value*/
		System.out.println(d);
	}
}
