class Main {
    public static void main(String[] args) {
		String str = "990925-1012999";

		str = str.substring(0, 6).concat(" ").concat("1012999");
		System.err.println(str);
    }
}