
import java.util.Scanner;

public class Principal {

	public static void main(String [] args) {
		
		int a = 1, b = 1, r = 1, opc = 0;
		double c = 1;
		
		Scanner t = new Scanner(System.in);
		rectangulo uno = null;
		triangulo dos = null;
		circulo tres = null;
		
		do {
			try {
				System.out.println("0.- SALIR");
				System.out.println("1.- CREAR RECTANGULO");
				System.out.println("2.- MODIFICAR RECTANGULO");
				System.out.println("3.- ELIMINAR RECTANGULO");
				System.out.println("4.- CREAR TRIANGULO");
				System.out.println("5.- MODIFICAR TRIANGULO");
				System.out.println("6.- ELIMINAR TRIANGULO");
				System.out.println("7.- CREAR CIRCULO");
				System.out.println("8.- MODIFICAR CIRCULO");
				System.out.println("9.- ELIMINAR CIRCULO");
				System.out.println("10.- MOSTRAR NUMERO DE RECTÁNGULOS, TRIÁNGULOS Y CÍRCULOS");
				System.out.println("11.- MOSTRAR PERIMETRO DE RECTÁNGULOS, TRIÁNGULOS Y CÍRCULOS");
				System.out.println("12.- MOSTRAR AREA DE RECTÁNGULOS, TRIÁNGULOS Y CÍRCULOS");
				System.out.println();
				System.out.print("Introduzca una opción del menú:");
				opc = t.nextInt();
			}
			
			catch(Exception e) {
				t.next();
				opc = 13;
			}
				switch(opc) {
			
					case 0: //SALIR
						System.out.print("                               ");
						System.out.println("--------------------------------");
						System.out.print("                               ");
						System.out.println("GRACIAS POR UTILIZAR EL PROGRAMA");
						System.out.print("                               ");
						System.out.println("  ESPERO QUE HAYAS APRENDIDO");
						System.out.print("                               ");
						System.out.println("--------------------------------");
					break;
					
				 	case 1: //CREAR RECTANGULO
				 		System.out.println("Creacion de un rectángulo");
						try {
							System.out.print("Alto: ");
							a = t.nextInt();
							
							System.out.print("Ancho: ");
							b = t.nextInt();
							
							uno = new rectangulo(a,b);
						}
						
						catch(Exception e) {
							System.out.println("ERROR tipo: "+ e.getMessage());
							e.printStackTrace();
							t.next();
							uno = new rectangulo();
						}
						
						System.out.println("Valor del Alto: "+ uno.getAlto());
						System.out.println("Valor del Ancho: "+ uno.getAncho());
					break;
						
				 	case 2: //MODIFICAR RECTANGULO
				 		if(uno.contador()>0) {
					 		do {	
								try {
									System.out.println("1.- MODIFICAR ALTO");
									System.out.println("2.- MODIFICAR ANCHO");
									opc = t.nextInt();
									
								}
								catch(Exception e) {
									t.next();
									opc = 0;
								}
								
								
							}while((opc<1)||(opc>2));
							
							if (opc==1) {
								do {
									try {
										System.out.println("Nuevo Alto: ");
										a = t.nextInt();
										
										uno = uno.setAlto(a);
									}
									catch(Exception e) {
										t.next();			
									}
								}while(a<=0);
							}
							else {
								do {
									try {
										System.out.println("Nuevo Ancho: ");
										b = t.nextInt();
										
										uno = uno.setAncho(b);
									}
									catch(Exception e) {
										t.next();			
									}
								}while(b<=0);
								
								System.out.println("Valor del Alto: "+ a);
								System.out.println("Valor del Ancho: "+ b);
							}
				 		}
				 		else {
				 			System.out.println("No existe ningun rectángulo");
				 		}
					break;
					
				 	case 3: //ELIMINAR RECTANGULO
				 		if (uno.contador()>0) {
				 			uno.eliminar();
				 			System.out.println("Se ha eliminado un rectángulo");
				 			
				 		}
				 		else {
				 			System.out.println("No existe ningun rectángulo");
				 		}
				 	break;
				 	
				 	case 4: //CREAR TRIANGULO
				 		System.out.println("Creacion de un triángulo");
				 		
				 		try {
				 			System.out.print("Alto: ");
				 			a = t.nextInt();
				 			
							
				 			
				 			System.out.print("Ancho: ");
				 			b = t.nextInt();
				 			
				 			
							do {
								System.out.print("Angulo Alfa (entre 0 y 179): ");
								c = t.nextDouble();
								
							}while((c<0)||(c>179));
			
						dos = new triangulo(a,b,c);
						}
						
						catch(Exception e) {
							System.out.println("ERROR tipo: "+ e.getMessage());
							e.printStackTrace();
							t.next();
							dos = new triangulo();
						}
					 		
						System.out.println("Valor del Alto: "+ dos.getAlto());
						System.out.println("Valor del Ancho: "+ dos.getAncho());
						System.out.println("Valor del Angulo Alfa: "+ dos.getAngulo());
				 	break;
				 	
				 	case 5://MODIFICAR TRIANGULO
				 		if(dos.contador()>0) {
					 		do {	
								try {
									System.out.println("1.- MODIFICAR ALTO");
									System.out.println("2.- MODIFICAR ANCHO");
									System.out.println("3.- MODIFICAR ANGULO ALFA");
									opc = t.nextInt();
									
								}
								catch(Exception e) {
									t.next();
									opc = 0;
								}
								
								
							}while((opc<1)||(opc>3));
							
							if (opc==1) {
								do {
									try {
										System.out.println("Nuevo Alto: ");
										a = t.nextInt();
										
										
										dos = dos.setAlto(a);
									}
									catch(Exception e) {
										t.next();
										a = 0;
									}
								}while(a<=0);
							}
							if (opc==2) {
								do {
									try {
										System.out.println("Nuevo Ancho: ");
										b = t.nextInt();
				
										dos = dos.setAncho(b);
									}
									catch(Exception e) {
										t.next();
										b = 0;
									}
								}while(b<=0);
							}
							else {
								do {
									try {
										System.out.println("Nuevo Angulo (entre 0 y 179): ");
										c = t.nextDouble();
										
										dos = dos.setAngulo(c);
									}
									catch(Exception e) {
										System.out.println("Error de introducción de ángulo");
										t.next();
										c = 180;
									}
								}while((c<0)||(c>179));
					
								System.out.println("Valor del Alto: "+ a);
								System.out.println("Valor del Ancho: "+ b);
								System.out.println("Valor del Angulo: "+ c);
							}
				 		}
				 		else {
				 			System.out.println("No existe ningun triángulo");
				 		}
				 	break;
				 	
				 	case 6://ELIMINAR TRIANGULO
				 		if (dos.contador()>0) {
				 			dos.eliminar();
				 			System.out.println("Se ha eliminado un triángulo");
				 			
				 		}
				 		else {
				 			System.out.println("No existe ningun triángulo");
				 		}
				 		
				 	break;
				 	
				 	case 7://CREAR CIRCULO
				 		System.out.println("Creacion de un circulo");
				 		try {
							System.out.print("Radio: ");
							r = t.nextInt();
			
							tres = new circulo(r);
						}
						
						catch(Exception e) {
							System.out.println("ERROR tipo: "+ e.getMessage());
							e.printStackTrace();
							t.next();
							tres = new circulo();
						}
						
						System.out.println("Valor del Radio: "+ tres.getRadio());
				 		
				 	break;
				 	
				 	case 8://MODIFICAR CIRCULO
				 		if(uno.contador()>0) {
							if (opc==1) {
								try {
									System.out.println("Nuevo Radio: ");
									r = t.nextInt();
									
									tres= tres.setRadio(r);
								}
								catch(Exception e) {
									t.next();			
								}
							}
							else {
								try {
									System.out.println("Nuevo Radio: ");
									c = t.nextInt();
									
									tres = tres.setRadio(r);
								}
								catch(Exception e) {
									t.next();			
								}
								System.out.println("Valor del Radio: "+ r);
							}
				 		}
				 		else {
				 			System.out.println("No existe ningun circulo");
				 		}
					break;
				 	
				 	case 9://ELIMINAR CIRCULO
				 		if (tres.contador()>0) {
				 			tres.eliminar();
				 			System.out.println("Se ha eliminado un círculo");
				 			
				 		}
				 		else {
				 			System.out.println("No existe ningun círculo");
				 		}
					break;
					
				 	case 10://MOSTRAR NUMERO DE RECTANGULOS, TRIANGULOS Y CIRCULOS
				 		System.out.println("El número de rectángulos es: "+ uno.contador());
				 		System.out.println("El número de triángulos es: "+ dos.contador());
				 		System.out.println("El número de círculos es: "+ tres.contador());
					break;
					
				 	case 11://MOSTRAR PERÍMETRO DEL LAS FIGURAS
				 		if (uno.contador()>0){
					 		uno.getPerimetro();
				 		}
				 		else {
				 			System.out.println("No existe ningún rectángulo");
				 		}
				 		if (dos.contador()>0){
					 		dos.getPerimetro();
				 		}
				 		else {
				 			System.out.println("No existe ningún triángulo");
				 		}
				 		if (tres.contador()>0){
					 		tres.getPerimetro();
				 		}
				 		else {
				 			System.out.println("No existe ningún círculo");
				 		}
					break;
					 	
				 	case 12://MOSTRAR AREA DE LAS FIGURAS
				 		if (uno.contador()>0){
					 		uno.getArea();
				 		}
				 		else {
				 			System.out.println("No existe ningún rectángulo");
				 		}
				 		if (dos.contador()>0){
					 		dos.getArea();
				 		}
				 		else {
				 			System.out.println("No existe ningún triángulo");
				 		}
				 		if (tres.contador()>0){
					 		tres.getArea();
				 		}
				 		else {
				 			System.out.println("No existe ningún círculo");
				 		}
					break;
					
				 	default: 
				 		System.out.println("Opción incorrecta");		
				}
			}while(opc!=0);
	}
}
