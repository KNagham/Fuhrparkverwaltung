package Classes;

public class Mitarbeiter
{
	
	private int id;
	private String name;
	
	public int getId() 
	{
		return id;
	}

	public String getName() {
		return name;
	}
	
	public Mitarbeiter(String name)
	{
		MitarbeiterID.incrementId();
		this.id= MitarbeiterID.getId();
		this.name = name;
	}
}
