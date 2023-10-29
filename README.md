# API REST inmobiliaria 

Proyecto API Rest Inmobiliaria - PGSQL.

# Dependencias:

1- En archivo src/main/resources/application.properties

spring.datasource.url=jdbc:postgresql://localhost:5432/api-sample-inmobiliaria
spring.datasource.username=postgres
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true


# Modelo de Datos

1. Cliente
2. ProyectoInmobiliario
3. Unidad


# Configuración de Swagger

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


http://localhost:8080/swagger-ui.html


# Estructura

api-sample-inmobiliaria/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── yourpackage/
│   │   │   │   │   ├── ApiSampleInmobiliariaApplication.java  # Clase principal de Spring Boot
│   │   │   │   │   ├── config/                                # Configuraciones (como SwaggerConfig)
│   │   │   │   │   ├── controller/                            # Controladores REST
│   │   │   │   │   │   ├── ProyectoInmobiliarioController.java
│   │   │   │   │   │   └── ...
│   │   │   │   │   ├── model/                                 # Entidades y modelos de datos
│   │   │   │   │   │   ├── Cliente.java
│   │   │   │   │   │   ├── ProyectoInmobiliario.java
│   │   │   │   │   │   ├── Unidad.java
│   │   │   │   │   │   └── ...
│   │   │   │   │   ├── repository/                            # Repositorios JPA
│   │   │   │   │   │   ├── ClienteRepository.java
│   │   │   │   │   │   ├── ProyectoInmobiliarioRepository.java
│   │   │   │   │   │   └── ...
│   │   │   │   │   ├── service/                               # Servicios (si es necesario)
│   │   │   │   │   │   ├── ProyectoInmobiliarioService.java
│   │   │   │   │   │   └── ...
│   │   │   │   │   └── utils/                                 # Clases utilitarias y helpers
│   │   ├── resources/                                         # Propiedades y recursos
│   │   │   ├── application.properties                         # Configuración de Spring Boot
│   │   │   ├── static/                                       # Archivos estáticos (HTML, CSS, JS)
│   │   │   └── templates/                                    # Templates (si estás usando Thymeleaf u otro)
├── .gitignore
├── pom.xml                                                   # Archivo de configuración de Maven
└── README.md

 
