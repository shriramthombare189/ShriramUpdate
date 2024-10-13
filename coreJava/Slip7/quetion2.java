import java.util.Scanner;

class Num extends Exception{}
class Num1 extends Exception{}


/**
* Abc
*/

class Play {
int pid;
String pname;
int totalrun;
int iningplayed;
int notouttimes;

Play(int a,String b,int c,int d,int e)
{ pid=a;
pname=b;
totalrun=c;
iningplayed=d;
notouttimes=e;}


}
public class Abc {

public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter no of players");
int n=scan.nextInt();
int a1;
String a2;
int a3;
int a4;
int a5;
Play ob[]=new Play[n];
int avg=0;
Play max=new Play(1,"om",2,3,4);

for(int i=0;iavg)
{
avg=ob[i].totalrun/ob[i].iningplayed;
max=ob[i];


}
}

System.out.println("play maximum average is");

System.out.println("id is"+max.pid);
System.out.println("name is"+max.pname);
System.out.println("total run is"+max.totalrun);
System.out.println("inning played is"+max.iningplayed);
System.out.println("not out is"+max.notouttimes);





}
}