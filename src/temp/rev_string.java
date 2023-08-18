package temp;

public class rev_string {

	public static void main(String[] args) 
	{
		String str="akshay";
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			char t=str.charAt(i);
			rev=rev+t;
		}
		System.out.println(rev);
			

	}

}
