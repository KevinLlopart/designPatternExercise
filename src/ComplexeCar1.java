public class ComplexeCar1 implements Complexe {
    private double x;
    private double y;

    public ComplexeCar1(double x, double y){
	this.x = x;
	this.y = y;
    }
    public ComplexeCar1(double rho, Angle theta){
	this.x = Conversion.x(rho, theta);
	this.y = Conversion.y(rho, theta);
    }

    public double getX(){
	return x;
    }
    public double getY(){
	return y;
    }
    public double getRho(){
	return Conversion.rho(this.getX(), this.getY());
    }
    public Angle getTheta(){
	return Conversion.theta(this.getX(), this.getY());
    }

    public Complexe creer(double x, double y){
	return new ComplexeCar1(x, y);
    }
    public Complexe creer(double rho, Angle theta){
	return new ComplexeCar1(rho, theta);
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