package programs.java;

public class Pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count1=12;
int count2=21;
int count3=34;
//using arithmatic operators
int total=(count1+count2+count3);
int mul=(count1*count3);
//& | < using relational operators
int c=(count1+count2) | (count2+count3);
int v=(count1*count3) & (count1*count2);
int a=(1*2) & (2*5);
boolean d=(2+3)<(7+9);
int x=(3+3)&(2*2)|(2-1)&(10/5);
//print statements
System.out.println(total);
System.out.println(mul);
System.out.println(c);
System.out.println(v);
System.out.println(a);
System.out.println(d);
System.out.println(x);
	}

}
