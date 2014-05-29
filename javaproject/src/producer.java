import java.util.Random;


public class producer implements Runnable 
{
	
	private final Buffer sharedBuffer;
	private static final Random random = new Random();
	
	public producer(Buffer sharedBuffer) 
	{
		this.sharedBuffer = sharedBuffer;
	}

	@Override
	public void run() 
	{
		int sum = 0;
		
		for(int i=0 ; i<=10 ; i++)
		{
			try 
			{
				Thread.sleep(random.nextInt(3000));
				
				sharedBuffer.set(i);
				sum += i;
				//System.out.println("\tsum in producer : "+sum);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("total sum in producer is: "+sum);
	}

}
