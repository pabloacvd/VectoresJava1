package ar.com.xeven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    String[] nombres = new String[5];
	    int posiciones = nombres.length;
        System.out.println("Mi array nombres tiene "+posiciones+" posiciones.");
        nombres[0] = "pablo";
        nombres[1] = "agus";
        nombres[2] = "ariana";
        nombres[3] = "ayelen";
        nombres[4] = "caro";
        for(int contador = 0; contador < 5; contador++){
            System.out.println(nombres[contador]);
        }

        //         Formas de inicializar un array:
        // Forma1: Primero declaro el array y lo inicializo con su tamaño:
            Integer[] edades = new Integer[3];
        // Forma1: Luego cargo uno por uno sus valores.
            edades[0] = 10;
            edades[1] = 15;
            edades[2] = 20;
        // Forma2: Inicializo el array con los valores directamente:
            Integer[] notas = {3, 8, 10, 5, 7, 4};

            for(int contador = 0; contador < notas.length; contador++){
                System.out.println("Nota "+(contador+1)+": "+notas[contador]);
            }

        // ArrayList<>

            List<String> apellidos = new ArrayList<>();

            // Agrego dos elementos
            apellidos.add("Acevedo");
            apellidos.add("Prats");
            // Consulto el tamaño
            System.out.println("Tengo "+apellidos.size()+" apellidos");
            // Agrego dos elementos más
            apellidos.add("Vera");
            apellidos.add("Rinaldi");
            apellidos.add("Guitian");
            apellidos.add("Feliu");
            // Vuelvo a consultar el tamaño
            System.out.println("Tengo "+apellidos.size()+" apellidos");
            System.out.println("Pido el apellido 3");
            System.out.println(apellidos.get(2));
            // borrar todos los elementos:
            //apellidos.clear();
            // saber si está vacío:
            if(apellidos.isEmpty()){
                System.out.println("El array está vacío");
            }else{
                System.out.println("El array tiene "+ apellidos.size() +" elementos");
            }
            // elimino el apellido en la posicion 0:
            apellidos.remove(0);
            System.out.println("Ahora tiene "+apellidos.size());
            // recorro el array y lo muestro
            for(int contador = 0; contador < apellidos.size(); contador++){
                System.out.println(contador+": "+apellidos.get(contador));
            }
            apellidos.remove(2);
            System.out.println("Vuelvo a mostrarlo:");
            for(int contador = 0; contador < apellidos.size(); contador++){
                System.out.println(contador+": "+apellidos.get(contador));
            }
            // Ordenar alfabéticamente:
            Collections.sort(apellidos);
            System.out.println("Vuelvo a mostrar... otra vez:");
            for(int contador = 0; contador < apellidos.size(); contador++){
                System.out.println(contador+": "+apellidos.get(contador));
            }


            // OTRO EJEMPLO, ahora con números:

            List<Integer> numerosDesordenados = new ArrayList<>();
            numerosDesordenados.add(4);
            numerosDesordenados.add(1);
            numerosDesordenados.add(3);
            numerosDesordenados.add(5);
            numerosDesordenados.add(15);
            numerosDesordenados.add(7);
            System.out.println("Núnmeros desordenados:");
            System.out.println(numerosDesordenados);
            Collections.sort(numerosDesordenados);
            System.out.println("Números ordenados:");
            System.out.println(numerosDesordenados);
            
    }
}
