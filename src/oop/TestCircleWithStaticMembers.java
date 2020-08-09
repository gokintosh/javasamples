package oop;

public class TestCircleWithStaticMembers {
//    main method
public static void main(String[] args) {
    System.out.println("before creating the objects");
    System.out.println("the number of circle object is "+CircleWithStaticMembers.getNumberOfObjects());


//    Create c1
    CircleWithStaticMembers c1=new CircleWithStaticMembers();
//    display c1 before c2 is created
    System.out.println("After creating c1");
    System.out.println("c1 radius is :"+c1.radius+" number of objects created : "+CircleWithStaticMembers.getNumberOfObjects());
//    create a new circle c2
    CircleWithStaticMembers c2=new CircleWithStaticMembers();


//    modify c1

    c1.radius=9;

//    display c1 and c2 after creating c2
    System.out.println("After creating c1 and c2");
    System.out.println("c1 circle with radius : "+c1.radius+" and number of objects created is : "+CircleWithStaticMembers.getNumberOfObjects());
    System.out.println("c2 circle with radius : "+c2.radius+" and number of objects created is : "+CircleWithStaticMembers.getNumberOfObjects());
}
}
