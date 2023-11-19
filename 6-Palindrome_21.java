import java.util.Scanner;

public class Palindrome_21 {
    public static void main(String args[]){
		String str;
		Scanner s=new Scanner(System. in);
		String rev_str="";
		char r;
		int i;
		System. out. println("Enter the string");
		str=s. nextLine();
		for(i=0;i<str.length();i++)
		{
			r=str.charAt(i);
			rev_str=r+rev_str;
		}
			System.out.println("Reversed string:"+rev_str);
		if(str.equals(rev_str))
			System.out.println("This is a Pallindrome");
		else
			System.out.println("This is not pallindrome");
	}
}
