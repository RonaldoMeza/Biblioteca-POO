# 📚 Ejemplo POO en Kotlin: Biblioteca

Este proyecto es un ejemplo sencillo en Kotlin que simula una **biblioteca** con materiales de lectura como **Libros** y **Revistas**.  
El objetivo es aplicar los conceptos vistos en el laboratorio de Programación Orientada a Objetos en Kotlin.

---

## 📌 Conceptos aplicados
- **Clases abstractas** → `Material` define las propiedades comunes a todos los materiales.
- **Constructores e init** → se muestra un mensaje cada vez que se crea un material.
- **Propiedades con getter y setter** → `paginas` valida valores (setter) y `esGrueso` calcula si el material es voluminoso (getter).
- **Herencia y override** → `Libro` y `Revista` heredan de `Material` y sobrescriben el método `mostrarInfo()`.
- **Interfaces** → `AccionLectura` define el método `leer()` que implementan tanto el libro como la revista.

---


## ▶️ Ejecución
1. Abrir el proyecto en **IntelliJ IDEA**.  
2. Ejecutar el archivo `main.kt`.

---

## 📺 Video explicativo
👉 [[Enlace al video](https://www.youtube.com/watch?v=wR4zWH7nc9A)](#)  

---

## ✨ Autor
Proyecto desarrollado por **Ronaldo Meza** como ejemplo propio del laboratorio de **POO en Kotlin**.

