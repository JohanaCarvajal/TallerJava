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
        int i=1;

        while (i<=100){
            System.out.println (i);
            i= i+2;
        }
    }
    public void numerosImparesFor(){
        int num =1;
        for (int i=0; num<=100; i++){
            System.out.println(num);
            num= num+2;

        }
    }

    public void comprobarNumero(){
        int numero;
        try{
            do{
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                System.out.println("El numero ingresado es: " +numero);
                if (numero>=0){
                    System.out.println("El numero ingresado es: "+numero);
                }else System.out.println("Debe ser mayor o igual a cero, intente de nuevo");

            }while(numero >=0 );
        }catch (Exception e){
            System.out.println("Solo se permite ingreso de números\n ¡intente de nuevo!");
        }


    }


    /*public void numerosImparesWhile(){
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

    }*/

    }
