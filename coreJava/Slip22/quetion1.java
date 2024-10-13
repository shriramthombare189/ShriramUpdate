import java.util.Scanner;
public class Slip22A {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scan.nextInt();

        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " : " + factorial);
    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    } 
}
