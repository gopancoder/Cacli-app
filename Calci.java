interface Calci {
	int add(int a, int b);
}

class CalciImpl implements Calci {
	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		CalciImpl c = new CalciImpl();
		Sytem.out.println(c.add(5, 7));

	}
}