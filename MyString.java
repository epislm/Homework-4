import java.util.*;
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


Do not use any function f rom the String class. The only time you're 
allowed to use the String class is in the toString() method. Even then, 
you may only use the String's constructor, but not the methods.

Make sure to provide a driver class, too, and show the output.
*/
 public class MyString{
	 
	private char[] myChars;	
	
	public MyString(char[] chars){
		
		 myChars = new char[chars.length];
		
		for(int i= 0;i < chars.length;i++){
		myChars[i] = chars[i]; }
			
		}
	
	public char charAt(int index){
		
		if (index > myChars.length){
			System.out.println("Not enough characters.");
			return 0;
			}
		
		return myChars[index];
		
	}	
	
	public int length(){
		return myChars.length;
	}
	
	public MyString substring(int begin, int end){
		
		int len = end - begin;
		
		char[] copy = new char[len];
	
		
		for (int i = 0;i < len;i++)
		{
			copy[i] = myChars[begin + i];
		}
		
		return new MyString(copy);
	}
	
		public MyString toLowerCase(){
			
		char[] copy = new char[myChars.length];

		for(int i = 0; i < myChars.length;i++){
			copy[i] = Character.toLowerCase(myChars[i]);
		}
	
		return new MyString(copy);

			
			
		}
	public MyString toUpperCase(){
			
		char[] copy = new char[myChars.length];

		for(int i = 0; i < myChars.length;i++){
			copy[i] = Character.toUpperCase(myChars[i]);
		}
	
		return new MyString(copy);

			
			
		}
		
	public boolean equals(MyString s){
		
	int	index = 0;
	
	if (this.myChars.length != s.myChars.length){
		return false;
	}
	for(int i = index;i < s.myChars.length;i++)
	{
		if(s.myChars[i] != this.myChars[i]){
		return false; }
	}
		
		return true;
		
		
	}
	
	public MyString getMyString(){
		
		for(int i = 0; i < myChars.length;i++){
			System.out.print(myChars[i]);
		}
		System.out.println();
		return null;
	}
    
	public String toString(){
		
	return new String(myChars);
		
		
	}
	public static MyString valueOf(int i){
		
		char[] copy = new char[1];
		copy[0] = (char) ('0' + i);
		return new MyString(copy);
		
		
	}

	

 }
	
	 	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
