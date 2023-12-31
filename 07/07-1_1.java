class Main {
    public static void main(String[] args) {
		Triangle tri = new Triangle();
		tri.getWidth(4);
		tri.getHeight(5);
		System.out.println(tri.getArea());
    }
}

class Triangle {
	double width, height;

	public Triangle() {
		width = 0;
		height = 0;
	}

	public void getWidth(double in_width) {
		width = in_width;
	}

	public void getHeight(double in_height) {
		height = in_height;
	}

	public double getArea() {
		return (width * height / 2);
	}
}