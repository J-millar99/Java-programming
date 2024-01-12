class Point {
    private int xPos;
    private int yPos;
    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }
    public boolean equals(Point obj) {
        if (this.xPos == obj.xPos && this.yPos == obj.yPos)
            return true;
        else
            return false;
    }
}

class Rectangle {
    private Point upperLeft;
    private Point lowerRight;
    public Rectangle(int x1, int y1, int x2, int y2) {
        upperLeft = new Point(x1, y1);
        lowerRight = new Point(x2, y2);
    }
    public boolean equals(Rectangle obj) {
        if (upperLeft.equals(obj.upperLeft) && lowerRight.equals(obj.lowerRight))
            return true;
        else
            return false;
    }
}

class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(2, 3);

        if (p1.equals(p2))
            System.out.println("ok");
        else
            System.out.println("no");
        if (p2.equals(p3))
            System.out.println("ok");
        else
            System.out.println("no");

        Rectangle r1 = new Rectangle(1, 2, 3, 4);
        Rectangle r2 = new Rectangle(1, 2, 3, 4);
        Rectangle r3 = new Rectangle(1, 3, 2, 4);

        if (r1.equals(r2))
            System.out.println("ok");
        else
            System.out.println("no");
        if (r2.equals(r3))
            System.out.println("ok");
        else
            System.out.println("no");
    }
}