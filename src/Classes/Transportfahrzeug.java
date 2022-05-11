package Classes;
import java.util.Date;

	public class Transportfahrzeug extends Fahrzeug
	{
		private String typ;
		
		public String getTyp() 
		{
			return typ;
		}


		
		
		
		public Transportfahrzeug(String marke,int abschreibungsDauer,Date kaufdatum,
				double monatlicheKosten, String typ)
		  {
			
				super(marke,abschreibungsDauer,kaufdatum,monatlicheKosten);
				this.typ= typ;
				
		  }
		
		
		
	}



