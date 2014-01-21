public class CoupleCarPol extends CoupleCar implements CartesienPolaire {
    public CoupleCarPol(double x, double y){
	super(x, y);
    }
    public CoupleCarPol(double rho, Angle theta){
	super(Conversion.x(rho, theta), Conversion.y(rho, theta));
    }
    public double getRho(){
	return Conversion.rho(this.getX(), this.getY());
    }
    public Angle getTheta(){
	return Conversion.theta(this.getX(), this.getY());
    }

    public boolean equals(Object o){
	if(!(o instanceof CartesienPolaire)) return false;
	CartesienPolaire c = (CartesienPolaire)o;
	return Comparaison.estEgal(this.getX(), c.getX()) 
	    && Comparaison.estEgal(this.getY(), c.getY());
    } 

}