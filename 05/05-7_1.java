class Main {
    public static void main(String[] args) {
		for (int i = 2; i < 9; i += 2)
		{
			for (int j = 1; j < i + 1; j++)
				System.out.println(i + " x " + j + " = "+ i * j);
		}		
    }
}