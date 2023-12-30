class Main {
    public static void main(String[] args) {
		add(4, 2);
		sub(4, 2);
		mul(4, 2);
		div_quo(4, 2);
		div_rem(4, 2);
    }
	public static void add(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	public static void sub(int n1, int n2) {
		System.out.println(n1 - n2);
	}
	public static void mul(int n1, int n2) {
		System.out.println(n1 * n2);
	}
	public static void div_quo(int n1, int n2) {
		System.out.println(n1 / n2);
	}
	public static void div_rem(int n1, int n2) {
		System.out.println(n1 % n2);
	}
}