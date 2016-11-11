import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int X,Y,Z,x,y,z;
		
		System.out.println("Mete un numero");
		X = teclado.nextInt();
		
		System.out.println("Mete un otro numero ");
		Y = teclado.nextInt();
		
		System.out.println("Mete un otro numero ");
		Z = teclado.nextInt();
		
		
		if(X<Y && X<Z){	System.out.println(X);} else if(){} 
		if(Y<X && Y<Z){ System.out.println(Y);}
		if(Z<X && Z<Y){ System.out.println(Z);}
		
		if(X<Y && X>Z){	System.out.println(X);}
		if(Y<X && Y>Z){ System.out.println(Y);}
		if(Z<X && Z>Y){ System.out.println(Z);}
		
		if(X>Y && X<Z){	System.out.println(X);}
		if(Y>X && Y<Z){ System.out.println(Y);}
		if(Z>X && Z<Y){ System.out.println(Z);}
		
		
	}

}
