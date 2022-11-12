FROM openjdk:17

# WORKDIR /Pr
COPY src .

RUN java -cp ".:resources/*" atm_fingerprint/ATMMain.java
