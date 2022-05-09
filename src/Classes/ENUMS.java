package Classes;

public class ENUMS {
	enum HasSchein
	{
		JA{
	        @Override
	        public String toString() 
	        {
	            return "Hat einen Stablerschein";
	        }
	       },
	        
		NEIN{
	    	   @Override
	    	   public String toString()
	    	   {
	    		   return "Hat keinen Stablerschein";
	    	   }
	       }
	}
	
	enum TransportTyp
	{
		KLEIN
		{
			@Override
			public String toString()
			{
				return "Kleinster < 3,5t";
			}
		},
		LEICHT_1
		{
			@Override
			public String toString()
			{
				return "Leichte LKW 3,5 bis 7,5t";
			}
		},
		LEICHT_2
		{
			@Override
			public String toString()
			{
				return "Leichte LKW 7,5 bis 12t";
			}
		},
		MITTEL
		{
			@Override
			public String toString()
			{
				return "Leichte LKW bis 18t";
			}
		}
		
	}
	
	enum ElektromotorAkkuLader
	{
		SCHUKO,
		TYP2,
		CCS,
		CHADEMO
	}
	enum KraftmotorTreibstoff
	{
		AUTOGAS,
		BENZIN,
		DIESEL
	}
}
