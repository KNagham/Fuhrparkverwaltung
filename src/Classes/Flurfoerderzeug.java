package Classes;

import java.util.Date;

public class Flurfoerderzeug extends Fahrzeug 
{
	private String wagenKategorie;
	private ProduktionMitarbeiter produktionMitarbeiter;
	private double maxGewicht;
	private boolean istMotorisiert;
	
	
	public boolean isIstMotorisiert() {
		return istMotorisiert;
	}

	public double getMaxGewicht() {
		return maxGewicht;
	}

	public String getWagenKategorie() 
	{
		return wagenKategorie;
	}

	public ProduktionMitarbeiter getProduktionMitarbeiter() 
	{
		return produktionMitarbeiter;
	}
	
	public Flurfoerderzeug(String marke,int abschreibungsDauer,Date kaufdatum,
			double monatlicheKosten,ProduktionMitarbeiter produktionMitarbeiter,double maxGewicht,boolean istMotorisiert)
	{
		super(marke,abschreibungsDauer,kaufdatum,monatlicheKosten);
		this.wagenKategorie= "Flurfoerderzeug";
		this.produktionMitarbeiter= produktionMitarbeiter;
		this.maxGewicht = maxGewicht;
		this.istMotorisiert = istMotorisiert;
	}

	

}

