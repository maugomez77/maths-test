
### Build and run

#### Configurations

Open the `application.properties` file and set your own configurations.

#### Prerequisites

- Java 8
- Maven > 3.0

#### From terminal

Go on the project's root folder, then type:

    $ mvn spring-boot:run


### RESTFul Operations 
RESTful to add a contact to the app: 
POST http://localhost:8080/contacts/
```
    {
  		"id": 7,
  		"name": "name23213",
  		"email": "email3213",
  		"profession": "profession323"
	}
```
