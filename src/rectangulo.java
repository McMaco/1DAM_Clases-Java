
public class rectangulo {
	
	//NUMERO ESTÁTICO
	static int numrectangulos = 0;
	
	//ATRIBUTOS
	private int alto;
	private int ancho;
	
	//CONTRUCTOR
	rectangulo(){	
		alto = 1;
		ancho = 1;
		numrectangulos++;
	}
	
	//CONTRUCTOR
	rectangulo(int al, int an){
		alto = al;
		ancho = an;
		numrectangulos++;
	}
	
	public int getAlto() {
		return this.alto;
	}

	public int getAncho() {
		return this.ancho;
	}
	
	
	public rectangulo setAlto(int al) {
		this.alto = al;
		return this;
	}
	
	public rectangulo setAncho(int an) {
		this.ancho = an;
		return this;
	}
	
	public static int contador() {
		return numrectangulos;
	}
	
	public static void eliminar() {
		if (numrectangulos>0) numrectangulos--;		
	}
	
	public void getArea() {
		int area = getAlto() * getAncho();
		System.out.println("El perímetro del rectángulo es: "+ area);
	}
	
	public void getPerimetro() {
		int perimetro = (getAlto() * 2) + (getAncho() * 2);
		System.out.println("El perímetro del rectángulo es: "+ perimetro);
	}
}
