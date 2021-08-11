<h1 align="center">Microservices Spring Cloud</h1>

<p align="center">
<img src="./santander-bootcamp.png" height="150px" />
<img src="https://raw.githubusercontent.com/spring-projects/spring-framework/main/src/docs/spring-framework.png" height="150px" />
</p>

## About

This project was built based on the microservices architecture with Spring Cloud framework.

This Project was developed for Santander Bootcamp Fullstack Developer in Digital Innovation One.

1. Product Catalog
2. Shopping Cart
3. Config Server
4. Service Discovery
5. Gateway
6. Config Repo (YAML files)

## Technologies

Main

* Java 11
* Spring Boot 2.5.3
* Maven 4.0
* ElasticSearch
* Redis
* Spring Cloud Config Server
* Spring Cloud Eureka Server
* Spring Cloud Gateway

## Run Project

### Clone Project

```git
git clone https://github.com/thiagotrs/microservices-spring-cloud.git
```

### Config Server

```ssh
cd configserver
mvn spring-boot:run
```

### Service Discovery

```ssh
cd servicediscovery
mvn spring-boot:run
```

### Shopping Cart

```ssh
cd shoppingcart
mvn spring-boot:run
```

### Product Catalog

```ssh
cd productcatalog
mvn spring-boot:run
```

### Gateway
```ssh
cd gateway
mvn spring-boot:run
```

### URLs

```
http://localhost:8080/cart
http://localhost:8080/product
```

## Author

Thiago Rotondo Sampaio - [GitHub](https://github.com/thiagotrs) / [Linkedin](https://www.linkedin.com/in/thiago-rotondo-sampaio) / [Email](mailto:thiagorot@gmail.com)

## License

This project use MIT license, see the file [LICENSE](./LICENSE.md) for more details

---

<p align="center">Develop by <a href="https://github.com/thiagotrs">Thiago Rotondo Sampaio</a></p>