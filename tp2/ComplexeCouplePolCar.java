public class ComplexeCouplePolCar extends CouplePolCar implements Complexe {
    public ComplexeCouplePolCar(double x, double y){
	super(x, y);
    }
    public ComplexeCouplePolCar(double rho, Angle theta){
	super(rho, theta);
    }

    public Complexe creer(double x, double y){
	return new ComplexeCouplePolCar(x, y);
    }
    public Complexe creer(double rho, Angle theta){
	return new ComplexeCouplePolCar(rho, theta);
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
    
}