public class Beispielklasse{

    //Methoden
    public static double flaecheRechteck(double a, double b){
        double flaeche;
        flaeche = a*b;
        return flaeche;
    }
    
    public void aufgabe1(){
        System.out.println(flaecheRechteck(2.0,3.0));
        System.out.println(flaecheRechteck(2.3,2.4));
        System.out.println(flaecheRechteck(3.0,3.0));
        
    }    
    
    public double flaecheRechtwinkligesDreieck(double a, double b){    
        return 0.5*a*b;
    }    
    
    public double flaecheKreis(double r){    
        double f;
        f = r*r * Math.PI;
        return f;        
    }    
    
    public double volumenQuader(double a, double b, double c){    
        return a*b*c;
                
    }    
    
    public void aufgabe2(){
        System.out.println(flaecheRechtwinkligesDreieck(3.0,5.0));
        System.out.println(flaecheKreis(5.0));
        System.out.println(volumenQuader(2.0,2.0,5.0));
    } 
    
}
