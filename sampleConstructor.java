package Test;

public class sampleConstructor {

int a;
String st;
	
//constructor
public sampleConstructor() {
	a=0;
	st=null;
}
	
	public static void main(String[] args) {

		sampleConstructor sc=new sampleConstructor();
	System.out.println(sc.a);
	System.out.println(sc.st);
	
	}

}
