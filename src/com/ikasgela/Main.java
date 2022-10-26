package com.ikasgela;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num_tope;
        String entrada;
        do {
            System.out.print("Ingrese el número tope: ");
            entrada = br.readLine().toLowerCase();

            if (entrada.equals("fin")) {
                System.out.println("Programa terminado");
            } else {

                try {
                    num_tope = Integer.parseInt(entrada);
                    if (num_tope <= 1) {
                        System.out.println("Rango de números no evaluable.\n");
                    } else {
                        long inicio = System.currentTimeMillis();
                        for (int i = 1; i < num_tope + 1; i++) {

                            if (EsPrimo(i)) {
                                System.out.println(i);
                            }

                        }
                        long fin = System.currentTimeMillis();


                        long tiempo_estimado = (fin - inicio) / 10;
                        System.out.println("El tiempo estimado de duracion del programa es de: "
                                + tiempo_estimado + " Centésimas de segundo\n");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Entrada Invalida\n");
                }
            }
        } while (!entrada.equals("fin"));
    }

    private static boolean EsPrimo(int num_comprobacion) {

        int contador_resto = 0;

        for (int i = 1; i <= num_comprobacion; i++) {

            int resto = num_comprobacion % i;

            if (resto == 0) {
                contador_resto++;
            }
        }
        return contador_resto == 2;
    }
}
