public class Rectangle {
        /*
     * Define two public attributes width and height of type int.
     */
    // write your code here

    public final int width;
    public final int heigth;
    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here

    public Rectangle(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here
    public int getArea() {
        return width * heigth;
    }
}
