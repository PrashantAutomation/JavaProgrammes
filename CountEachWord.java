import java.util.Arrays;

public class CountEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "A computer science portal for geeks "; 
	    String word = "portal"; 
	    countOccurences(str, word); 

	}
	
	static void countOccurences(String str, String word)
	{
		String[] a = str.split(" ");
		String b = word;
		int i = 0;
		int count=0;
		while(i<a.length)
		{
			if(word.equals(a[i]))
			{
				count++;
				System.out.println("Matched "+"Occurence is "+count);
				
			}
			i++;
		}
		if(count==0)
		System.out.println("No Match Found");
	}
	
	

}
