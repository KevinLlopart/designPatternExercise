public class Angle {
    private double theta; // angle en radians (dans [0, 2.PI[)
    
    public Angle(double angleEnRadians) {
	this.theta = angleEnRadians - 2 * Math.PI
	    * Math.floor(angleEnRadians / (2 * Math.PI));
    }
    
    public double getAngle() {
	return this.theta;
    }
    
    public Angle somme(Angle a) {
	return new Angle(a.getAngle() + this.getAngle());
    }
    
    public Angle facteur(double k) {
	return new Angle(k * this.getAngle());
    }
    
    public String toString() {
	return "" + theta;
    }
    
    public boolean equals(Object o){
	if(!(o instanceof Angle)) return false;
	Angle a = (Angle)o;
	return Comparaison.estEgal(this.getAngle(), a.getAngle()); 
    }
}
