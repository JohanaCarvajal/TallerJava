package Taller;

import javax.swing.*;

public class Metodo {


    public void calcularArea() {
        double radio, area;
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio"));
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es " + area);
    }

    public void calcularIva() {
        double precioInicial = 0;
        precioInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el el precio del producto"));
        double precioFinal = precioInicial + (precioInicial * 0.21);
        System.out.println("El valor del producto es " + precioFinal);
    }

    public void numerosImparesWhile() {
        int i = 1;

        while (i <= 100) {
            System.out.println(i);
            i = i + 2;
        }
    }

    public void numerosImparesFor() {
        int num = 1;
        for (int i = 0; num <= 100; i++) {
            System.out.println(num);
            num = num + 2;

        }
    }

    public void comprobarNumero() {
        int numero;
        try {
            do {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                System.out.println("El numero ingresado es: " + numero);
                if (numero >= 0) {
                    System.out.println("El numero ingresado es: " + numero);
                } else System.out.println("Debe ser mayor o igual a cero, intente de nuevo");

            } while (numero >= 0);
        } catch (Exception e) {
            System.out.println("Solo se permite ingreso de números\n ¡intente de nuevo!");
        }
    }

    public void diaSemana() {
        try {

            int opc;
            do {
                opc = Integer.parseInt(JOptionPane.showInputDialog(
                        "Seleccioe la opción que desea\n\n" +
                                "1) Lunes\n" +
                                "2) Martes\n" +
                                "3) Miercoles.\n" +
                                "4) Jueves.\n" +
                                "5) Viernes.\n" +
                                "6) Sabado.\n" +
                                "7) Domingo.\n" +
                                "0) Salir"));

                switch (opc) {
                    case 1:
                        System.out.println("¡Dia laboral!");
                        break;
                    case 2:
                        System.out.println("¡Dia laboral!");
                        break;
                    case 3:
                        System.out.println("¡Dia laboral!");
                        break;
                    case 4:
                        System.out.println("¡Dia laboral!");
                        break;
                    case 5:
                        System.out.println("¡Dia laboral!");
                        break;
                    case 6:
                        System.out.println("¡Dia NO laboral!");
                        break;
                    case 7:
                        System.out.println("¡Dia NO laboral!");
                        break;
                    case 0:
                        System.out.println("salir");

                }
            } while (opc != 0);

        }catch (Exception e){
            System.out.println("la opción ingresada No es válida");
            }


    }
}
