package com.entregable3;

import com.entregable02.usuario;
import com.entregable1.main;
import java.util.Scanner;

public class operacion {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        String[] dniData = {"6259874", "8000", "3000", "7000", "5000"};
        String[] nomData = {"Ana", "Pedro", "Rosario", "Camilo", "Roberto"};
        String[] passData = {"hola123", "hola2", "hola3", "hola4", "hola5"};

        Scanner sc = new Scanner(System.in);

//
            int contador = 0;

            usuario cal = new usuario();
            boolean validador = cal.buscarUsuario(dniData, passData, nomData);


            float saldo = 0;
            while (contador < 3) {
                if (contador == 1) {
                    System.out.println("       Ultimo Intento\n");
                    validador = cal.buscarUsuario(dniData, passData, nomData);
                    contador++;
                    System.out.println("Comuniquese con el administrador");


                } else if (validador == true) {
                    main cal1 = new main();
                    saldo = cal1.tipoOperacion(contador, saldo);

                    System.out.println("\nDesea salir\n[si]\n[no]");
                    String continuar = sc.next();
                    if (continuar.equals("no")) {
                        contador = 0;


                    } else {
                        System.out.println("          Sesión cerrada");
                        System.out.println("          !HASTA PRONTO¡ ");
                        contador = 4;
                    }

                } else if (contador < 1) {
                    System.out.println("ERROR INTENTAR DE NUEVO ");
                    validador = cal.buscarUsuario(dniData, passData, nomData);
                    contador++;

            }
        }
    }
}

