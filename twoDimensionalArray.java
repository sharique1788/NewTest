package Test;

public class twoDimensionalArray {

	public static void main(String[] args) {

int i[][] = new int [2][3];//first number - row 2 and second - column 3
i[0][0]=101;
i[0][1]=102;
i[0][2]=103;
i[1][0]=201;
i[1][1]=202;
i[1][2]=203;

for(int a=0;a<2;a++) {
	for(int b=0;b<3;b++) {
		System.out.println(i[a][b]);
	}
	System.out.println("*************");
}


	}

}
