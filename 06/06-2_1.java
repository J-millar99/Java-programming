class Main {
    public static void main(String[] args) {
		System.out.println(area(4));
		System.out.println(round(2.5));
    }
	public static double area (double r) {
		return (r * r * 3.14);
	}
	public static double round (double r) {
		return (2 * r * 3.14);
	}
}