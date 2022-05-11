package Classes;

public class ProduktionMitarbeiter extends Mitarbeiter
{
	 private boolean staplerschein;
	 
	 public boolean isStaplerschein()
	 {
			return staplerschein;
	 }
	 
	 public ProduktionMitarbeiter(String name, boolean staplerschein)
	 {
		 super(name);
		 this.staplerschein= staplerschein;
	 }
}
