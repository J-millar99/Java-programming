class Main {
    public static void main(String[] args) {
		int n1 = ((25 * 5) + (36 / 4) - 72) * 5;
		int n2 = ((25 * 5) + (36 - 4) + 71) / 4;
		int n3 = (123 / 4) * 2;

		boolean result;
		result = (n1 > n2 && n2 > n3);
		System.out.println(result);
    }
}
