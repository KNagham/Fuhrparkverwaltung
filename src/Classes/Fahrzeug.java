package Classes;
import java.util.Date;

public abstract class Fahrzeug {

	private String marke;
	private int abschreibungsdauer;
	private Date kaufdatum;
	private double monatlicheKosten;
	
	public Fahrzeug(String marke, int abschreibungsDauer, Date kaufdatum, double monatlicheKosten)
	{
		this.marke= marke;
		this.abschreibungsdauer= abschreibungsDauer;
		this.kaufdatum = kaufdatum;
		this.monatlicheKosten= monatlicheKosten;
	}
}
