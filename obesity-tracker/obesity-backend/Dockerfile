
FROM openjdk:8-jdk-alpine as builder

RUN apk update
RUN apk add maven

WORKDIR /java-app

COPY pom.xml .

RUN mvn dependency:resolve-plugins
RUN mvn dependency:copy-dependencies

COPY src ./src

RUN mvn package


FROM openjdk:8-jdk-alpine

WORKDIR /java-app

COPY --from=builder /java-app/target/obesitytracker-1.0.0.jar .

EXPOSE 8080

CMD [ "java", "-jar", "obesitytracker-1.0.0.jar" ]
