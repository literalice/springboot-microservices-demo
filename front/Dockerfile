FROM openjdk:8-jdk-alpine

COPY ./gradlew /home/app/front/gradlew
COPY ./gradle /home/app/front/gradle

RUN adduser -S app && chown -R app /home/app/front

USER app

WORKDIR /home/app/front

RUN ./gradlew --version

COPY . /home/app/front

RUN ./gradlew build && cp -f build/libs/front-0.0.1-SNAPSHOT.jar ./app.jar

EXPOSE 8080

CMD ["java", "-jar", "./app.jar"]

