import java.io.*;
import java.util.Scanner;
class Slip13A{

    public static void main(String args[]){

        String temp=null;

        int i,j,n;

        Scanner dr=new Scanner(System.in);
        try{

            System.out.print("Enter How May Element You Want = ");

            n = dr.nextInt();
            dr.nextLine();

            String name[]= new String[n];

            for(i=0; i<n; i++){

                System.out.print("Enter " + (i+1) + " String = ");

                name[i] = dr.nextLine();

            }

            System.out.print("After Sorting = ");

            for(i=n-1; i>=0; i--){

                System.out.print(name[i] + " ");

            }

        }catch(Exception e){}

    }

}