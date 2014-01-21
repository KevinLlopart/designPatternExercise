public class ComplexeCarPol implements Complexe {
    private CartesienPolaire c;
    public ComplexeCarPol(double x, double y){
	c = new CoupleCarPol(x, y);
    }
    public ComplexeCarPol(double rho, Angle theta){
	c = new CouplePolCar(rho, theta);
    }
    public double getX(){
	return c.getX();
    }
    public double getY(){
	return c.getY();
    }
    public double getRho(){
	return c.getRho();
    }
    public Angle getTheta(){
	return c.getTheta();
    }

    public Complexe creer(double x, double y){
	return new ComplexeCarPol(x, y);
    }
    public Complexe creer(double rho, Angle theta){
	return new ComplexeCarPol(rho, theta);
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
	return Comparaison.estEgal(this.getX(), c.getX()) 
	    && Comparaison.estEgal(this.getY(), c.getY());
    } 
    public String toString(){
	return "(" + this.getX() + ", " + this.getY() + ")";
    }
}