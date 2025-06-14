#Once you have google jib maven plugin, no need to write a Dockerfile

#Start with a base image containing Java runtime
FROM openjdk:21-jdk-slim

#Information about the maintainer of this image
MAINTAINER eazybytes.com

#Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar eazybytes-accounts-0.0.1.jar

#Command to run the jar file
ENTRYPOINT ["java","-jar","/eazybytes-accounts-0.0.1.jar"]