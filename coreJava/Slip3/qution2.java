
import java.util.Scanner;
 
abstract class Shape{
    int a,b;
    Shape(int x, int y){
        a = x;
        b = y;
    }
    abstract double area();
    abstract double volume();
}
class Cone extends Shape{
    Cone(int x, int y){
        super(x,y);
    }
    double area(){
        return (a*b*3.14);
    }
    double volume(){
        return (3.14*a*a*b);
    }
}
class Cylinder extends Shape{
    Cylinder(int x, int y){
        super(x,y);
    }
    double area(){
        return (2*3.14*a*b*3.14*a*b);
    }
    double volume(){
        return (3.14*a*a*b);
    }
}
 
class Slip3B{
    public static void main(String args[]) throws Exception{
        int r,h,s;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Radius, Height and Side Values : ");
        r = scan.nextInt();
        h = scan.nextInt();
        s = scan.nextInt();
        Shape s1;
        Cone c1 = new Cone(r,s);
        s1=c1;
            System.out.println("Area of Cone  is : " + s1.area());
            System.out.println("Volume of Cone is : " +s1.volume());
        Cylinder cy = new Cylinder(r,h);
        s1 =cy;
            System.out.println("Area of Cylinder  is : " + s1.area());
            System.out.println("Area of Cylinder  is : " + s1.volume());
    }
}
