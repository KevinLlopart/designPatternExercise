public class ComplexeCar2 extends ComplexeAbs implements Complexe {
    private double x;
    private double y;

    public ComplexeCar2(double x, double y){
	this.x = x;
	this.y = y;
    }
    public ComplexeCar2(double rho, Angle theta){
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
	return new ComplexeCar2(x, y);
    }
    public Complexe creer(double rho, Angle theta){
	return new ComplexeCar2(rho, theta);
    }
}