FROM openjdk-17.0

#WORKDIR /Protectors
COPY . .
RUN javac Login.java

RUN java Login