# 1. Imagen base con Java 21 la imagen "21-jdk" descargará Java 21.
FROM eclipse-temurin:21-jdk


# 2. Creamos un directorio dentro del contenedor
# Crea la carpeta /app dentro del contenedor y se "mete" en ella (como un 'cd /app').
WORKDIR /app

# 3. Copiamos el paquete completo "ingenieriasoftware"
# Toma la carpeta "src" de la computadora y la pega en "/app/src" dentro del contenedor.
COPY src ./src

# 4. Compilamos el programa
# Ejecuta el compilador 'javac'.
# Esto crea el archivo .class al lado del .java dentro del contenedor.
RUN javac src/ingenieriasoftware/Convertir.java

# 5. Ejecutamos el programa
# Este comando se dispara cuando haces 'docker run'.
# "java": El comando para correr Java.
# "-cp src": Le dice a Java que busque las clases (classpath) dentro de la carpeta 'src'.
# "ingenieriasoftware.Convertir": El nombre completo de tu clase (paquete.Clase).
CMD ["java", "-cp", "src", "ingenieriasoftware.Convertir"]

