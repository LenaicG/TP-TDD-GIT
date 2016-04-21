package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		String resultat="";
		int valeur=Integer.valueOf(arabe);
		if(valeur>=10){
			resultat= resultat+"X";
			valeur= valeur-10;
		}
		if(valeur==9){
			return "IX";
		}
		if(valeur>=5){
			resultat="V";
			valeur= valeur-5;
		}
		if(valeur==4){
			return "IV";
		}
		if(valeur<4){
		for(int i=0;i<valeur;i++)	{	
			resultat = resultat +"I";
		
			}
		}
		return resultat;
	}

}