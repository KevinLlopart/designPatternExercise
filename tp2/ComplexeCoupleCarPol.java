public class ComplexeCoupleCarPol extends CoupleCarPol implements Complexe {
    public ComplexeCoupleCarPol(double x, double y){
	super(x, y);
    }
    public ComplexeCoupleCarPol(double rho, Angle theta){
	super(rho, theta);
    }

    public Complexe creer(double x, double y){
	return new ComplexeCoupleCarPol(x, y);
    }
    public Complexe creer(double rho, Angle theta){
	return new ComplexeCoupleCarPol(rho, theta);
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
    
}
