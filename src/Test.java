public class Test {

    private static int score = 0;
    private static int total = 0;

    public static void main(String[] args){
	Complexe fab = new ComplexeCar1(0, 0);
	tester(fab);
	fab = new ComplexePol1(0, 0);
	tester(fab);
	fab = new ComplexeCarPol(0, 0);
	tester(fab);
	fab = new ComplexeCoupleCarPol(0, 0);
	tester(fab);
	fab = new ComplexeCouplePolCar(0, 0);
	tester(fab);
	fab = new ComplexeCar2(0, 0);
	tester(fab);
	fab = new ComplexePol2(0, 0);
	tester(fab);
	System.out.println("-----------------------------------------------------------");
	System.out.println("Score final : " + score + " / " + total);
    }

    private static void tester(Complexe fab){
	Complexe a = fab.creer(1,-1);
	testerCoordonnees(a, 1.0, -1.0, Math.sqrt(2.0), (7.0 * Math.PI / 4.0));

	Complexe b = fab.creer(2, new Angle(Math.PI/2.0));
	testerCoordonnees(b, 0.0, 2.0, 2.0, (Math.PI / 2.0));

	Complexe c = a.somme(b);
	testerEgalite(c, fab.creer(1.0, 1.0));
	testerCoordonnees(c, 1.0, 1.0, Math.sqrt(2.0), Math.PI/ 4.0);

	Complexe d = a.produit(c);
	testerEgalite(d, fab.creer(2.0, 0.0));
	testerCoordonnees(d, 2.0, 0.0, 2.0, 0.0);
    }

    private static void testerCoordonnees(Complexe c, 
					  double x, double y,
					  double rho, double theta){
	total++;
	if(Comparaison.estEgal(c.getX(), x)){
	    score++;
	}else{
	    System.out.println("-----------------------------------------------------------");
	    System.out.println("Erreur pour le complexe " + c + " : " + c.getClass());
	    System.out.println("x = " + c.getX() + " au lieu de " + x);
	}
	total++;
	if(Comparaison.estEgal(c.getY(), y)){
	    score++;
	}else{
	    System.out.println("-----------------------------------------------------------");
	    System.out.println("Erreur pour le complexe " + c + " : " + c.getClass());
	    System.out.println("y = " + c.getY() + " au lieu de " + y);
	}
	total++;
	if(Comparaison.estEgal(c.getRho(), rho)){
	    score++;
	}else{
	    System.out.println("-----------------------------------------------------------");
	    System.out.println("Erreur pour le complexe " + c + " : " + c.getClass());
	    System.out.println("rho = " + c.getRho() + " au lieu de " + rho);
	}
	total++;
	if(Comparaison.estEgal(c.getTheta().getAngle(), theta)){
	    score++;
	}else{
	    System.out.println("-----------------------------------------------------------");
	    System.out.println("Erreur pour le complexe " + c + " : " + c.getClass());
	    System.out.println("theta = " + c.getTheta().getAngle() + " au lieu de " + theta);
	}

    }

    private static void testerEgalite(Complexe c1, Complexe c2){
	total++;
	if(c1.equals(c2)){
	    score++;
	}else{
	    System.out.println("-----------------------------------------------------------");
	    System.out.println("Erreur pour le test d'egalite : " 
			       + c1 + " : " + c1.getClass() 
			       + " egal a " + c2 + " : " + c2.getClass() );
	}
    }

}