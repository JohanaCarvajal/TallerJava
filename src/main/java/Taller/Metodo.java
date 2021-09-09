package Taller;

import javax.swing.*;

public class Metodo {



    public void calcularArea(){
        double radio, area;
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio"));
        area = Math.PI*Math.pow(radio,2);
        System.out.println("El area del circulo es "+area);
    }

    public void calcularIva() {
        double precioInicial = 0;
        precioInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el el precio del producto"));
        double precioFinal = precioInicial + (precioInicial * 0.21);
        System.out.println("El valor del producto es " + precioFinal);
    }

    public void numerosImparesWhile(){
        boolean esPrimo = true;
        int numero =100, divisor = 2;

        numero --;
        while (esPrimo && divisor < numero){
            esPrimo = numero%divisor !=0;
            divisor++;

                if (esPrimo==true){
                    System.out.println(numero);
                    divisor = 2;
                    numero --;
                }else
                    esPrimo = true;
                divisor=2;
                numero--;
        }

    }

    }
