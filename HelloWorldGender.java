//import HelloWord.java;

public class HelloWorldGender extends HelloWord
{
	
	boolean gender;
	
	public HelloWorldGender(String name, boolean gender)
	{
		super(name);
	
		this.gender=gender;
	}

	public void setGender (boolean gender)
	{
		this.gender=gender;
	}


	public boolean getGender()
	{
		return gender;
	}

	

	public void print()
	{	
		if (gender==true)
		{System.out.println("Bonjour Melle "+name);}
		else 
		{System.out.println("Bonjour Mr "+name);}

	}
}
