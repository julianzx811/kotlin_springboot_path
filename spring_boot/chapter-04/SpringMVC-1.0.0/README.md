domain -> controllers -> views

getters, setters, constructors, or equals(), hashCode(), and toString() methods are provided by the 
lombok by anotations like  @Getter, @Setter,@AllArgsConstructor,@NoArgsConstructor,and @EqualsAndHashCode

POJO stand for simple classes with getters and setters that have no bussines logic and dont inherit
from any framework-specific class, it also help to create this builder patterns with the @Builder
annotation

HTTP requests like GET, POST, PUT, DELETE can be handled by separate annotations like @GetMapping,
@PostMapping, @PutMappping, and @DeleteMapping,

views use thymeleaf attributes

domain: representation of bussines entities, they also perform data validation
and tranformation

repository: component that provides a way to interact with data storage. It typically provides CRUD 
perations on a particular domain entity or collection of entities

servivces: component that contains business logic and performs operations on data. It typically 
sits between the controller layer and the repository layer, and is responsible for processing requests,
performing validations, and orchestrating interactions with the data storage layer.
