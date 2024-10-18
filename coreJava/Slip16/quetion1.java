// Sleep Number 16 A java
class S16A {
     static int sum =0;
   static int sum(int n){
        sum = n%10;
        if(n==0){
            return 0;
        }else{
            return sum +sum(n/10);
        }
    } 
    public static void main(String args[]) throws Exception{
       int  n=123;
       int a = sum(n);
       System.out.println("Sum of Digit is : "+a);
    }
}