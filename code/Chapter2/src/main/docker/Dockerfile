FROM openjdk:8-jdk-alpine
RUN  apk update && apk upgrade && apk add netcat-openbsd
RUN mkdir -p /usr/local/remile
ADD  @project.build.finalName@.jar /usr/local/remile/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh
