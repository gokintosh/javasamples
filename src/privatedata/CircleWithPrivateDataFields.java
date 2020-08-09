package privatedata;

public class CircleWithPrivateDataFields {
//    the radius of the circle
    private double radius=1;

//    the number of objects created
    private static int numberOfObjects=0;

//    construct a circle with radius 1
    public CircleWithPrivateDataFields(){
        numberOfObjects++;

    }

//    construct a circle with a specific radius
    public CircleWithPrivateDataFields(double newRadius){
        radius=newRadius;
        numberOfObjects++;
    }
//    Return Radius
    public double getRadius(){
        return radius;
    }
//    set a new radius
    public void setRadius(double newRadius){
        radius=(newRadius>=0)?newRadius:0;
    }
//    return number of objects
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
//    return the area of the circle
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
