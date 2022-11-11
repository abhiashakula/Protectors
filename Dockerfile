FROM openjdk:19


COPY / /app
WORKDIR /app
CMD ["jav" , "-classpath","out/production/Protectors", "atm_fingerprint.ATMMain"]