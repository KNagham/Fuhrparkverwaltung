package Classes;

import java.util.Date;

public class Flurfoerderzeug extends Fahrzeug 
{
	private String wagenKategorie;
	private ProduktionMitarbeiter pm;
	private double maxGewischt;
	private boolean istMotorisiert;
	
	
	public boolean isIstMotorisiert() {
		return istMotorisiert;
	}

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
			double monatlicheKosten,ProduktionMitarbeiter pm,double maxGewischt,boolean istMotorisiert)
	{
		super(marke,abschreibungsDauer,kaufdatum,monatlicheKosten);
		this.wagenKategorie= "Flurfoerderzeug";
		this.pm= pm;
		this.maxGewischt = maxGewischt;
		this.istMotorisiert = istMotorisiert;
	}

	

}

