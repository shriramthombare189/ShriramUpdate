import java.util.*;

class S18A{

   static void area(int r){
        System.out.println("Area of circal is a : "+(3.14*r*r));
    }
   static void area(int l,int h){
        System.out.println("Area of circal is a : "+(l*h));
    }
    static void area(int l,int h,int d){
        System.out.println("Area of circal is a : "+(l*h*d));
    }
    public static void main(String[] arg){
        area(2);
        area(5,2);
        area(3,5,2);
    }
}