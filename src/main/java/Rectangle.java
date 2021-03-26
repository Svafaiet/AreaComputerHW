public class Rectangle {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        if (height < 0 || width < 0) {
            throw new IllegalArgumentException("Sides must be positive");
        }
        this.width = width;
        this.height = height;
    }


    public long computeArea() {
        return (long) width * height;
    }

}
