package spring;

public class personelDao 
{
	private String address;
	private String code;
	
	public personelDao() 
	{
	}
	
	public personelDao(String address, String code)
	{
		this.address = address;
		this.code = code;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void save(Object obj)
	{
		System.out.println("saving object "+ obj);
	}
}
