import java.io.*;
class Slip26A{
    public static void main(String args[]) throws IOException{
        char ch;
        FileReader fr = new FileReader("a.txt");
        int c;
        while ((c=fr.read())!=-1){
            ch=(char)c;
            if(Character.isDigit(ch)==false && (Character.isSpaceChar(c)==false)){
                System.out.println("ASCII "+ch+" : "+ c);
            }
        }
        fr.close();
    }
}