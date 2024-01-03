class Main {
    public static void main(String[] args) {
		StringBuilder str = new StringBuilder("990225-1012999");

		str.replace(6, 7, " ");
		System.err.println((str.toString()));
    }
}