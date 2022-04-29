package Classes;

import java.util.Date;

public class Kraftmotor extends Firmenwagen{
	
	private String treibstoff;
	
	public String getTreibstoff() {
		return treibstoff;
	}

	public Kraftmotor(String marke,int abschreibungsDauer,Date kaufdatum,
				double monatlicheKosten,String wagen,Mitarbeiter mit, String treibstoff)
	{
		super(marke,abschreibungsDauer,kaufdatum,monatlicheKosten,wagen,mit);
		this.treibstoff= treibstoff;
	}

}
