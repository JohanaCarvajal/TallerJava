package Taller;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
    public void reemplazar(){
        String frase = "La sonrisa sera la mejor arma contra la tristeza\t";
        String frase2;
        frase2 = JOptionPane.showInputDialog("Ingrese una frase");
        System.out.println("La frase completa es : " + frase.concat(frase2));
        frase = frase.replace("a","e");
        System.out.println("La frase reemplazada es: " +frase);
    }

    public void eliminarEspacios (){
        String frase;
        frase = JOptionPane.showInputDialog("Ingrese una frase");
        System.out.println("La frase sin espacios es: "+frase.replaceAll("\\s",""));
    }
    public void longitudFrase() {
        String frase;
        int cont = 0;
        frase = JOptionPane.showInputDialog("Ingrese una frase");
        System.out.println("La cantidad de caracteres de la frase :" + frase + "\tes\t" + frase.length());
        for (int i = 0; i< frase.length(); i++) {
            if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'e') || (frase.charAt(i) == 'i') ||
                    (frase.charAt(i) == 'o') || (frase.charAt(i) == 'u')) ;
            cont++;
        }
        System.out.println("La frase tiene: " + cont+ "\tvocales");
    }

    public void compararPalabras(){
        String palabra1, palabra2;
        int salida;
        palabra1 = JOptionPane.showInputDialog("Ingrese una palabra");
        palabra2 = JOptionPane.showInputDialog("Ingrese otra palabra");
        salida = palabra1.compareToIgnoreCase(palabra2);
            if (salida <0){
                System.out.println(palabra1+"\ttiene menos letras que\t"+palabra2);
            }else if (salida==0){
                System.out.println(palabra1+"\ty\t"+palabra2+"\tson iguales\t");
            }else {
                System.out.println(palabra1+"\ttiene mas letras que "+palabra2);
            }
    }

    public void consultarDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("La fecha podrá interpretarla en el siguiente formato:\n" +
                "año/mes/dia HH:mm:ss \n"+dtf.format(LocalDateTime.now()));
    }
    public void saldosDos() {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        while (num <= 1000) {
            System.out.println(num);
            num = num + 2;
        }
    }
    public void menuOpciones(){
        int option;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(
                    null, "Bienvenido, seleccione una opción: \n\n" +
                            "1) Nuevo actor.\n" +
                            "2) Buscar actor.\n" +
                            "3) Eliminar actor.\n" +
                            "4) Modificar actor.\n" +
                            "5) Ver todos los actores.\n" +
                            "6) Ver peliculas de los actores\n" +
                            "7) Ver categoriade las peliculas de los actores\n" +
                            "8) Salir.", "GESTION CINEMATOGRAFICA", JOptionPane.PLAIN_MESSAGE));

            switch (option) {

                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Adios!", "Close application", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opción inválida!");
            }

        } while (option != 0);
    }




    }




