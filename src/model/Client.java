
package model;

public class Client {
	
	public enum IdType
	{
		TI,
		
		CC,
		
		PP,
		
		CE,
	}
    
	private String idNumber;
	private IdType idType;
	
	
	public Client(String idNumber, IdType idType)
	{
		this.idNumber = idNumber;
		this.idType = idType;
	}
	
	public String getIdNumber()
	{
		return idNumber;
	}
	
	public IdType getIdType()
	{
		return idType;
	}
}
