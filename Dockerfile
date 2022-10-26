FROM openjdk-17.0

#WORKDIR /Protectors
COPY . /src/atm_fingerprint
RUN javac Login.java

RUN java Login