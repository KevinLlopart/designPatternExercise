public class CouplePol implements Polaire {
    private double rho;
    private Angle theta;
    public CouplePol(double rho, Angle theta){
	this.rho = rho;
	this.theta = theta;
    }
    public double getRho(){
	return rho;
    }
    public Angle getTheta(){
	return theta;
    }
    public boolean equals(Object o){
	if(!(o instanceof Polaire)) return false;
	Polaire c = (Polaire)o;
	return Comparaison.estEgal(this.getRho(), c.getRho()) 
	    && (this.getTheta().equals(c.getTheta()));
    } 
    public String toString(){
	return "[" + this.getRho() 
	    + ", " + this.getTheta() + "]";
    }
}

