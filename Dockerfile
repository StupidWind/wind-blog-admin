FROM openjdk:8
MAINTAINER stupidwind<pex2460@163.com>
LABEL app="wind-blog-admin" version="1.0.0" by="stupidwind"
ARG JAR_FILE=wind-blog-admin-0.0.1-SNAPSHOT.jar
ARG PORT=9090
COPY target/${JAR_FILE} /wind-blog-admin.jar
ENTRYPOINT ["java", "-jar", "/wind-blog-admin.jar", "--spring.profiles.active=prod"]