/*

public MyString(char[] chars);
public char charAt(int index);
public int length();
public MyString substring(int begin, int end);
public MyString toLowerCase();
public MyString toUpperCase();
public boolean equals(MyString s);
public MyString getMyString();
public String toString();	
public static MyString valueOf(int i);


Do not use any function from the String class. The only time you're 
allowed to use the String class is in the toString() method. Even then, 
you may only use the String's constructor, but not the methods.

Make sure to provide a driver class, too, and show the output.
*/
import java.util.*;
public class myDriver{

public static void main(String args[])
        {
			
			char[] my_char ;
			char[] my_charCopy ;
			Scanner my_scanner = new Scanner(System.in);
			System.out.print("Enter your first string : ");
			
			my_char  = my_scanner.next().toCharArray();

			MyString test = new MyString(my_char);
			
			System.out.println("Your string was : " + test.toString());
			
			System.out.println("The character at position 3 is: " + test.charAt(2));

			System.out.print("Enter your second string : ");
			
			my_charCopy  = my_scanner.next().toCharArray();

			MyString test2 = new MyString(my_charCopy);
			
			System.out.println("Your string was : " + test2.toString());
			
			System.out.println("The first three characters of the seconds string is : " + test2.substring(0,3).toString());
			
			System.out.println("Upper case test on first string : " + test.toUpperCase().toString());
			
			System.out.println("Lower case test on second string : " + test2.toLowerCase().toString());

			if(test.equals(test2)){
				System.out.println("The strings are equal.");
			}
				
			else
				System.out.println("The strings are not equal.");

			System.out.println("The valueOf 5 is: " + test2.valueOf(5).toString());

			
			
		}
}