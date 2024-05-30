package week7.task7;

class Circle implements Movable {
    private int radius;
    private MovablePoint center;

    public Circle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    public MovablePoint getCenter() {
        return center;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return String.format("Circle [radius=%d, center=%s]", radius, center);
    }

}
