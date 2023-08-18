FROM openjdk:17
EXPOSE 9090
ADD target/springboot-image-updated.jar springboot-image-updated.jar
ENTRYPOINT ["java","-jar","/springboot-image-updated.jar"]