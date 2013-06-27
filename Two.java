import java.util.Scanner;

class Two {
	public static void main(String[] args) {
		Integer a, b;
		Scanner m;
		m = new Scanner( System.in );
		System.out.println("Give me the first number: ");
		String line = m.nextLine();
		a = Integer.parseInt(line);
		System.out.println("Give me the second number: ");
		b = Integer.parseInt( m.nextLine() );
		System.out.println( a + " + " + b + " = " + ( a + b ) );
	}
}
