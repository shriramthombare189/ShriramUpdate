import java.util.*;

public class Slip16A {

    int sum =0;

    public static void main(String args[]) throws Exception{

        int n;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Number : ");

        n =s.nextInt();

        Slip16A obj = new Slip16A();

        int a = obj.sum_digit(n);

        System.out.println("Sum of Digit is : "+a);

    }

 

    int sum_digit(int n){

        sum = n%10;

        if(n==0){

            return 0;

        }else{

            return sum +sum_digit(n/10);

        }

    } 

}