public class Comparaison {
    public static double precision = 1E-15; 
    public static boolean estEgal(double x, double y){
	return Math.abs(x -y) < precision;
    }
}