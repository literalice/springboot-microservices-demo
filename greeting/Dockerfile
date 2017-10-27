FROM openjdk:8-jdk-alpine

COPY ./gradlew /home/app/greeting/gradlew
COPY ./gradle /home/app/greeting/gradle

RUN adduser -S app && chown -R app /home/app/greeting

USER app

WORKDIR /home/app/greeting

RUN ./gradlew --version

COPY . /home/app/greeting

RUN ./gradlew build && cp -f build/libs/greeting-0.0.1-SNAPSHOT.jar ./app.jar

EXPOSE 8080

CMD ["java", "-jar", "./app.jar"]

