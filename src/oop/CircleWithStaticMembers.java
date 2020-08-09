package oop;

public class CircleWithStaticMembers {
//    the radius of the circle
    double radius;
    static int numberOfObjects=0;

//    construct a circle with radius 1
    CircleWithStaticMembers(){
        radius=1;
        numberOfObjects++;
    }
    CircleWithStaticMembers(double newRadius){
        radius=newRadius;
        numberOfObjects++;

    }
//    return numberOfObjects
    static int getNumberOfObjects(){
        return numberOfObjects;
    }
//    return area of circle
    double getArea(){
        return radius*radius*Math.PI;
    }
}
