class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 1;
        }
        System.out.println("MovableCircle объект был создан");
    }

    public String toString() {
        return "MovableCircle radius: " + this.radius + ", center: " + center;
    }

    public void moveUp() {
        this.center.moveUp();
        System.out.println("MovableCircle - moveUp");
    }

    public void moveDown() {
        this.center.moveDown();
        System.out.println("MovableCircle - moveDown");
    }

    public void moveLeft() {
        this.center.moveLeft();
        System.out.println("MovableCircle - moveLeft");
    }

    public void moveRight() {
        this.center.moveRight();
        System.out.println("MovableCircle - moveRight");
    }
}