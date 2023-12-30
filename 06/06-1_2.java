class Main {
    public static void main(String[] args) {
		abs_sub(2, 4);
    }

	public static void abs_sub(int n1, int n2) {
		if (n1 > n2)
			System.out.println(n1 - n2);
		else
			System.out.println(n2 - n1);
	}
}