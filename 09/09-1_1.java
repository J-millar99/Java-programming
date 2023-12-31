class Point {
	int xPos, yPos;
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public void showPointInfo() {
		System.out.println("[" + xPos + ", " + yPos + "]");
	}
}

class Circle {
	Point oPoint;
	double radius;
	public Circle(int x, int y, double r) {
		oPoint = new Point(x, y);
		radius = r;
	}

	public void showCircleInfo() {
		System.out.print("원의 중심: ");
		oPoint.showPointInfo();
		System.out.println("원의 반지름: " + radius);
	}
}

class Main {
	public static void main(String[] args) {
		Circle c = new Circle(2, 2, 4);
		c.showCircleInfo();
	}
}