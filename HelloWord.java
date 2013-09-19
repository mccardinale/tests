

public class HelloWord 
{
	protected String name;

	public HelloWord(String name)
	{
		this.name=name;
	}

	public void setName(String name)
	{
		this.name=name;	
	}

	public String getName()
	{
		return name;
	}


	

	public void print()
	{
		System.out.println("hello "+name);
	}
}
