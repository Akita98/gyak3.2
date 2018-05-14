
public class SzemelyTti {
	private String nev;
	private int testomeg;
	private double magassag;
	
	public SzemelyTti(String Nev, int Testomeg, double Magassag){
		nev = Nev;
		testomeg = Testomeg;
		magassag = Magassag;
		
	}
	double Tti(){
		double tti = 0;
		tti = testomeg / (magassag*magassag);
		return tti;
	}
	String Jellemzo(){
		String sz = "normál";
		double tti = Tti();
		if (tti<20) sz ="Sovány";
		if (tti>30) sz="Dagadt";
		return sz;
	}
	String Adatok(){
	return nev+"-"+testomeg+"kg,"+magassag+"m, alkalt: "+Jellemzo();
	}
}
