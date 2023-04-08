RUN:
mvn clean package spring-boot:run to run the project using maven

gradle bootRun to run using gradle

http://localhost:8080/  check the project here

NOTATIONS:
@SpringBootApplication is equivalent to add @Configuration @EnableAutoConfiguration and 
@ComponentScan

@Configuration indicates that this class is a Spring
configuration class.

@ComponentScan enables component scanning for Spring beans in
the package defined by the current class.

@EnableAutoConfiguration triggers Spring Boot’s autoconfiguration
mechanisms.

se creo primero el projecto luego se modifico el pom.xml con las dependencias y por ultimo se creo el 
controlador y el index, se corre con mvn spring-boot:run

spring-boot-maven-plugin is used to create the deployment unit and its basicaly a fat jar file, to do so run 
this comands
mvn clean package
