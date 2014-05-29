import java.util.concurrent.ArrayBlockingQueue;


public class syncronizedBuffer implements Buffer 
{
	
	private ArrayBlockingQueue<Integer> buffer;
	boolean isEmptyQuee;

	public syncronizedBuffer() 
	{
		buffer = new ArrayBlockingQueue<>(11);
	}

	@Override
	public synchronized void set(int value) throws InterruptedException
	{
		
		buffer.put(value);
		System.out.println("produce writed : "+ buffer);
		
		isEmptyQuee = buffer.isEmpty();
		notifyAll();
	}

	@Override
	public synchronized int get() throws InterruptedException 
	{
		isEmptyQuee = buffer.isEmpty();
		
		while(isEmptyQuee)
		{
			wait();
		}

		Integer itemtaked = buffer.take();
		System.out.println("consumer readed:"+ itemtaked);
		
		return itemtaked;
	}

}
