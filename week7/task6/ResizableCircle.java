package week7.task6;

class ResizableCircle extends Circle implements Resizable {

    ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        double resizeFactor = 1.0 + percent / 100.0; // Този израз добавя 1 към десетичната дроб от процента. Така се получава факторът, с който ще умножим радиуса.
        setRadius(super.radius *= resizeFactor);
    }

    private void setRadius(double newRadius) {
        this.radius = newRadius;
    }
}
