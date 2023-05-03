package javaD2;

public class Rettangolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 10;
		int h = 25;
		int b2 = 7;
		int h2 = 13;
		int[] risultato = stampaRettangolo(b, h);
        System.out.println("Area: " + risultato[0]);
        System.out.println("Perimetro: " + risultato[1]);
        
		int[] risultato2 =  stampaDueRettangoli(b, h, b2, h2);
		System.out.println("Area 2: " + risultato2[1]);
        System.out.println("Perimetro 2: " + risultato2[3]);

        int sommaArea = risultato[0]+risultato2[1];
        int sommaPerimetro = risultato[1]+risultato2[3];
        System.out.println("Somma delle aree: " + sommaArea + ", Somma dei perimetri: " + sommaPerimetro);
    }

	public static int calcolaArea (int b, int h) {
		return (b * h);
	}
	
	public static int calcolaPermimetro (int b, int h) {
		return (b * 2) + (h * 2);
	}
	
	public static int[] stampaRettangolo (int b, int h ) {
		int perimetro= calcolaPermimetro(b, h);
        int area= calcolaArea(b, h);
        int[] valori={area,perimetro};
        return valori;
	}
	
	public static int[] stampaDueRettangoli (int b, int h, int b2, int h2 ) {
		int perimetro= calcolaPermimetro(b, h);
		int perimetro2 = (b2* 2) + (h2 * 2);
        int area= calcolaArea(b, h);
        int area2 = (b2 * h2);
        int[] valori={area, area2, perimetro, perimetro2};
        return valori;
	}


	
	
}
