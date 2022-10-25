FROM openjdk-17.0

#WORKDIR /springServer
COPY . .
RUN javac Login.java

RUN java Login