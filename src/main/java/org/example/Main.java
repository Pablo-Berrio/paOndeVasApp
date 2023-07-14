package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DECLARANDO LOS DATOS DE ENTRADA DEL PROBLEMA

        String direccionRecogida;
        String destino;
        String nombreUsuario;
        String telefonoUsuario;
        int kilometros;
        int precioPorKilometro;
        double precioTotalDelServicio;

        //DECLARAMOS UN DATO ESPECIAL PARA CAPTURAR INFORMACION DESDE EL TECLADO

        Scanner entradaTeclado=new Scanner(System.in);

        //ESPACIO PARA INICIALIZAR LAS VARIABLES

        System.out.println( "\u001B[36m paOndeVas APP  \u001B[0m");

        System.out.print("ingrese su direccion de recogida: " );
        direccionRecogida=entradaTeclado.nextLine();
        System.out.print("ingrese su destino: ");
        destino=entradaTeclado.nextLine();
        System.out.print("ingrese su nombre: ");
        nombreUsuario=entradaTeclado.nextLine();
        System.out.print("ingrese su telefono: ");
        telefonoUsuario=entradaTeclado.nextLine();

        //PROCESO DEL PROBLEMA

        /*double distancia=20;
        int costoPorKilometro=6800;
        double cobroTotal=distancia*costoPorKilometro;
        cobroTotal=(distancia*costoPorKilometro);*/

        String distancia="20";//ESTO ES UN TEXTO
        //DEBO HACER PARSEO DE LA VARIABLE DISTANCIA (parseo es igual a cambiar o modificar el tipo de dato de una variable)
        Integer distanciaEnEntero=Integer.parseInt(distancia);


        Integer costoPorKilometro=6800;
        Integer cobroTotal=distanciaEnEntero*costoPorKilometro;

        //SALIDAS DEL PROBLEMA


        System.out.println("\u001B[36m señor usuario: " + nombreUsuario +  "\u001B[0m");
        System.out.println("\u001B[36m su direccion de recogida es: " + direccionRecogida +  "\u001B[0m");
        System.out.println("\u001B[36m usted se dirige hacia a: " + destino +  "\u001B[0m");
        System.out.println("\u001B[36m su telefono es: " + telefonoUsuario +  "\u001B[0m");
        System.out.println("\u001B[36m el precio de su viaje  es: $" + cobroTotal +  "\u001B[0m");



    }
}