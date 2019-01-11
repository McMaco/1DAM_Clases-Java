


public class triangulo {
	
	//NUMERO ESTÁTICO
	static int numtriangulos = 0;
	
	//ATRIBUTOS
	private int alto;
	private int ancho;
	private double angulo;
	
	//CONTRUCTOR
	triangulo(){	
		alto = 1;
		ancho = 1;
		numtriangulos++;
	}
	
	//CONTRUCTOR
	triangulo(int al, int an, double ang){
		alto = al;
		ancho = an;
		angulo = ang;
		numtriangulos++;
	}
	
	public int getAlto() {
		return this.alto;
	}

	public int getAncho() {
		return this.ancho;
	}
	
	public double getAngulo() {
		return this.angulo;
	}
	
	public triangulo setAlto(int al) {
		this.alto = al;
		return this;
	}
	
	public triangulo setAncho(int an) {
		this.ancho = an;
		return this;
	}
	
	public triangulo setAngulo(double ang) {
		this.angulo = ang;
		return this;
	}
	
	public static int contador() {
		return numtriangulos;
	}
	
	public static void eliminar() {
		if (numtriangulos>0) numtriangulos--;		
	}
	
	public void getPerimetro() {
		double a, b, beta_1, x, y, perimetro;
		double anguloradianes = Math.toRadians(angulo);
		a = alto/Math.sin(anguloradianes);
		beta_1 = angulo;
		x = (a*a)/ancho;
		y = ancho-x;
		double beta_1radianes = Math.toRadians(beta_1);
		b = y/Math.sin(beta_1radianes);
		perimetro = a + b + ancho;
		System.out.println("El perimetro del triángulo es: "+ perimetro);
	}
	
	public void getArea() {
		int area;
		area = (ancho*alto)/2;
		System.out.println("El area del triángulo es: "+ area);
	}
}


