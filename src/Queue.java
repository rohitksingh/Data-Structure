public interface Queue {
	
	public void enqueue(Object obj) throws QueueIllegalStateException;
	
	public Object dequeue() throws QueueIllegalStateException;
	
	public int size();
	
	public boolean isEmpty();
	

}
