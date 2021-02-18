import java.util.Scanner;

public class Student implements IMaths {

	@Override
	public void add() {
		Scanner kb = new Scanner(System.in);

        System.out.println("Enter any two integer values to perform addition");

        int a=kb.nextInt();

        int b=kb.nextInt();

        int s=a+b;

        System.out.println("Sum of "+a+" and "+b+" is "+s);

	}

	@Override
	public void sub() {
		Scanner kb = new Scanner(System.in);

        System.out.println("Enter any two integer values to perform subtraction");

        int a=kb.nextInt();

        int b=kb.nextInt();

        int s=a-b;

        System.out.println("Sub of "+a+" and "+b+" is "+s);

	}

	@Override
	public void mul() {
		Scanner kb = new Scanner(System.in);

        System.out.println("Enter any two integer values to perform multiplicaion");

        int a=kb.nextInt();

        int b=kb.nextInt();

        int s=a*b;

        System.out.println("mul of "+a+" and "+b+" is "+s);

	}

	@Override
	public void div() {
		Scanner kb = new Scanner(System.in);

        System.out.println("Enter any two integer values to perform division");

        int a=kb.nextInt();

        int b=kb.nextInt();

        int s=a/b;

        System.out.println("div of "+a+" and "+b+" is "+s);

	}
	

	public static void main(String[] args) {
		Student s1=new Student();
		s1.add();
		s1.sub();
		s1.div();
		s1.mul();
		

	}


}
