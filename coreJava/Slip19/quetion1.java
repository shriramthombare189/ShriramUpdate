import java.util.Scanner;

class Slip19A {
    static void fibo() {
        int i,a,b,c,n;
        Scanner scan=new Scanner(System.in);
        try {
            System.out.print("Enter Number : ");
            n = scan.nextInt();
            a = b = 1;
            System.out.print("The Fibonacci sequence: " + a + " " + b);

            for(i=1; i<=n-2; i++){
                c = a + b;
                System.out.print(" "+c);
                a = b;
                b = c;
            }

        } catch (Exception e) {}
      }

    public static void main(String args[]){
        fibo();
    }
}
