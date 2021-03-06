import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class Lesson_10
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		System.out.println("list 1 size: " + list1 );
		System.out.println("list 2 size: " + list2 ); 	
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list2.add("a");
		list2.add("b");
		list2.add("c");
		
		System.out.println("List1 with numbers...\n" + list1);
		System.out.println("List2 with letters...\n" + list2);
	
		System.out.println("Length of list1..." + list1.size());
		System.out.println("Length of list2..."+ list2.size());
		
		int number = list1.get(2);
		System.out.println(number);
		
		list1.set(2, 5);
		System.out.println(list1);
		list2.set(0, "x");
		System.out.println(list2);
		
		list1.remove(list1.indexOf(5));
		System.out.println(list1);
		list2.remove(list2.indexOf("x"));
		System.out.println(list2);
		
		String letters = "a b c d e f";
		String[] lets = letters.split(" ");
		
		System.out.println(Arrays.toString(lets));
		Arrays.asList(lets);
		ArrayList<String> letterList = new ArrayList<String>
			(Arrays.asList(lets));
		System.out.println(letterList);
		
		String nums = "1 2 3 4 5 6 7 8 9";
		System.out.println(Integer.parseInt(nums.substring(4,5)));
		
		String[] digits = nums.split(" ");
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int i = 0; i < digits.length; i++)
		{
			numList.add(Integer.parseInt(digits[i]));
		}
		System.out.println(numList);
		
		int output = 0;
		for(int i=0; i<numList.size(); i++)
		{
			output += numList.get(i);
		}
		System.out.println(output);
	}
}