class Main {
    public static void main(String[] args) {
		ByteBase(128);
    }
	public static void ByteBase(int num) {
		if (num / 2 == 0)
			System.out.print(num % 2);
		else
		{
			ByteBase(num / 2);
			System.out.print(num % 2);
		}
	}
}