import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer number to check ");
		int num = sc.nextInt();
		palindromeIntCheck(num);
		System.out.println("Enter String number to check ");
		String s = sc.next();
		boolean status = palindromeStringCheck(s);
		if(status)
		{
		System.out.println(s+ " is a Palindrome");
		}
		else
		{
			System.out.println(s + " is not a Palindrome");
	}
		}

	static void palindromeIntCheck(int num)
	{
		int rev =0;
		int original = num;
		while(num!=0)
		{
			int n = num%10;
			rev = rev*10 + n;
			num = num/10;
		}
		if(original == rev)
		{
		System.out.println(original + " is a Palindrome");
		}
		else
		{
			System.out.println(original + " is Not a Palindrome");
		}
	}
	static boolean palindromeStringCheck(String s)
	{
		int i = 0;
		int j = s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
