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
				double monatlicheKosten,String wagen,Mitarbeiter mit,
				double akkuSize, String lader)
	{
		super(marke,abschreibungsDauer,kaufdatum,monatlicheKosten,wagen,mit);
		this.akkuKapazitaet= akkuSize;
		this.akkuLader= lader;
		
	}
}
