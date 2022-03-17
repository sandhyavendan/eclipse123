package DataTypes;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Integer values
		int a1=10;
		int b1=20;
		int c1=30;
		int sumint=a1+b1+c1;
		System.out.println("interger value = " +sumint);
	//Float values
		float a2=31.55f;
		float b2=53.666f;
		float c2=46.6678f;
		float sumfloat=a2+b2+c2;
		System.out.println("float value = " +sumfloat);
	//Double values
		double a3=1111.5788;
		double b3=2222.5789;
		double c3=3333.5787;
		double sumdouble=a3+b3+c3;
		System.out.println("double value = " +sumdouble);
	//Boolean value
		boolean ab = true;
		//boolean bc = false;
		System.out.println("Boolean value = " +ab);
	//character
		char a1b1 = 'S';
		System.out.println("character value = " +a1b1);
	//string
		String abc ="Hello, Good Morning!!";
		System.out.println("string value = "+abc);
	// static method can be called directly no need of an object
		add();
		sub();
	    div();
		//creating an object
		first obj=new first();
		//calling a non static method via object
		obj.mul();
		//return method calling
		System.out.println("string method of return type is called = "+msg());
		Float();
		System.out.println("boolean method of return type is called = "+bool());
		

	}

	public static void add() {
		int z=10;
		int y=20;
		int sum=z+y;
		System.out.println("add method called and summation = "+sum);
	}
	public static void sub() {
		int z1=50;
		int y1=10;
		int sub=z1-y1;
		System.out.println("sub method called and subtract = " +sub);
	}
	public void mul() {
		int z2=5;
		int y2=10;
		int mul=z2*y2;
		System.out.println("mul method called and multiple = "+mul);
	}
	public static void div() {
		int z3=44;
		int y3=2;
		int div=z3/y3;
		System.out.println("div method called and division = "+div);
		
	}
	public static String msg() {
		String zy="Good day";
		return zy;
	}
	public static void Float() {
		float n1=2.666f;
		float n2=5.778f;
		float sum1=n1+n2;
		System.out.println("float method called and addition = " +sum1);
		
	}
	public static Boolean bool() {
		boolean n1n2=true;
		return n1n2;
	}
	}
	
	
