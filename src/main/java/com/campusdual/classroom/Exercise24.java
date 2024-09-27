package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {

    // Método que crea y devuelve una cola poblada
    public static Queue<String> createQueue() {
        Queue<String> queue = new LinkedList<>();

        // Añadir elementos a la cola
        queue.add("Smith");
        queue.add("Montessori");
        queue.add("Peralta");
        queue.add("House");

        return queue;
    }

    // Método que imprime y vacía la cola
    public static void printAndEmptyQueue(Queue<String> queue) {
        while (!queue.isEmpty()) {
            // Obtener y mostrar el primer elemento
            String element = queue.poll(); // poll() devuelve y elimina el primer elemento de la cola
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Crear y poblar la cola
        Queue<String> myQueue = createQueue();

        // Imprimir y vaciar la cola
        printAndEmptyQueue(myQueue);
    }
}
