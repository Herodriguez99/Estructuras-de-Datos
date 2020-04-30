package Proyecto_Prototipo;

import java.util.NoSuchElementException;

public class Queue<T> {
  int frente, posterior, tamaño;
  T datos[];

  public final static int Tamaño_Minimo = 16;
  public static final int Tamaño_Maximo = Integer.MAX_VALUE - 8;

  public Queue() {
    this(Tamaño_Minimo);
  }

  public Queue(int capacidad) throws IllegalArgumentException {
    if (capacidad < 1) {
      throw new IllegalArgumentException("El tamaño de la cola debe ser mayor de 1");
    }

    if (capacidad > Tamaño_Maximo) {
      throw new IllegalArgumentException("El tamaño es mas Grande que el permitido");
    }
    @SuppressWarnings("unchecked")
    T[] temp = (T[]) new Object[capacidad];
    datos = temp;
  }

  void enqueue(T e) throws IllegalArgumentException {
    if (tamaño == datos.length) {
      throw new IllegalArgumentException("Tope de Datos Alcanzado");
    }
    datos[posterior] = e;
    posterior = (posterior + 1) % datos.length;
    tamaño++;
  }

  public T elemento() throws NoSuchElementException {
    if (tamaño == 0) {
      throw new NoSuchElementException("La cola no contiene ningun elemento");
    }
    return datos[frente];
  }

  public T dequeue() throws NoSuchElementException {
    if (tamaño == 0) {
      throw new NoSuchElementException("");
    }
    tamaño--;
    T output = datos[frente];
    datos[frente] = null;
    frente = (frente + 1) % datos.length;
    return output;
  }

  public boolean offer(T e) {
    if (tamaño == datos.length) {
      return false;
    }
    tamaño++;
    datos[posterior] = e;
    posterior = (posterior + 1) % datos.length;
    return true;
  }

  public T peek() {
    return tamaño == 0 ? null : datos[frente];
  }

  public T poll() {
    if (tamaño == 0) {
      return null;
    }

    T salida = datos[frente];
    datos[frente] = null;
    frente = (frente + 1) % datos.length;
    return salida;
  }
}