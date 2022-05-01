package Classes;
import java.util.Date;

public class Elektromotor extends Firmenwagen
{
	private double akkuKapazitaet;
	private String akkuLader;

	public double getAkkuKapazitaet() 
	{
		return akkuKapazitaet;
	}

	public String getAkkuLader() 
	{
		return akkuLader;
	}

	public Elektromotor(String marke,int abschreibungsDauer,Date kaufdatum,
				double monatlicheKosten,Mitarbeiter mitarbeiter,
				double akkuKapazitaet, String akkuLader)
	{
		super(marke,abschreibungsDauer,kaufdatum,monatlicheKosten,"Elektromotor",mitarbeiter);
		this.akkuKapazitaet= akkuKapazitaet;
		this.akkuLader= akkuLader;
		
	}
}
