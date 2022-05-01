package Classes;

import java.util.Date;

public class Flurfoerderzeug extends Fahrzeug 
{
	private String wagenKategorie;
	private ProduktionMitarbeiter pm;
	private double maxGewischt;
	
	
	public double getMaxGewischt() {
		return maxGewischt;
	}

	public String getWagenKategorie() 
	{
		return wagenKategorie;
	}

	public ProduktionMitarbeiter getPm() 
	{
		return pm;
	}
	
	public Flurfoerderzeug(String marke,int abschreibungsDauer,Date kaufdatum,
			double monatlicheKosten, String wagen,ProduktionMitarbeiter pm,double maxGewischt)
	{
		super(marke,abschreibungsDauer,kaufdatum,monatlicheKosten);
		this.wagenKategorie= wagen;
		this.pm= pm;
		this.maxGewischt = maxGewischt;
	}

	

}

