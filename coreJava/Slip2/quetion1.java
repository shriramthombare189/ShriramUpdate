package Slip2;

public class quetion1 {

	public static void main(String[] args) {
		
		String str = "SANDESH GAIKWAD";
		
		for(int i = 0 ; i < str.length();i++)
		{
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
				System.out.println(str.charAt(i));
			}
		}

	}

}
