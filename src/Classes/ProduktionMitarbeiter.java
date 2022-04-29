package Classes;

public class ProduktionMitarbeiter extends Mitarbeiter{
	 private boolean staplerschein;
	 
	 public ProduktionMitarbeiter(int id, String name, boolean staplerschein)
	 {
		 super(id, name);
		 this.staplerschein= staplerschein;
	 }

}
