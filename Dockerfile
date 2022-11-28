FROM openjdk:11
LABEL maintainer="avdhootj"
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} mailerman.jar
ENTRYPOINT ["java","-jar","mailerman.jar"]
EXPOSE 9001