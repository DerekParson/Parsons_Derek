import java.util.Scanner;
public class Lab_06_Ex_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word");
		String input = kb.next();
		for(int i = input.length()-1; i >= 0; i--)
			System.out.println(input.substring(0, i));	
	}
}