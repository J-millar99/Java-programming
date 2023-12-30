class Main {
    public static void main(String[] args) {
		System.out.println(MyPow(3));
    }
	public static int MyPow(int n)
	{
		if (n == 1)
			return 2;
		else
			return 2 * (MyPow(n - 1));
	}
}
