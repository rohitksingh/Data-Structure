public class ArrayQueue implements Queue{

	private  static final int DEFAULT_CAPACITY=100;
	private  static final String QUEUE_FULL="Queue_Overflow";
	private  static final String QUEUE_EMPTY="Queue_underflow";
	private Object arr[];
	private int capacity;
	private int no_of_elements=0;
	private int firstIndex=0;
	private int lastIndex=0;
	
	public ArrayQueue(int capacity)
	{
		this.capacity=capacity;
		arr=new Object[capacity];
	}
	
	public ArrayQueue()
	{
		capacity=DEFAULT_CAPACITY;
		arr=new Object[capacity];
	}

	@Override
	public void enqueue(Object obj) throws QueueIllegalStateException {
		if(size()==capacity)
			throw new QueueIllegalStateException(QUEUE_FULL);
		else
		{
			if(!isEmpty())
			{
				lastIndex=nextIndex(lastIndex);
			}
			arr[lastIndex]=obj;
			no_of_elements++;
		}
	}

	@Override
	public Object dequeue() throws QueueIllegalStateException {
		if(isEmpty())
			throw new QueueIllegalStateException(QUEUE_EMPTY);
		else
		{
			Object returnObj=arr[firstIndex];
			arr[firstIndex]=null;
			no_of_elements--;
			if(!isEmpty())
			firstIndex=nextIndex(firstIndex);
			
			return returnObj;
		}
	}

	@Override
	public int size() {
		
		return no_of_elements;
	}

	@Override
	public boolean isEmpty() {
		return no_of_elements==0;
	}
	
	public String toString()
	{
		StringBuilder sb=new StringBuilder("[");
		if(firstIndex<=lastIndex)
		{
			for(int i=firstIndex;i<=lastIndex;i++)
			{
				System.out.println("First");
				sb.append(arr[i]+" ");
			}
		}
		else
		{
			System.out.println("Second");
			for(int i=firstIndex;i<capacity;i++)
			{
				sb.append(arr[i]+" ");
			}
			for(int i=0;i<=lastIndex;i++)
			{
				sb.append(arr[i]+" ");
			}
		}
		sb.append("]");
		
		return new String(sb);
	}
	
	private int nextIndex(int index)
	{
		return (index+1)%capacity;
	}
	
}