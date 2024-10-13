package Slip3;
public class qution1 {
	static boolean armstrong(int num) {
		int arm=0;
		int n = num;
		while(num!=0) {
			int rem = num%10;
			arm = (rem*rem*rem)+arm;
			num = num/10;
		}
		if(n==arm) {
			return true;
		}
		else {
			return false;
		}
	}

public static void main(String[] arg) {				
				if(armstrong(153)) {
					System.out.println("no is armstrong ");
				}
				else {
					System.out.println("no is not armstrong ");
				}


	}

}
