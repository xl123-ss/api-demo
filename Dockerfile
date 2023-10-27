FROM openjdk:17-slim
VOLUME /tmp
COPY api-demo.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]