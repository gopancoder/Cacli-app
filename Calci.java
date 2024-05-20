import java.util.Scanner;

interface Calci {
	int add(int a, int b);
}

class CalciImpl implements Calci {
	public int add(int a, int b) {
		return a + b;
	}
}

class CalciDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Calci c = new CalciImpl();
		System.out.println("Sum:" + c.add(a, b));

	}
}