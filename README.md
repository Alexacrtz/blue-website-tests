# Blue Commerce Enterprises - Sitio Web

Este proyecto es el sitio web de Blue Commerce Enterprises, una empresa que vende material de traumatología (implantes, instrumental, equipo de poder, etc). Incluye también un proyecto de pruebas en Java.

## Contenido

- [Resumen](#resumen)
- [Requerimientos](#requerimientos)
- [Instalación](#instalación)
- [Configuración](#configuración)
- [Uso](#uso)
- [Cómo contribuir](#cómo-contribuir)
- [Roadmap](#roadmap)
- [Producto](#producto)

## Resumen

**El problema:** la empresa ya tenía redes sociales y CRM, pero no tenía página web. Eso le restaba formalidad frente a hospitales y clientes.

**La solución:** un sitio informativo con lo básico: quiénes somos, categorías de producto, ubicación y contacto. No complicado, sin base de datos ni backend.

**Arquitectura:** el sitio son solo archivos HTML/CSS/JS guardados en la carpeta `docs`, publicados con GitHub Pages. El formulario de contacto usa Formspree para enviar los correos, y el mapa es un iframe de Google Maps. Aparte, hay un proyecto de pruebas hecho con Maven, JUnit y HtmlUnit.

## Requerimientos

- No usa servidor de aplicaciones ni base de datos, es un sitio estático.
- Se publica con GitHub Pages.
- Para las pruebas: Java 11, Maven, y las librerías JUnit 4.13.2 y HtmlUnit 2.70.0 (ya están en el `pom.xml`).

## Instalación

**Para desarrollar:**
1. Clona el repo: `git clone https://github.com/Alexacrtz/blue-website-tests.git`
2. Ábrelo en Eclipse como proyecto Maven existente.
3. Clic derecho al proyecto → Maven → Update Project.

**Para correr las pruebas:**
En Eclipse, clic derecho a `SitioBlueTest.java` → Run As → JUnit Test. O desde terminal: `mvn test`.

**Para verlo publicado:**
Solo abre `docs/index.html` en cualquier navegador, o entra a la versión ya publicada: https://alexacrtz.github.io/blue-website-tests/

## Configuración

Los colores del sitio están arriba del todo en el `<style>` de cada HTML, en la parte que dice `:root`. Ahí se pueden cambiar sin tocar el resto del código.

El formulario de contacto necesita que le pongas tu propio link de Formspree en el `<form action="...">`. El mapa necesita que cambies el link del iframe por la dirección real.

## Uso

Es un sitio normal para navegar: Inicio, el menú de Productos con sus categorías, Quiénes somos, Ubicación con mapa, y Contacto con el formulario. Todo enlaza al Aviso de Privacidad.

Si alguien necesita actualizar contenido, se edita directo en `docs/index.html` o `docs/aviso-privacidad.html`, siguiendo el mismo flujo de branches de la siguiente sección.

## Cómo contribuir

1. Clona el repo.
2. Crea tu branch desde develop: `git checkout -b feature/lo-que-vayas-a-hacer`
3. Haz tus cambios y súbelos: `git commit -m "..."` y `git push`
4. En GitHub, abre un Pull Request hacia `develop`.
5. Espera a que se revise y se haga el merge.

## Roadmap

Cosas que no entraron en esta primera versión pero podrían agregarse después:
- Panel para editar contenido sin tocar el código
- Buscador
- Fichas de producto individuales
- Conectar el formulario con el CRM de la empresa
- Dominio propio
- Terminar de conectar un sistema de integración continua en la nube

## Producto

- Sitio publicado: https://alexacrtz.github.io/blue-website-tests/
- No aplica WAR/JAR, porque es un sitio estático sin backend.
