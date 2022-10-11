package Test;

public class functionWithReturn {

	public static void main(String[] args) {
functionWithReturn fwr=new functionWithReturn();
int res=fwr.add(231,9);
System.out.println(res);
	}
public static int add(int a, int b) { //function with parameter
int c=a+b;
return c;
}

}
