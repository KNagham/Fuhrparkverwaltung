package Classes;
import java.util.Date;

	public class Transportfahrzeug extends Fahrzeug
	{
		private String typ;
		private double gewicht;
		
		
		public Transportfahrzeug(String marke,int abschreibungsDauer,Date kaufdatum,
				double monatlicheKosten, String typ, double gewicht)
		  {
			
				super(marke,abschreibungsDauer,kaufdatum,monatlicheKosten);
				this.typ= typ;
				this.gewicht= gewicht;
		  }
		
		
	}



