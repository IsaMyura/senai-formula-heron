import java.util.Scanner;

//IF 
//AND &&
//OR ||
//IGUAL ==
//DIFERENTE !=

class CalculoIF {
  
	public static void main(String args[]){  
   
    		Scanner teclado = new Scanner(System.in);
    
    		int x, y, z, p, cp;
			String tipo = "Isosceles";
			String lado = "todos os lados tem a mesma medida";
			Double area;
			
			System.out.print("Insira a medida do primeiro lado");
		    x = teclado.nextInt();
			
			System.out.print("Insira a medida do segundo lado");
		    y = teclado.nextInt();
			
			System.out.print("Insira a medida do terceiro lado");
		    z = teclado.nextInt();
			
		    if ( x < 1  ||  y < 1 || z < 1 ) {
				System.out.printf("ERROR!!  favor inserir uma medida maior que zero");
				 System.exit(0);
			}
				
			
			if ( x == y && y == z && z == x) {
				tipo = "Equilatero";
			}
			
			if ( x != y && y != z && z != x) {
				tipo = "Escaleno";
			}
			
			//calculo area
				p = (x + y + z) / 2;
				cp = (p - x) * (p - y) * (p - z);
				area = Math.sqrt(p*cp) / 100;
				
				
			//exibir maior lado 
			    if (tipo == "Isosceles") {
		           if ( x == y ) {
					 if ( x > z ) {
				     lado = " seus dois lados sao iguais, sendo o primeiro e segundo maiores";
					 }
				   }if ( y == z ) {
					 if ( y > x ) {
				     lado = " seus dois lados sao iguais, sendo o segundo e terceiro maiores";
					 }
				   }if ( z == x ) {
					 if ( z > y ) {
				     lado = " seus dois lados sao iguais, sendo o primeiro e terceiro maiores";
					 }
				   }if ( x > y && x > z ) {
				lado = " seus dois lados sao iguais, sendo o primeiro lado o maior";	
				} if ( y > x && y > z ) {
				lado = " seus dois lados sao iguais, sendo o segundo lado o maior";
				}
			if ( z > x && z > y ) {
				lado = " seus dois lados sao iguais, sendo o terceiro lado o maior";
				}
			     }
			
			if (tipo == "Escaleno") {
			    if ( x > y && x > z ) {
				lado = " o primeiro lado eh o maior";	
				} if ( y > x && y > z ) {
				lado = " o segundo lado eh o maior";
				}
			if ( z > x && z > y ) {
				lado = " o terceiro lado eh o maior";
				}
			}

			System.out.printf("O triangulo eh " + tipo + " , sua area eh de aproximadamente " + area + "m e " + lado);

            System.exit(0);

    }
 }
