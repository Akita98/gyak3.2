
public class AlkHasznalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alkalmazott a;
		a = new Alkalmazott("Kovács János", 150000);
		System.out.println("Adatai: "+a.Adatok());
		a.FizetesEmel(15000);
		System.out.println("Adatai: "+a.Adatok());
		
		a.SetNev ("Kis Béla");
		a.SetFizetes (220000);
		System.out.println("Adatai: "+a.Adatok());
		
	}

}
