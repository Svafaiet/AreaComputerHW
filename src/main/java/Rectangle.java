public class Rectangle {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        if (height <= 0 || width <= 0) {
            throw new IllegalArgumentException("Sides must be positive");
        }
        this.setWidth(width);
        this.setHeight(height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public long computeArea() {
        return (long) this.getWidth() * this.getHeight();
    }

}
