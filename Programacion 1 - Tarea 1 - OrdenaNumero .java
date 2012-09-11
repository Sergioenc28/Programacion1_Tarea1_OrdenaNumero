/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosordenados;


/**
 *
 * @author Sergio and Clary
 */
import java.util.Scanner;

public class NumerosOrdenados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
		
		Scanner teclado = new Scanner(System.in);
		
		int cant = 0;
		
		System.out.println("Programa para Organizar N�meros de menor a mayor");
		System.out.println();
		
		System.out.print("Ingrese la Cantidad de N�meros que desea ordenar: ");
		cant = teclado.nextInt();
		System.out.println();
		
		int[] numeros = new int[cant];
		
		for(int x = 0; x < cant; x++)
		{
			System.out.print("Digite un N�mero: ");
			numeros[x] = teclado.nextInt();
		}
		
		for(int i = 0; i < cant - 1; i++)
		{
			int menor = i;
			
			for(int s = i + 1; s < cant; s++)
			{
				if(numeros[s] < numeros[menor])
				{
					menor = s;
				}
			}
			
			if(i != menor)
			{
				int temp = numeros[i];
				numeros[i] = numeros[menor];
				numeros[menor] = temp;
			}
		}
		
		System.out.println();
		System.out.println("El orden de los n�meros de Menor a Mayor es:");
		
		for(int d = 0; d < cant; d++)
		{
			System.out.print(numeros[d] + ", ");
		}
    }
}