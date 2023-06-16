import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner capturarTeclado = new Scanner(System.in);
        int [] numeros = new int[5];

        System.out.println("Ingrese 5 numeros: ");
        for (int i = 0; i < numeros.length; i++){
            numeros[i]= capturarTeclado.nextInt();
        }
        System.out.println("Los numeros ingresados son: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        int mayor = 0;
        int menor = 100;

        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        System.out.println("El numero mayor es: "+ mayor);
        System.out.println("El numero menor es: "+ menor);

        int suma=0;
        for (int i = 0; i < numeros.length; i++){
            suma = suma + numeros[i];
        }
        double promedio = (double) (suma/ numeros.length);
        System.out.println("El promedio es: " + promedio);
    }
}