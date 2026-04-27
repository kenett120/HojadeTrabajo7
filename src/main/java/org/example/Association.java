package org.example;

/**
 * Nombre: Kenett Ortega
 * Carnet: 25777
 * Hoja de Trabajo #7
 *
 * Clase que representa una asociación clave-valor (inglés-español).
 */
public class Association<K extends Comparable<K>, V> implements Comparable<Association<K, V>> {

    private final K key;
    private final V value;

    /**
     * Constructor de la asociación
     */
    public Association(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Obtiene la clave (palabra en inglés)
     */
    public K getKey() {
        return key;
    }

    /**
     * Obtiene el valor (traducción en español)
     */
    public V getValue() {
        return value;
    }

    /**
     * Comparación basada en la clave
     */
    @Override
    public int compareTo(Association<K, V> other) {
        return this.key.compareTo(other.key);
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }

    /**
     * Igualdad basada solo en la clave
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Association<?, ?> other = (Association<?, ?>) obj;
        return key.equals(other.key);
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }
}