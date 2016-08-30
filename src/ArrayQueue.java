public class ArrayQueue implements Queue{

	private  static final int DEFAULT_CAPACITY=100;
	private  static final String QUEUE_FULL="Queue_Overflow";
	private  static final String QUEUE_EMPTY="Queue_underflow";
	
	private int arr[];
	private int capacity;
	private int no_of_elements=0;
	
	public ArrayQueue(int capacity)
	{
		this.capacity=capacity;
		arr=new int[capacity];
	}
	
	public ArrayQueue()
	{
		capacity=DEFAULT_CAPACITY;
		arr=new int[capacity];
	}

	@Override
	public void enqueue(Object obj) throws QueueIllegalStateException {
		if(size()==capacity)
			throw new QueueIllegalStateException(QUEUE_FULL);
		else
		{
			
		}
	}

	@Override
	public Object dequeue() throws QueueIllegalStateException {
		if(isEmpty())
			throw new QueueIllegalStateException(QUEUE_EMPTY);
		else
		{
			
		}
		return null;
	}

	@Override
	public int size() {
		
		return no_of_elements;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return no_of_elements==0;
	}

}

