package mx.com.mg.calculadora.operaciones;

import java.util.Scanner;

public class OperacionesBasicas {
    public int numeroUno;
    public int numeroDos;
    public Scanner consola = new Scanner(System.in);

    public OperacionesBasicas(){
        
    }
    
    public void suma(){
        System.out.println("Soy una calculadora tonta solo se sumar dos numeros");
        System.out.println("Ingresa el primero numero");
        this.numeroUno = Integer.parseInt(this.consola.nextLine());
        System.out.println("Ingresa el segundo numero ");
        this.numeroDos = Integer.parseInt(this.consola.nextLine());
        int sumar = numeroDos +numeroUno;
        System.out.println("sumar = " + sumar);
    }

    public void resta(){
        System.out.println("Soy una calculadora tonta solo se sumar dos numeros");
        System.out.println("Ingresa el primero numero");
        this.numeroUno = Integer.parseInt(this.consola.nextLine());
        System.out.println("Ingresa el segundo numero ");
        this.numeroDos = Integer.parseInt(this.consola.nextLine());
        int resta = numeroDos - numeroUno;
        System.out.println("resta = " + resta);

    }

    public void multiplicacion(){
        System.out.println("Soy una calculadora tonta solo se sumar dos numeros");
        System.out.println("Ingresa el primero numero");
        this.numeroUno = Integer.parseInt(this.consola.nextLine());
        System.out.println("Ingresa el segundo numero ");
        this.numeroDos = Integer.parseInt(this.consola.nextLine());
        int multiplicacion = numeroDos * numeroUno;
        System.out.println("multiplicacion = " + multiplicacion);

    }





}
