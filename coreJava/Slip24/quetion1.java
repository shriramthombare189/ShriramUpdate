import java.io.*;

class Slip24A{

    public static void main(String args[]) throws IOException{

        FileReader fr = new FileReader("a.txt");

        int c;

        int letter=0;

        int space=0;

        int num=0;

        int other=0;

 

        while ((c=fr.read())!=-1){

          if(Character.isDigit(c)){

            num ++;

          }else if(Character.isLetter(c)){

            letter++;

          }else if(Character.isSpaceChar(c)){

            space++;

          }else{

              other ++;

          }

        }

       System.out.println("Numbers : " + num + "\nLetters : "+letter+"\nSpace : "+space+"\nSpecial Characters : "+other);

        fr.close();

        fw.close();

    }

}