# Online-Bookstore-spring-boot-app
* Developed a RESTful API using Spring Boot for managing an online bookstore.
* Implemented CRUD operations for books, including title, author, category, and price.
* Used MySQL as the database and Spring Data JPA for persistence.
* Frontend Link: https://github.com/AyushmanD/Online-BookStore-frontend-UI

## Probable Interview Questions ##
Q1. Can you give me an overview of the Online Bookstore API?
Answer: 
* I developed a RESTful API using spring boot to manage an online bookstore.
* The API provides CRUD operations for managing the book, allowing users to add, update, delete and retrieve books.
* Each book contains attributes such as title, author, category and price.
* I used mysql as a database and used Spring Data Jpa for  data persistence, ensuring efficient interaction with the database.

Q2. What are the key endpoints that you implemented in this API?
Answer: 
Some of the key endpoints that I have implemented are
* POST to add a book
* GET to retrieve all the books or book by Id
* PUT to update the book details
* DELETE to delete a book

Q3. How does spring data jpa simplify database interaction in your project?
Answer:
* Spring Data Jpa simplifies database interaction by providing built in methods for common operations like save, find, delete, and update.
* It eliminates the need of writing boilerplate SQL queries.
* I used JpaRepository, which allowed me to perform the CRUD operations efficiently without manually writing the queries. 

Q4. How did you handle exceptions in your API?
Answer:
* I implemented the exception handling mechanism by creating custom Exception classes.
* That ensures that when any error occurs the user gets a meaningful error response rather than a system generated error.
* For example if a book is not found I throw a BookNotFoundException.

Q5. Did you ensure that the API follows RESTful principles?
Answer: 
Yes, I have ensured that the API follows RESTful principles
* The client and server are separated allowing them to evolve independently, the client requests resources and the server responds with the requested data or performs actions which ensure client-server architecture principle.
* Each request from the clients contains all the information that the server needs to process it, and the server doesn’t store any session data which ensures statelessness principle.
* The response is defined whether they can be cached or not, so can it reduce the server load and improve performance which ensures cacheability principle.
* The API follows a consistent structure in its endpoints and responses, which ensures the uniform interface principle.
* The API is designed in multiple layers such as Client layer which is frontend,API layer which is Spring Boot Controller, Service layer which is the java class according to required logic, Data access layer which is the JpaRepository and Database layer which is mysql this ensures that the client doesn’t directly interact with database ensuring Layered System principle.

Q6. How did you test your API?
Answer:
* I tested my api by manually giving requests through POSTMAN and verifying the responses.
