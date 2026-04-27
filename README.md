# Hoja de Trabajo #7 - Árboles Binarios de Búsqueda

**Nombre:** Kenett Ortega  
**Carnet:** 25777  

---

## Descripción

Este proyecto consiste en la implementación de un diccionario Inglés–Español utilizando un Árbol Binario de Búsqueda (BST).

El programa:
- Lee un archivo `diccionario.txt` con asociaciones (inglés, español)
- Construye un árbol binario de búsqueda basado en la palabra en inglés
- Recorre el árbol en **in-order** para mostrar las palabras ordenadas
- Traduce un archivo `texto.txt` palabra por palabra

---

## Funcionalidades

- Implementación de la clase `BinaryTree<E>`
- Implementación de la clase `Association<K, V>`
- Inserción y búsqueda en el BST
- Recorrido **In-order** (orden alfabético)
- Traducción de texto
- Manejo de palabras no encontradas con `*palabra*`
- Manejo de mayúsculas y minúsculas (case-insensitive)
- Pruebas unitarias con JUnit

---

## Ejemplo de uso

### Entrada (`texto.txt`)
The woman asked me to do my homework about my town.
### Salida
The mujer asked me to do my tarea about my pueblo.
---

## Cómo ejecutar

1. Colocar los archivos `diccionario.txt` y `texto.txt` en la raíz del proyecto
2. Ejecutar la clase `Main`
3. Ver resultados en consola

---

## Pruebas unitarias

Se incluyen pruebas para:
- Inserción en el árbol
- Búsqueda de elementos existentes
- Búsqueda de elementos no existentes

---

## Referencias

La implementación del Árbol Binario de Búsqueda se basó en:

- Goodrich, Tamassia, Goldwasser. *Data Structures and Algorithms in Java*
- https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/

---

## Notas

- El programa no distingue entre mayúsculas y minúsculas al buscar palabras
- Se preserva la puntuación en la salida
