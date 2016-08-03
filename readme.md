
## Math Test to solve an equation

Build a root finding solver for an equation as described below:

a sin X + bX 2 + cX + d = 0

where X is the variate, a, b, c are coefficients and d is a constant.

Expose this solver through a REST API with following signature.

#### Prerequisites

- Java 8
- Maven > 3.0

#### From terminal

Go on the project's root folder, then type:

$ mvn spring-boot:run

This will deploy the new app on the following port: http://127.0.0.1:8080/

#### To compile, To Test and To Download the required libraries for the project

$ mvn clean install

#### To run unit test

$ mvn clean test

### RESTFul Operations http://127.0.0.1:8080

###### Purpose of the Endpoint: RESTful to solve the following equation: a sin X + bX 2 + cX + d = 0
###### HTTP Method: POST
###### Request Resource Path: /v1/solver
```
    { 
        "coefficients" : [ 2, 2 , -59 , -29 ], 
        "searchRange" : [ 0 , 100 ]
    }
```

###### Response Resource Path: 
```
    {
  		"root": 30
 	}
```
