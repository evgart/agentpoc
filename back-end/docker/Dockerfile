FROM centos:7

ADD dist /etc/
COPY docker/entrypoint.sh /app/
COPY target/back-end-*.jar /app/

RUN yum install -y lsb lsb-core alien

RUN yum install -y \
   java-1.8.0-openjdk \
   java-1.8.0-openjdk-devel

ENV JAVA_HOME /usr/lib/jvm/java-1.8.0-openjdk/

RUN mkdir /www && \
        cd /etc && \
        # Install cryptoPro
        tar -xf linux-amd64.tgz && \
        cd /etc/linux-amd64 && \
        ./install.sh

ENTRYPOINT ["sh", "-c", "/app/entrypoint.sh"]
