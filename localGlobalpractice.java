package Test;

public class localGlobalpractice {

	String st="learning Java";
	public static void main(String[] args) {

		localGlobalpractice lgp=new localGlobalpractice();
		//lgp.add();
	int res=lgp.add(12, 8);
		System.out.println("I am "+lgp.st);
		System.out.println(res);
	}
	
public int add(int a, int b) {

//int a=10;
//int b=20;
int c=a+b;
return c;
//System.out.println(a+b);
	}

}
