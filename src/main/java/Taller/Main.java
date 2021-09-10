package Taller;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
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


        //metodo.numerosImparesWhile();
        //metodo.numerosImparesFor();
        //metodo.comprobarNumero();
        //metodo.diaSemana();
        //metodo.reemplazar();
        //metodo.eliminarEspacios();

        //metodo.longitudFrase();
        //metodo.compararPalabras();
        //metodo.consultarDate();
        //metodo.saldosDos();
        //metodo.menuOpciones();
    }
}

