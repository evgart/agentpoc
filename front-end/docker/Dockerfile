FROM centos:7


COPY docker/entrypoint.sh .
COPY target/front-end-*.jar /app/

RUN yum install -y \
   java-1.8.0-openjdk \
   java-1.8.0-openjdk-devel

ENV JAVA_HOME /usr/lib/jvm/java-1.8.0-openjdk/

ENTRYPOINT ["sh", "-c", "/app/entrypoint.sh"]