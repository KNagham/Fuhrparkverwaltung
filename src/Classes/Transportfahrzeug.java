package Classes;
import java.util.Date;

	public class Transportfahrzeug extends Fahrzeug
	{
		private String typ;
		private double gewicht;
		private double maxTon;
		public String getTyp() 
		{
			return typ;
		}


		public double getGewicht() 
		{
			return gewicht;
		}
		
		
		public Transportfahrzeug(String marke,int abschreibungsDauer,Date kaufdatum,
				double monatlicheKosten, String typ, double gewicht,double maxTon)
		  {
			
				super(marke,abschreibungsDauer,kaufdatum,monatlicheKosten);
				this.typ= typ;
				this.gewicht= gewicht;
				this.maxTon = maxTon;
		  }
		
		
	}



