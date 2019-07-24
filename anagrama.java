
public class anagram {


	// Comprobación de terminación temprana, si las cadenas son de longitudes
	// desiguales,entonces no pueden ser anagramas
public static boolean Anagrama(String cadena1, String cadena2){ 

    if (cadena1.length() != cadena2.length()) { 
     return false; 
    } 
    cadena1=cadena1.toLowerCase(); 
    cadena2=cadena2.toLowerCase(); 
    char[] c1 = cadena1.toCharArray(); 
    char[] c2 = cadena2.toCharArray(); 
    Arrays.sort(c1); 
    Arrays.sort(c2); 
    String sc1 = new String(c1); 
    String sc2 = new String(c2); 
    return sc1.equals(sc2); 
    
} 
}