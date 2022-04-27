package com.entregable02;
import java.util.Scanner;
public class usuario {
    public boolean buscarUsuario(String[] dniData, String[] passData, String[] nomData) {
        Scanner datosEntrada = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("New Perú Bank");
        System.out.println("------------------------------------");
        System.out.println("DNI:");
        String dni = datosEntrada.next();

        System.out.println("NOMBRE DE USUARIO:");
        String nombre = datosEntrada.next();

        System.out.println("Password:");
        //String password = datosEntrada.next();
        String password = "";
        for(int i= 0; i < password.length(); i++){
            password = password +"*";
        }

            boolean validador = false;

            for (int i = 0; i < dniData.length; i++) {
                if (dni.equals(dniData[i]) && password.equals(passData[i]) && nombre.equals(nomData[i])) {
                    validador = true;

                    break;
                } else {
                    validador = false;

                }
            }
            return validador;
        }
    }


