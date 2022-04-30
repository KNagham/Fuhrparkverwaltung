package Classes;

public class ENUMS {
	enum HasSchein{
		JA{
	        @Override
	        public String toString() 
	        {
	            return "1. Hat schein";
	        }
	       },
	        
		NEIN{
	    	   @Override
	    	   public String toString()
	    	   {
	    		   return "2. Hat kein Schein";
	    	   }
	       }
	}
}
