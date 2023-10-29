# API REST inmobiliaria

![Logo](https://easyupload.io/85kjea)

Proyecto API Rest Inmobiliaria - PGSQL.
Dependencias:

```bash
  "Spring Web", "Spring Data JPA", "PostgreSQL Driver", "Lombok", "Spring Boot DevTools", "Swagger UI" y "Spring Boot Starter Logging".
```


Descarga el proyecto y extráelo en tu directorio de trabajo.

## 1- En archivo src/main/resources/application.properties

```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/api-sample-inmobiliaria 
spring.datasource.username=postgres 
spring.datasource.password= spring.jpa.hibernate.ddl-auto=update 
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
```
## Modelo de Datos

    Cliente
    ProyectoInmobiliario
    Unidad

## Configuración de Swagger

```bash
@Configuration 
@EnableSwagger2 

public class SwaggerConfig {

@Bean
public Docket api() { 
  return new Docket(DocumentationType.SWAGGER_2) 
    .select() 
    .apis(RequestHandlerSelectors.basePackage("com.tu.paquete")) 
    .paths(PathSelectors.any()) 
    .build(); 
  } 
}

```

http://localhost:8080/swagger-ui.html


## Autor

- [@mauriciodurant](https://github.com/mdurant/api-inmobiliaria)


## Badges

Add badges from somewhere like: [shields.io](https://shields.io/)

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)
[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://opensource.org/licenses/)
[![AGPL License](https://img.shields.io/badge/license-AGPL-blue.svg)](http://www.gnu.org/licenses/agpl-3.0)


## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/mdurant)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/mdurantorres/)


## Used By

This project is used by the following companies:

- Cualquiera.

