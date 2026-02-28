# ETAPA 1: Compilación (Docker construye el JAR)
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
# Copiamos solo lo necesario para descargar dependencias primero (optimiza caché)
COPY pom.xml .
COPY src ./src
# Compilamos el proyecto saltando los tests para ir más rápido
RUN mvn clean package -DskipTests

# ETAPA 2: Ejecución (Imagen final ligera)
FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app
# Aquí está el truco: copiamos el archivo generado en la etapa 'build'
# Usamos un asterisco (*) para que no importe el nombre exacto del jar
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]