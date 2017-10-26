FROM openjdk:8-jdk-alpine

COPY . /home/app/greeting

RUN adduser -S app && chown -R app /home/app/greeting

USER app

WORKDIR /home/app/greeting
RUN ./gradlew build

EXPOSE 8080

CMD ["java", "-jar", "build/libs/greeting-0.0.1-SNAPSHOT.jar"]

