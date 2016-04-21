package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		String resultat="";
		for(int i=0;i<Integer.valueOf(arabe); i++){
			resultat = resultat +"I";
		}
		return resultat;
	}
}