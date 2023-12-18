import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Operaciones operacion = new Operaciones();
        Scanner sn=new Scanner(System.in);
        System.out.println("Ingrese numero 1: ");
        operacion.setNum1(sn.nextInt());
        System.out.println("Ingrese numero 2: ");
        operacion.setNum2(sn.nextInt());
        System.out.println("Resultado suma = " + operacion.Sumar());
        System.out.println("Resultado resta = " + operacion.Restar());
        System.out.println("Resultado Multiplicacion = " + operacion.Multiplicar());
        System.out.println("Resultado divisiòn = " + operacion.Dividir());
    }

}