interface Calci {
	int add(int a, int b);
}

class CalciImpl implements Calci {
	public int add(int a, int b) {
		return a + b;
	}
}