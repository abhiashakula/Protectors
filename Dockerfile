FROM openjdk:19

# WORKDIR /Pr
COPY src .

RUN java -cp ".:resources/*" atm_fingerprint/ATMMain.java
