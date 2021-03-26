public class Square implements Shape {
    private int side;

    Square(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Sides must be positive");
        }
        this.setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Sides must be positive");
        }
        this.side = side;
    }

    public long computeArea() {
        return (long) this.getSide() * this.getSide();
    }

}