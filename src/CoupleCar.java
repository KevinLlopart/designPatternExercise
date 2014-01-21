public class CoupleCar implements Cartesien {
    private double x;
    private double y;
    public CoupleCar(double x, double y){
	this.x = x;
	this.y = y;
    }
    public double getX(){
	return x;
    }
    public double getY(){
	return y;
    }
    public boolean equals(Object o){
	if(!(o instanceof Cartesien)) return false;
	Cartesien c = (Cartesien)o;
	return Comparaison.estEgal(this.getX(), c.getX()) 
	    && Comparaison.estEgal(this.getY(), c.getY());
    } 
    public String toString(){
	return "(" + this.getX() + ", " + this.getY() + ")";
    }
}