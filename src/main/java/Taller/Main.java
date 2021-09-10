package Taller;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Persona> persona = new ArrayList<>();
        Metodo metodo = new Metodo();
        try {
            int opcion;
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        null, "Bienvenido, Seleccione una opcion: \n\n" +
                                "1) Numero Mayor\n" +
                                "2) Numero mayor por consola.\n" +
                                "3) Calcular area de un circulo.\n" +
                                "4) Calcular iva.\n" +
                                "5) Numeros impares - ciclo while.\n" +
                                "6) Numeros impares - ciclo for.\n" +
                                "7) Numero Mayor -do while.\n" +
                                "8) Dia de la semana.\n" +
                                "9) Reemplazar letra de una frase.\n" +
                                "10) Eliminar espacios de una frase.\n" +
                                "11) Longitud de frase.\n" +
                                "12) Comparar dos palabras.\n" +
                                "13) Fecha y hora actual.\n" +
                                "14) Imprimir numero con saldos de 2 en 2.\n" +
                                "15) Mostrar menú de opciones.\n" +
                                "16) clase Persona.\n" +
                                "17) Superclase Electrodomestico.\n" +
                                "18) Clase Serie.\n" +
                                "0) Salir.", "TALLER DE JAVA", JOptionPane.PLAIN_MESSAGE));
                switch (opcion) {
                    case 1:
                        metodo.esMayor(5,7);
                        break;
                    case 2:
                        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
                        metodo.esMayor(num1,num2);
                        break;
                    case 3:
                        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio"));
                        metodo.calcularArea(radio);
                        break;
                    case 4:
                        double precioInicial = Double.parseDouble(JOptionPane.showInputDialog
                                ("Ingrese el el precio del producto"));
                        metodo.calcularIva(precioInicial);
                        break;
                    case 5:
                        metodo.numerosImparesWhile();
                        break;
                    case 6:
                        metodo.numerosImparesFor();
                        break;
                    case 7:
                        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                        metodo.comprobarNumero(numero);
                        break;
                    case 8:
                        metodo.diaSemana();
                        break;
                    case 9:
                        String frase = "La sonrisa sera la mejor arma contra la tristeza\t";
                        String frase2 = JOptionPane.showInputDialog("Ingrese una frase");
                        metodo.reemplazar(frase, frase2);
                        break;
                    case 10:
                        metodo.eliminarEspacios();
                        break;
                    case 11:
                        metodo.longitudFrase();
                        break;
                    case 12:
                        String palabra1 = JOptionPane.showInputDialog("Ingrese una palabra");
                        String palabra2 = JOptionPane.showInputDialog("Ingrese otra palabra");
                        metodo.compararPalabras(palabra1,palabra2);
                        break;
                    case 13:
                        metodo.consultarDate();
                        break;
                    case 14:
                        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                        metodo.saldosDos(num);
                        break;
                    case 15:
                        metodo.menuOpciones();
                        break;
                    case 16:
                        persona.add(EjecutablePersona.addDatosPartOne());
                        persona.add(EjecutablePersona.addDatosPartTwo());
                        EjecutablePersona persona1 = new EjecutablePersona();
                        persona1.calcularIMC();
                        persona1.esMayorDeEdad();
                        persona1.imprimir();

                        EjecutablePersona persona2 = new EjecutablePersona();
                        persona2.calcularIMC();
                        persona2.esMayorDeEdad();
                        persona2.imprimir();

                        EjecutablePersona personas3 = new EjecutablePersona();
                        personas3.calcularIMC();
                        personas3.esMayorDeEdad();
                        personas3.imprimir();

                        Persona persona3 = new Persona();
                        persona3.setNombre("Juan carlos");
                        persona3.setEdad(18);
                        persona3.setSexo("H");
                        persona3.setPeso(65);
                        persona3.setAltura(1.50);
                        break;
                    case 17:
                        Televisor Tv1 = new Televisor(100, "Blanco", 'F', 25, 40, true);
                        Televisor Tv2 = new Televisor(100, "Negro", 'E', 32, 45, true);
                        Televisor Tv3 = new Televisor(100, "rojo", 'C', 22, 41, false);
                        Televisor Tv4 = new Televisor(100, "amarillo", 'A', 12, 24, true);
                        Televisor Tv5 = new Televisor(100, "gris", 'A', 25, 80, false);

                        Lavadora lavadora1 = new Lavadora(100, 145);
                        Lavadora lavadora2 = new Lavadora(100, "gris", 'B', 120, 35);
                        Lavadora lavadora3 = new Lavadora(100, "negro", 'F', 110, 48);
                        Lavadora lavadora5 = new Lavadora(100, 135);
                        Lavadora lavadora4 = new Lavadora(100, "negro", 'A', 110, 125);

                        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
                        electrodomesticos.add(Tv1); electrodomesticos.add(Tv2); electrodomesticos.add(Tv3);
                        electrodomesticos.add(Tv4);electrodomesticos.add(Tv5); electrodomesticos.add(lavadora1);
                        electrodomesticos.add(lavadora2); electrodomesticos.add(lavadora3); electrodomesticos.add(lavadora4);
                        electrodomesticos.add(lavadora5);
                        double precioTotal = 0;
                        for (int i = 0; i < electrodomesticos.size(); i++){
                            if(i < 5){
                                System.out.println("TV #" + (i+1) + " -> Precio: " + electrodomesticos.get(i).precioFinal());
                                precioTotal += electrodomesticos.get(i).precioFinal();
                            }else if(i >= 5){
                                System.out.println("Lavadora #" + (i+1) + " -> Precio: " + electrodomesticos.get(i).precioFinal());
                                precioTotal += electrodomesticos.get(i).precioFinal();
                            }
                        }
                        System.out.println("El precio total de los electrodomesticos es: $" + precioTotal);
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Adios!", "Cerrar aplicacion", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                }

            } while (opcion != 0);
        } catch (Exception e) {
            System.out.println("Debe ingresar números y no letras");
        }
    }
}

