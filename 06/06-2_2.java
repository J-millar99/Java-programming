class Main {
    public static void main(String[] args) {
		for (int i = 1; i <= 100; i++)
		{
			if (primeNum(i))
				System.out.println(i);
		}
    }
	public static boolean primeNum(int num)
	{
		int cnt = 0;

		for (int i = 1; i <= num; i++)
		{
			if (num % i == 0)
				cnt++;
		}
		if (cnt == 2)
			return true;
		else
			return false;
	}
}