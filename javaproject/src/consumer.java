import java.util.Random;


public class consumer implements Runnable
{
	private final Buffer sharedLocation;
	private final Random random = new Random();
	
	public consumer(Buffer sharedLocation) 
	{
		this.sharedLocation = sharedLocation;
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
				int itemget = sharedLocation.get();
				sum += itemget;
				//System.out.println("\tcousumer is reading :"+ itemget);
				//System.out.println("\tsum in consumer: "+ sum);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("total sum in consumer is: "+sum);
	}
}
