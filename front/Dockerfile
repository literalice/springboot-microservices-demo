FROM openjdk:8-jdk-alpine

COPY . /home/app/front

RUN adduser -S app && chown -R app /home/app/front

USER app

WORKDIR /home/app/front
RUN ./gradlew build

EXPOSE 8080

CMD ["java", "-jar", "build/libs/front-0.0.1-SNAPSHOT.jar"]

