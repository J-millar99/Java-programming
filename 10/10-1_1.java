class Accumulator {
	static int sum = 0;
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			Accumloator.add(i);
		Accumulator.showResult();
	}
	static void add(int i)
	{
		sum += i;
	}
	static void showResult()
	{
		System.out.println("총 합: " + sum)
	}
}