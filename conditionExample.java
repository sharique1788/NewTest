package Test;

public class conditionExample {

	public static void main(String[] args) {

int a=54;
int b=39;

//single conditions example
if(a<b) {
	System.out.println("a is smaller than b");
	System.out.println("Value of a is "+a);
}else {
	System.out.println("a is greater than b");
	System.out.println("Value of a is "+a);
}

//multiple conditions example
int c=200;
int d=250;
int e=300;

if(c>d && c>e) {
	System.out.println("C is greatest and value of c is "+c);
}else if(d>e) {
	System.out.println("d is greatest and value of d is "+d);
}else {
		System.out.println("e is greatest and value of e is "+e);

	}
	}
}
