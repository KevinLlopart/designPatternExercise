public class ComplexePol1 implements Complexe {
    private double rho;
    private Angle theta;

    public ComplexePol1(double x, double y){
	this.rho = Conversion.rho(x, y);
	this.theta = Conversion.theta(x, y);
    }
    public ComplexePol1(double rho, Angle theta){
	this.rho = rho;
	this.theta = theta;
    }

    public double getX(){
	return Conversion.x(this.getRho(), this.getTheta());
    }
    public double getY(){
	return Conversion.y(this.getRho(), this.getTheta());
    }
    public double getRho(){
	return rho;
    }
    public Angle getTheta(){
	return theta;
    }

    public Complexe creer(double x, double y){
	return new ComplexePol1(x, y);
    }
    public Complexe creer(double rho, Angle theta){
	return new ComplexePol1(rho, theta);
    }

    public Complexe somme(Complexe c){
	return this.creer(this.getX() + c.getX(),
			  this.getY() + c.getY());
    }
    public Complexe produit(Complexe c){
	return this.creer(this.getRho() * c.getRho(),
			  this.getTheta().somme(c.getTheta()));
    }
    
    public boolean equals(Object o){
	if(!(o instanceof Complexe)) return false;
	Complexe c = (Complexe)o;
	return Comparaison.estEgal(this.getRho(), c.getRho()) 
	    && (this.getTheta().equals(c.getTheta()));
    } 
    public String toString(){
	return "[" + this.getRho() 
	    + ", " + this.getTheta() + "]";
    }

}