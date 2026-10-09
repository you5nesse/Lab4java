package Complexe;

public class TestComplexe {
public static void main(String[] args) {
	Complexe c1 = new Complexe(2,2) ; // Création du nombre complexe 2 + 2i 
	Complexe c2 = new Complexe(-3,4) ;  // Création du nombre complexe -3 + 4i 
	Complexe c3, c4 ; 
	c3 = c1.plus( c2 ) ; 
	c4 = c1.moins( c2) ; 
	System.out.println( "c1 + c2 = " + c3 ) ; 
	System.out.println( "c1 - c2 = " + c4 ) ;  
	
}

}
