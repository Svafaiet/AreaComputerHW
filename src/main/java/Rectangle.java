public class Rectangle {
    private int width;
    private int length;

    Rectangle(int width, int length){
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Sides must be positive");
        }
        this.width = width;
        this.length = length;
    }

    public long computeArea() {
        return width * length;
    }

}
