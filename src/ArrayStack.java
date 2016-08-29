import java.util.Scanner;


public class ArrayStack implements Stack{

	private static final int MAXIMUM_CAPACITY=1000;
	private static final String EMPTY_STACK="Stack Underflow";
	private static final String FULL_STACK="Stack Overflow";
	
	private int count=-1;
	private int CAPACITY;
	Object[] arr;
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		ArrayStack a;
		
		String name=sc.nextLine();
		a=new ArrayStack(name.length());
		for(int i=0;i<name.length();i++)
			a.push(name.charAt(i));
		System.out.println();
		while(!a.isEmpty())
		System.out.print(a.pop());
		
	}
	
	public ArrayStack() {
		arr=new Object[MAXIMUM_CAPACITY];
		CAPACITY=MAXIMUM_CAPACITY;
	}
	public ArrayStack(int size)
	{
		arr=new Object[size];
		CAPACITY=size;
	}

	@Override
	public void push(Object o) throws StackStateException {
		if(size()==CAPACITY)
			throw new StackStateException(FULL_STACK);
		arr[++count]=o;
	}

	@Override
	public Object pop() throws StackStateException {
		if(isEmpty())
			throw new StackStateException(EMPTY_STACK);
		Object value=arr[count];
		arr[count]=null;
		count--;
		return value;
	}

	@Override
	public Object peek() throws StackStateException {
		if(isEmpty())
			throw new StackStateException(EMPTY_STACK);
		return arr[count];
	}

	@Override
	public boolean isEmpty() {
		return size()==0;
	}

	@Override
	public int size() {
		return count+1;
	}
	
	public String toString()
	{
		StringBuilder b=new StringBuilder();
		for(int i=count;i>=0;count--)
			b.append(b+" ");
		return new String(b);
	}
}