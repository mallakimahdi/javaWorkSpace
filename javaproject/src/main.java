import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class main
{
	public static void main(String[] args)
	{
		syncronizedBuffer syncBuffer = new syncronizedBuffer();
		
		producer pr = new producer(syncBuffer);
		consumer co = new consumer(syncBuffer);
		
		ExecutorService executor = Executors.newCachedThreadPool();
		
		executor.execute(pr);
		
		executor.execute(co);
		
		executor.shutdown();
		
	}
}
