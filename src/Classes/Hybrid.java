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
				double monatlicheKosten,Mitarbeiter mitarbeiter, double akkuKapazitaet,
				String akkuLader,String treibstoff)
	{
		super(marke,abschreibungsDauer,kaufdatum,monatlicheKosten,"Hybrid",mitarbeiter);
		this.akkuKapazitaet= akkuKapazitaet;
		this.akkuLader= akkuLader;
		this.treibstoff = treibstoff;
	}

	

}
