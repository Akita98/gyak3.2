
public class Alkalmazott {
	private String nev;
	private int fizetes;
	
	public Alkalmazott(String Nev, int Fizetes){
		nev = Nev;
		fizetes = Fizetes;
	}
	
	public Alkalmazott(){
		nev = "";
		fizetes = 0;
	}
	
	void FizetesEmel (int novekmeny){
		fizetes += novekmeny;
	}
	String Adatok (){
		String sv = nev + " - "+fizetes;
		return sv;
		}
		void SetNev (String Nev){
		nev = Nev;
		}
		void SetFizetes (int Fizetes){
		fizetes = Fizetes;
		}
	
}
