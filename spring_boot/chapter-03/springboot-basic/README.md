ANOTATIONS:
spring-boot-starter module includes spring-boot-starter-logging as a transitive dependency

To validate the property's values, you can use Bean Validation API annotations such as
@NotNull,@Min, @Max, and so on (this needs spring-boot-starter-validation dependency) 

RUN:
To run with default profile: mvn clean package spring-boot:run

To run with prod profile: mvn clean package spring-boot:run -Dspring.profiles.active=prod

To run with test profile: mvn test
