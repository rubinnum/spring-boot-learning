# Notes

### The concept of **dependency injection (DI)**
- Components annotated with stereotypes like <code>@Component</code>, <code>@Service</code>, <code>@Repository</code>, etc., indicate their role in the application.
- Dependencies are injected into components using <code>@Autowired</code> annotation on *fields, constructors*, or *setter methods*.
- **During application startup**, Spring scans for components and creates instances of them, managing their lifecycle within the application context.
- Spring resolves dependencies *by looking for matching beans* in the application context and automatically injecting them into dependent components.
- ***Beans are instantiated only once***, and the same object instance is used for all references within the application context.

### Database Connectivity and ORM Essentials in Spring Boot 
- **Java Persistence API (JPA)** is a Java specification for managing relational data in Java applications. It provides a *standard way to map Java objects to relational database tables* and vice versa.
- **Hibernate** is a popular object-relational mapping (ORM) framework for Java. It *implements the JPA specification* and provides additional features and enhancements. Hibernate simplifies the development of database-driven applications by abstracting away the details of database interactions and allowing developers to work with Java objects instead.
- **JPA vs JDBC.** JDBC (Java Database Connectivity) is a lower-level API for interacting with databases in Java applications. It requires writing SQL queries and handling database connections, statements, and result sets manually. JPA, on the other hand, *provides a higher-level abstraction over JDBC*, allowing developers to work with objects and entity relationships instead of directly dealing with SQL.
- **Object-Relational Mapping (ORM)**  is a programming technique for converting data between incompatible systems—in this case, between object-oriented programming languages and relational databases. ORM frameworks like Hibernate automate the *mapping between database tables and Java objects*, allowing developers to work with objects in their code while transparently persisting data to and retrieving data from the database.
- **Data Access Object (DAO)**  is a design pattern used to abstract and encapsulate the access to a data source, such as a database. It provides a uniform interface for accessing and manipulating data, decoupling the business logic from the data access logic. DAOs typically contain methods for CRUD (Create, Read, Update, Delete) operations on data entities.
- **Connect to Database using Spring Boot.** To connect to a database, you can configure the database connection properties in the *application.properties* file and use Spring Data JPA repositories to interact with the database.
- **Repository** is typically used as a component responsible for *data access operations*, such as querying, saving, updating, and deleting data from a database or any other data source.
- **Configuration**  refers to the process of *defining and configuring beans, components, and other application settings* in a Spring application context.

### Adding POST Request to my API
- <code>@PostMapping</code>: Used to handle HTTP POST requests in the *Controller*. Annotated methods will be invoked for HTTP POST requests matching the specified URL pattern.
- <code>@RequestBody</code>: An annotation used in the *Controller* to indicate that the method parameter should be bound to the body of the HTTP request. In this case, the Student object is retrieved from the request body and used as input for adding a new student to the database.
- <code>@Query</code> and **JPQL**: In the *Repository*, the <code>@Query</code> annotation is used to define a *custom JPQL query* for finding a student by email. **JPQL (Java Persistence Query Language)** is an object-oriented query language used to *interact with JPA entities*. It allows for more flexible and complex queries than the default methods provided by Spring Data JPA, such as finding entities by specific properties.

### Adding DELETE Request to my API
- <code>@DeleteMapping</code>: An annotation used to handle HTTP DELETE requests in the controller. The path attribute specifies the URL pattern for the endpoint, and <code>{studentId}</code> is a *placeholder* for the student's ID.
- <code>@PathVariable</code>: An annotation used to bind a method parameter to a URI template variable. In this case, <code>@PathVariable("studentId")</code> extracts the student ID from the URI path and maps it to the studentId parameter of the deleteStudent method.