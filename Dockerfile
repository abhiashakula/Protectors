FROM openjdk:19


COPY / /app
WORKDIR /app
CMD ["java" , "-classpath","out/production/Protectors", "atm_fingerprint.ATMMain"]