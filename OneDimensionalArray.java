package Test;

public class OneDimensionalArray {

	public static void main(String[] args) {

//Arrays  - to store more than one value and need to specify max numbers of values can be stored
int i[]=new int[5];
i[0]=100;
i[1]=200;
i[2]=300;
i[3]=400;
i[4]=500;

System.out.println(i[3]);

for(int a=0;a<5;a++) {
System.out.println(i[a]);
}

char c[]=new char[4];
c[0]='!';
c[1]='@';
c[2]='#';
c[3]='$';

for (int b=0;b<4;b++) {
	System.out.println("Value is "+c[b]);
}
	}

}
