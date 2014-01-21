public class ComplexePol2 extends ComplexeAbs implements Complexe {
    private double rho;
    private Angle theta;

    public ComplexePol2(double x, double y){
	this.rho = Conversion.rho(x, y);
	this.theta = Conversion.theta(x, y);
    }
    public ComplexePol2(double rho, Angle theta){
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
	return new ComplexePol2(x, y);
    }
    public Complexe creer(double rho, Angle theta){
	return new ComplexePol2(rho, theta);
    }
}