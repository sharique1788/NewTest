package Test;

public class staticAndNonStatic {

	public static void main(String[] args) {

add();
staticAndNonStatic st=new staticAndNonStatic();
st.sub();
	}

//static method
public static void add() {
	System.out.println("Add function");
}

//non static method
public void sub() {
	System.out.println("Sub function");
}
}