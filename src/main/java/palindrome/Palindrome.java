package palindrome;

public class Palindrome {
	public static void main(String[] args) {
		String s="RADAT";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("Given String is Palindrome: "+rev);
		}
		else
		{
			System.out.println("Given string is not palindrome: "+ rev);
		}
		
		System.out.println();
	}

	}


