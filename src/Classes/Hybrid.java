package Classes;

import java.util.Date;

public class Hybrid extends Firmenwagen
{
	private String akkuLader;
	private double akkuKapazitaet;
	private String treibstoff;
	
	
	public String getTreibstoff() 
	{
		return treibstoff;
	}

	public String getAkkuLader() 
	{
		return akkuLader;
	}

	public double getAkkuKapazitaet() 
	{
		return akkuKapazitaet;
	}
	
	public Hybrid(String marke,int abschreibungsDauer,Date kaufdatum,
				double monatlicheKosten,String wagen,Mitarbeiter mit,
				String lader, double akkuSize,String treibstoff)
	{
		super(marke,abschreibungsDauer,kaufdatum,monatlicheKosten,wagen,mit);
		this.akkuLader= lader;
		this.akkuKapazitaet= akkuSize;
		this.treibstoff = treibstoff;
	}

	

}
