import java.util.Arrays;
import java.util.Random;


public class simpleArray 
{
	private final int[] array;
	private int writeIndex = 0;
	private static final Random random = new Random();
	
	public simpleArray(int size) 
	{
		array = new int[size];
	}
	
	public synchronized void add(int value)
	{
		int position = writeIndex;
		
		try
		{
			Thread.sleep(random.nextInt(500));
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		array[position] = value;
		
		System.out.println("name of thread"+ Thread.currentThread().getName() + " value:" + value + " posiotion:"+ position);
		++writeIndex;
	}
	
	@Override
	public String toString() 
	{
		return "content of simple array "+ Arrays.toString(array);
	}
}
