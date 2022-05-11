package Classes;
import java.util.Date;

public abstract class Fahrzeug 
{
	private String marke;
	private int abschreibungsdauer;
	private Date kaufdatum;
	private double monatlicheKosten;
	
	public String getMarke() 
	{
		return marke;
	}

	public int getAbschreibungsdauer() 
	{
		return abschreibungsdauer;
	}

	public Date getKaufdatum() 
	{
		return kaufdatum;
	}

	public double getMonatlicheKosten() 
	{
		return monatlicheKosten;
	}
	
	public Fahrzeug(String marke, int abschreibungsDauer, Date kaufdatum, double monatlicheKosten)
	{
		this.marke= marke;
		this.abschreibungsdauer= abschreibungsDauer;
		this.kaufdatum = kaufdatum;
		this.monatlicheKosten= monatlicheKosten;
	}

	
}
