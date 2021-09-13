package Taller;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Persona> persona = new ArrayList<>();
        ArrayList<Videojuego> videojuegos = new ArrayList<>();
        ArrayList<Videojuego> videojuegosEntregados = new ArrayList<>();
        ArrayList<Serie> series = new ArrayList<>();
        ArrayList<Serie> seriesEntregados = new ArrayList<>();
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
                        persona.add(Ejecutable.addDatosPartOne());
                        persona.add(Ejecutable.addDatosPartTwo());
                        Ejecutable persona1 = new Ejecutable();
                        persona1.calcularIMC();
                        persona1.esMayorDeEdad();
                        persona1.imprimir();

                        Ejecutable persona2 = new Ejecutable();
                        persona2.calcularIMC();
                        persona2.esMayorDeEdad();
                        persona2.imprimir();

                        Ejecutable personas3 = new Ejecutable();
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
                    case 18:
                        Videojuego vdj1 = new Videojuego("The Legend of Zelda",50, "MMORPG", "Nintendo ");
                        Videojuego vdj2 = new Videojuego("Tony Hawk's Pro Skater",1000, "Survival", "Neversoft");
                        Videojuego vdj3 = new Videojuego("Soul Calibur",3, "Terror/Accion", "Namco");
                        Videojuego vdj4 = new Videojuego("Super Mario Galaxy",100, "Accion", "Nintendo");
                        Videojuego vdj5 = new Videojuego("Perfect Dark",20, "Accion", "Rare");

                        Serie sr1 = new Serie(2, "Combat continent", "Donghua", "Tensen");
                        Serie sr2 = new Serie(3, "Doupo Cangqiong", "Cultivo", "Bilibili");
                        Serie sr3 = new Serie(6, "Overlord", "Isekai", "Kugane Maruyama");
                        Serie sr4 = new Serie(1, "Jojo's bizarre adventure", "shonen", "Hirohiko Araki");
                        Serie sr5 = new Serie(5, "Monster", "seinen", "Naroki Urasawa");

                        videojuegos.add(vdj1);
                        videojuegos.add(vdj2);
                        videojuegos.add(vdj3);
                        videojuegos.add(vdj4);
                        videojuegos.add(vdj5);

                        series.add(sr1);
                        series.add(sr2);
                        series.add(sr3);
                        series.add(sr4);
                        series.add(sr5);

                        videojuegos.get(1).entregar();
                        series.get(3).entregar();
                        videojuegos.get(4).entregar();

                        for (int i = 0; i < series.size(); i++){
                            if(videojuegos.get(i).isEntregado() == true){
                                videojuegosEntregados.add(videojuegos.get(i));
                                videojuegos.remove(i);
                            }
                            if(series.get(i).isEntregado() == true){
                                seriesEntregados.add(series.get(i));
                                series.remove(i);
                            }
                        }
                        int contadorVideoJuegosEntregados = 0;
                        for(int i = 0; i < videojuegosEntregados.size(); i++){
                            contadorVideoJuegosEntregados += 1;
                        }
                        for(int i = 0; i < videojuegosEntregados.size(); i++){
                            videojuegos.add(videojuegosEntregados.get(i));
                            videojuegosEntregados.remove(i);
                        }
                        System.out.println("Los videojuegos entregados fueron: " + contadorVideoJuegosEntregados);
                        int contadorSeriesEntregadas = 0;
                        for(int i = 0; i < seriesEntregados.size(); i++){
                            contadorSeriesEntregadas += 1;
                        }
                        for(int i = 0; i < seriesEntregados.size(); i++){
                            series.add(seriesEntregados.get(i));
                            seriesEntregados.remove(i);
                        }
                        System.out.println("Las series entregadas fueron: " + contadorSeriesEntregadas);

                        /*Compare to*/
                        double mayorEnHoras = 0;
                        int indiceMayor = 0;
                        for(int i = 0; i < videojuegos.size(); i++){
                            if(mayorEnHoras < videojuegos.get(i).getHorasEstimadas()){
                                mayorEnHoras = videojuegos.get(i).getHorasEstimadas();
                                indiceMayor = i;
                            }
                        }
                        System.out.println("El juego con mas horas es: \n" +
                                videojuegos.get(indiceMayor).toString());
                        double mayorEnTemps = 0;
                        for(int i = 0; i < series.size(); i++){
                            if(mayorEnTemps < series.get(i).getNumTemporadas()){
                                mayorEnTemps = series.get(i).getNumTemporadas();
                                indiceMayor = i;
                            }
                        }
                        System.out.println("La Serie con mas temporadas es:  \n" +
                                series.get(indiceMayor).toString());
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

