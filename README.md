# VANILLA 
Vanilla is a multi-module maven project with Spring Boot backend and Angular frontend using ngx-admin starter kit.
Ready to clone and use in your next application as a starting point to develop [Modular Monolith](http://www.kamilgrzybek.com/design/modular-monolith-primer/).

## Features
- Multi-module Maven project
- Spring Boot
- Angular
- ngx-admin with Nebular Theme by [Akveo](https://akveo.com/)
- Hot reloading of frontend changes
- Sample API integration setup 

If you need more features, and a commercial support **consider buying Akveo [Java/Spring Starter Bundle](https://store.akveo.com/products/java-spring-starter-bundle?variant=15404085018673)** to support their effort.

## TODO
- Better CORS and CSRF handling
- Authentication and Authorization 
- Integration with [Keycloak](https://www.keycloak.org/)
- Example of [Hexagonal Architecture](https://reflectoring.io/spring-hexagonal/)
- Docker support 
 
## Usage
### Production
./mvnw clean install 

java -jar service/target/vanilla-service-0.0.1-SNAPSHOT.jar 

Open the browser [http://localhost:8080](http://localhost:8080)

### Development
cd service

../mvnw spring-boot:run

cd web

../mvnw frontend:install-node-and-npm

npm run start

Open the browser [http://localhost:4200](http://localhost:4200)

## References:
- [ngx-admin by Akveo](https://github.com/akveo/ngx-admin)
- [Spring Guides by VMware](https://spring.io/guides)
- [Angular docs by Google](https://angular.io/docs)
- [Modular Monolith](http://www.kamilgrzybek.com/design/modular-monolith-primer/)
- [Hexagonal Architecture](https://reflectoring.io/spring-hexagonal/)
- [A Minimalist Guide to Building Spring Boot Angular 5 Applications](https://shekhargulati.com/2017/11/08/a-minimalist-guide-to-building-spring-boot-angular-5-applications/)
- [How do I set the baseUrl for Angular HttpClient](https://stackoverflow.com/questions/45735655/how-do-i-set-the-baseurl-for-angular-httpclient)
