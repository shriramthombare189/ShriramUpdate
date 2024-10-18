class S2A{

	public static void main(String[] args) {
		
		String str = "SHRIRAM THOMBARE";
		
		for(int i = 0 ; i < str.length();i++)
		{
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
				System.out.print(str.charAt(i));
			}
		}

	}

}
