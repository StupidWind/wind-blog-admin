FROM openjdk:8
MAINTAINER stupidwind<pex2460@163.com>
LABEL app="wind-blog-admin" version="1.0.0" by="stupidwind"
ARG JAR_FILE=wind-blog-admin-0.0.1-SNAPSHOT.jar
ARG PORT=9090
COPY ${JAR_FILE} /${JAR_FILE}
ENTRYPOINT ["java", "-jar", "/${JAR_FILE}", "--spring.profiles.active=prod"]