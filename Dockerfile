FROM openjdk:17
EXPOSE 9090
ADD target/springboot-image-new.jar springboot-image-new.jar
ENTRYPOINT ["java","-jar","/springboot-image-new.jar"]
