public class Polygon {

    //instance variables
    private int sides;
    private double sideLength;

    private String shapeName;

    private double area;
    private double perimeter;

    //default constructor
    public Polygon(){
        sides = 3;
        sideLength = 1;
        shapeName = "";
    }


    //overloaded constructor

    /**
     * Creates a polygon shape object with sides and side length
     *
     * @param s sides of polygon
     * @param sL side length of polygon
     * @param shapeName shape of the polygon
     */
    public Polygon(int s, double sL, String shapeName){
        sides = s;
        sideLength = sL;
        this.shapeName = shapeName;
        //validation check
        if(s < 3 ){

            sides = 3 ;
        }
        if(sL < 1.0){
            sideLength = 1.0;
        }
        if(sL >100.0){
            sideLength = 1.0;
        }
    }

    //accessors
    /**
     *
     * @return the area of the polygon
     */
    public double getArea() {
        return area;
    }

    /**
     *
     * @return the sides of the polygon
     */
    public int getNumSides() {
        return sides;
    }

    /**
     *
     * @return the side length of the polygon
     */
    public double getSideLength() {
        return sideLength;
    }

    /**
     *
     * @return the shape of the polygon
     */
    public String getShapeName() {
        return shapeName;
    }

    //Mutators

    /**
     *
     * @param newSides is the number of sides in a polygon
     */
    public void setNumSides(int newSides) {
        sides = newSides;
    }

    /**
     *
     * @param newSideLength is the number of side length in a polygon
     */
    public void setSideLength(double newSideLength) {
        sideLength = newSideLength;
    }

    /**
     *
     * @param newShapeName is the name of the polygon
     */
    public void setShapeName(String newShapeName) {
        shapeName = newShapeName;
    }


    // Perimeter calculation method called calculatePerimeter

    /**
     * Calculate perimeter to 3 decimal places
     * @return perimeter
     */
    public double calculatePerimeter(){
        perimeter = sides * sideLength;
        return Math.round(perimeter * 1000) / 1000.0;
    }

    //A toString method that will print the name, number of sides, and its perimeter formatted to 3 decimal places
    public String toString()
    {
        return "The name of the polygon is " + shapeName + " it has " + sides + " number of sides, and its perimeter is " + perimeter;
    }
    //Extra credit: Write a method called calculateArea that will find the area of any n-sided polygon to 3 decimal places

    /**
     * Calculate area to 3 decimal places
     * @return area
     */
    public double calculateArea(){
        area = (sides * (sideLength * sideLength)) / (4.0 * Math.tan((Math.PI / sides)));
        return Math.round(area * 1000) / 1000.0;
    }

}
