FROM openjdk:17.0.5
EXPOSE 8086
ADD target/jenkins-job.jar jenkins-job.jar
ENTRYPOINT ["java","-jar","/jenkins-job.jar"]