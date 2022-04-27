package com.entregable1;
import java.util.Scanner;
public class main {
    String name;
    int dni;
    int  pass;
    public float tipoOperacion(int contador,float saldo) {
        float saldoInt=saldo;
        System.out.println("------------------------------------");
        System.out.println("Bienvenido ");
        System.out.println("------------------------------------");
        System.out.println("\n"
                + "Elija la operación que desea realizar:\n"
                + "[1] Depósito\n"
                + "[2] Retiro\n"
                + "[3] Consulta de Saldo\n");

        Scanner datosEntrada = new Scanner(System.in);
        String numeroElecto = datosEntrada.next();
//
        if (numeroElecto.equals("1")) {
            System.out.println("\nMonto de depósito");
            float montoScanner = datosEntrada.nextFloat();
            saldoInt = saldo+montoScanner;
            System.out.println("La operación se ha realizado correctamente");


        } else if (numeroElecto.equals("2")) {
            System.out.println("Monto de retiro");
            float montoScanner2 = datosEntrada.nextFloat();
            saldoInt =saldo- montoScanner2;
            System.out.println("La operación se ha realizado correctamente");

        } else if (numeroElecto.equals("3")) {
            System.out.println("Tu saldo es s/" + saldo);
        }
        return saldoInt;
    }
}
