class Main {
    public static void main(String[] args) {
		int i = 1;
		int sum = 0;

		while (true)
		{
			if (i % 2 != 0)
				sum += i;
			if (sum > 1000)
				break;
			i++;
		}
		System.out.println(i + "번째에서 " + sum);
    }
}