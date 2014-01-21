public class CouplePolCar extends CouplePol implements CartesienPolaire {
    public CouplePolCar(double x, double y){
	super(Conversion.rho(x, y), Conversion.theta(x, y));
    }
    public CouplePolCar(double rho, Angle theta){
	super(rho, theta);
    }
    public double getX(){
	return Conversion.x(this.getRho(), this.getTheta());
    }
    public double getY(){
	return Conversion.y(this.getRho(), this.getTheta());
    }

    public boolean equals(Object o){
	if(!(o instanceof CartesienPolaire)) return false;
	CartesienPolaire c = (CartesienPolaire)o;
	return Comparaison.estEgal(this.getRho(), c.getRho()) 
	    && (this.getTheta().equals(c.getTheta()));
    } 
}