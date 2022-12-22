class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        System.out.println("\nMovablePoint объект был создан");
    }

    public String toString() {
        return "MovablePoint координаты - x: " + this.x + ", y: " + this.y + ", xSpeed: " + this.xSpeed + ", ySpeed: " + this.ySpeed;
    }

    public void moveUp() {
        this.y += this.ySpeed;
        System.out.println("MovablePoint объект moveUp со скоростью " + this.ySpeed);
    }

    public void moveDown() {
        this.y -= this.ySpeed;
        System.out.println("MovablePoint объект moveDown со скоростью " + this.ySpeed);
    }

    public void moveLeft() {
        this.x -= this.xSpeed;
        System.out.println("MovablePoint объект moveLeft со скоростью " + this.xSpeed);
    }
    
    public void moveRight() {
        this.x += this.xSpeed;
        System.out.println("MovablePoint объект moveRight со скоростью " + this.xSpeed);
    }
}