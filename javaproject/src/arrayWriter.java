
public class arrayWriter implements Runnable 
{
	private final simpleArray simplearray;
	private final int intvalue;
	
	public arrayWriter(int value, simpleArray simplearray) 
	{
		this.intvalue = value;
		this.simplearray = simplearray;
	}

	@Override
	public void run() 
	{
		for(int i=intvalue ; i<intvalue + 3 ; i++)
		{
			simplearray.add(i);
		}
	}
	
}
