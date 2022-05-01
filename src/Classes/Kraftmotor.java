package Classes;

import java.util.Date;

public class Kraftmotor extends Firmenwagen
{
	
	private String treibstoff;
	
	public String getTreibstoff() 
	{
		return treibstoff;
	}

	public Kraftmotor(String marke,int abschreibungsDauer,Date kaufdatum,
				double monatlicheKosten,Mitarbeiter mitarbeiter, String treibstoff)
	{
		super(marke,abschreibungsDauer,kaufdatum,monatlicheKosten,"Kraftmotor",mitarbeiter);
		this.treibstoff= treibstoff;
	}

}
