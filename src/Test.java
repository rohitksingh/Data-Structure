import java.util.Scanner;

public class Test {

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Test t=new Test();
		System.out.println("Enter a String to be reversed");
		String str=sc.nextLine();
		String rev=t.reverse(str);
		System.out.println("Original String "+str+"\nReverse  String "+rev);
	}
	
	public String reverse(String str)
	{
		int len=str.length();
		ArrayStack stack=new ArrayStack(len);
	
		for(int i=0;i<len;i++)
		{
		   stack.push(str.charAt(i));
		}
		
		StringBuilder b=new StringBuilder();
		while(!stack.isEmpty())
			b.append(stack.pop());
		
		return new String(b);
	}
	
}
