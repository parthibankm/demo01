#FROM openjdk:18
#WORKDIR /app
#COPY ./target/demo01-0.0.1-SNAPSHOT.jar /app
#EXPOSE 5000
#CMD ["java", "-jar", "demo01-0.0.1-SNAPSHOT.jar"]


#def mvnHome = tool 'maven'
#def dockerHome = tool 'docker'
#env.PATH ="${dockerHome}/bin:${mvnHome}/bin:${env.PATH}"

FROM openjdk:18
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY src ./src
CMD ["./mvnw", "spring-boot:run"]