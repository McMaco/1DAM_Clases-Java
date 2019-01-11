
public class circulo {
	
	//NUMERO ESTÁTICO
	static double PI = 3.14159265358979323846;
	static int numcirculos = 0;
	
	//ATRIBUTOS
	private int radio;
	
	//CONTRUCTOR
	circulo(){	
		radio = 1;
		numcirculos++;
	}
	
	//CONTRUCTOR
	circulo(int r){
		radio = r;
		numcirculos++;
	}
	
	public int getRadio() {
		return this.radio;
	}
	
	public circulo setRadio(int r) {
		this.radio = r;
		return this;
	}
	
	public static int contador() {
		return numcirculos;
	}
	
	public static void eliminar() {
		if (numcirculos>0) numcirculos--;		
	}
	
	public void getPerimetro() {
		double perimetro = 2 * PI * getRadio();
		System.out.println("El perímetro del círculo es: "+ perimetro);
	}
	
	public void getArea() {
		double area = PI * (getRadio()*getRadio());
		System.out.println("El area del círculo es: "+ area);
	}
}

