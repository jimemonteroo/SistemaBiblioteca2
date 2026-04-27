# Sistema de Gestión de Biblioteca

Proyecto académico desarrollado en Java para aplicar los pilares de la Programación Orientada a Objetos (POO), junto con arquitectura MVC y DAO.  
El sistema permite gestionar libros, usuarios y préstamos, demostrando herencia, interfaces, excepciones personalizadas y persistencia de datos.

## Características principales
- Herencia: `Usuario` hereda de `Persona`.
- Interfaces: `Libro` implementa `Prestable`.
- Excepciones personalizadas: `LibroNoDisponibleException`.
- Persistencia de datos: almacenamiento en archivo `libros.txt`.
- Arquitectura MVC/DAO: separación clara de responsabilidades.
- Diagrama UML: actualizado con todas las relaciones (herencia, agregación, composición, dependencia).

## Estructura del proyecto
SistemaBiblioteca/
├── model/          # Entidades y excepciones
├── dao/            # Acceso a datos (LibroDAO)
├── controller/     # Lógica de negocio (BibliotecaController)
├── view/           # Interfaz de usuario (BibliotecaView)
├── Main.java       # Punto de entrada
└── docs/           # Diagramas UML y capturas

## Requisitos
- Java 17 o superior
- IntelliJ IDEA (o cualquier IDE compatible)
- Git para control de versiones

## Ejecución
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/jimemonteroo/SistemaBiblioteca.git
