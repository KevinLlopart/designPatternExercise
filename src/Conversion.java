public class Conversion {
	/* Fonctions utiles */
	/*
	 * Conversions cartesien <-> polaire
	 */
	public static double x(double rho, Angle theta){
	    return rho * Math.cos(theta.getAngle());
	  }

	public static double y(double rho, Angle theta){
	    return rho * Math.sin(theta.getAngle());
	  }

	public static double rho(double x, double y){
	    return Math.sqrt(x*x + y*y);
	  }

	public static Angle theta(double x, double y){
	    return new Angle(Math.atan2(y, x));  
	  }

}
