FROM java:8-jdk-alpine

COPY ./build/libs/springboot_with_splunk-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch springboot_with_splunk-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","springboot_with_splunk-0.0.1-SNAPSHOT.jar"]

