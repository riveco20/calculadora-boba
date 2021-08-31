package mx.com.mg.calculadora.test;


import mx.com.mg.calculadora.operaciones.OperacionesBasicas;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        OperacionesBasicas operacion = new OperacionesBasicas();
        int opcion =1;

        while (opcion!=0) {
            try {
                System.out.println("selecione una opcion "
                        + "\n" + "1. Suma "
                        + "\n" + "2. Resta "
                        + "\n" + "3. Multiplicacion "
                        + "\n" + "4. Divicion ");
                opcion = Integer.parseInt(consola.nextLine());
                switch (opcion) {
                    case 1:
                        operacion.suma();
                        break;
                    case 2:
                        operacion.resta();
                        break;
                    case 3:
                        operacion.multiplicacion();
                        break;
                    case 4:
                        operacion.multiplicacion();
                        break;
                    default:
                        System.out.println("Ingrese una de las opciones marcadas");
                        break;
                }
                System.out.println("Desea realizar otra operacion ingrese cualquier numero o marque 0(cero) para salir");
                opcion = Integer.parseInt(consola.nextLine());

            }catch (Exception ex){
                System.out.println("Ingrese una opcion validad");
                System.out.println("Eliga una opcion");
                opcion=Integer.parseInt(consola.nextLine());
            }
        }


    }

}
