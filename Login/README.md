# 🧪 Proyecto de Automatización con Serenity BDD, Cucumber y Gradle

Este proyecto implementa pruebas automatizadas bajo el enfoque de **Behavior Driven Development (BDD)** usando **Gherkin**, **Cucumber**, **Serenity BDD**, y se construye con **Gradle**.

---

## 🚀 Tecnologías Usadas

| Herramienta / Lenguaje | Descripción |
|------------------------|-------------|
| **Java**               | Lenguaje base para escribir el código de automatización. |
| **Gherkin**            | Lenguaje estructurado para definir escenarios en lenguaje natural. |
| **Cucumber**           | Ejecuta escenarios Gherkin y los conecta con código Java. |
| **Serenity BDD**       | Framework que amplía Cucumber con reportes detallados, patrón Screenplay y más. |
| **Gradle**             | Herramienta de construcción para compilar, ejecutar pruebas y generar reportes. |

---

## 🧭 ¿Qué es BDD?

**Behavior Driven Development (BDD)** es una metodología de desarrollo basada en el comportamiento del sistema desde la perspectiva del usuario. Facilita la colaboración entre desarrolladores, testers y stakeholders no técnicos.

Los escenarios se escriben en lenguaje natural utilizando **Gherkin**, y se conectan con código de prueba en Java usando **Cucumber**.

---

## ⚙️ Ejecución de Pruebas

Para ejecutar las pruebas automatizadas y generar el reporte:

```bash
./gradlew clean test aggregate
```

Una vez finalizada la ejecución, el reporte HTML de Serenity estará disponible en:

```
build/serenity/index.html
```

Ábrelo en tu navegador para ver el resultado de los escenarios paso a paso, con capturas de pantalla y métricas.

---

## 🌐 Configuración del Navegador

La configuración del navegador para las pruebas se define en el archivo `serenity.properties`:

```properties
webdriver.driver=chrome
chrome.switches=--start-maximized
chrome.headless=false
```

Puedes cambiar `chrome` por `firefox`, `edge`, etc. según el navegador deseado. También puedes activar `headless` para ejecución sin abrir la interfaz gráfica del navegador.

---

## 💡 Beneficios del Enfoque BDD

- ✅ Escenarios escritos en lenguaje natural comprensibles por todo el equipo.
- ✅ Mejora la colaboración entre testers, desarrolladores y stakeholders.
- ✅ Reportes visuales y detallados con trazabilidad gracias a Serenity.
- ✅ Modularidad y escalabilidad del código usando el patrón Screenplay.
- ✅ Facilita la automatización desde una perspectiva de negocio y usuario final.

---


## ✨ Autores

Este proyecto fue desarrollado con fines académicos para aprender y aplicar automatización de pruebas BDD usando Serenity, Cucumber y Gradle.


SIMON MESA RESTREPO E
ISAAC POSADA ZAPATA

---
