# Formulario Web con Spring Boot 

Este proyecto implementa una aplicación web simple usando Java con Spring Boot y el motor de plantillas Thymeleaf. Permite simular un inicio de sesión básico con validación de credenciales y redirección condicional de vistas.

## Características Principales
- **Formulario de Login:** Captura usuario y contraseña desde el navegador.
- **Validación Simple:** Verifica si las credenciales son `admin/1234`.
- **Redirección Automática:** Redirige desde `/` a `/inicio` para mejorar la experiencia.
- **Mensajes de Error:** Muestra advertencia cuando las credenciales no son válidas.
- **Diseño Básico:** Formulario estilizado con CSS.

## Tecnologías Utilizadas
- **Java 17**  
- **Spring Boot**  
- **Spring MVC**  
- **Thymeleaf** como motor de plantillas  
- **Maven** como sistema de construcción  

---

## ¿Cómo funciona?

- El `FrontController` maneja las rutas:
  - `GET /inicio` carga el formulario.
  - `POST /inicio` valida credenciales y redirige a `index.html` si son válidas.
  - `GET /` redirige automáticamente a `/inicio`.

- Las vistas se procesan con Thymeleaf desde la carpeta `resources/templates`.

- La aplicación se ejecuta en `http://localhost:8080/inicio`.

---

## Diagrama UML de la Aplicación
![Diagrama UML](https://drive.google.com/uc?export=view&id=1rGGWMBA7aHUu_sLQy54DU-eN8JMpOT9P)

   
