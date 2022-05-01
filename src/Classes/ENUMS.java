package Classes;

public class ENUMS {
	enum HasSchein{
		JA{
	        @Override
	        public String toString() 
	        {
	            return "Hat schein";
	        }
	       },
	        
		NEIN{
	    	   @Override
	    	   public String toString()
	    	   {
	    		   return "Hat kein Schein";
	    	   }
	       }
	}
}
