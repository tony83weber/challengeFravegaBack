## Proyecto Rest-Assured API Testing

## tecnologias usadas
- Java 17
- Maven
- Rest-Assured
- JUnit 5

## Requisitos
- Tener **Java** y **Maven** instalados en tu máquina.
- Cuenta activa en la API GoRest para usar un **Bearer Token**.

## Instalación
1. Clonar el repositorio:
    ```bash
    https://github.com/tony83weber/challengeFravegaBack.git

2. Navegar a la carpeta rest-assured-test:
    ```bash
    cd rest-assured-test

3. Compilar e instalar las dependencias con Maven:
    ```bash
    mvn clean install

## Ejecución de pruebas
Para ejecutar las pruebas, utiliza el siguiente comando:
    
    mvn test

## Ejemplo de una ejecución exitosa:

[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running challenge.UserApiTest
id: 7668079
name: toty passman
email: totygoat1738173407981@gmail.com
gender: male
status: active
******************
id: 7668077
name: toty passman
email: totygoat1738173403613@gmail.com
gender: male
status: active
******************
id: 7668049
name: toty passman
email: totygoat1738173144028@gmail.com
gender: male
status: active
******************
id: 7668048
name: toty passman
email: totygoat1738173141442@gmail.com
gender: male
status: active
******************
id: 7668045
name: toty passman
email: totygoat1738173088483@gmail.com
gender: male
status: active
******************
id: 7668044
name: toty passman
email: totygoat1738173085265@gmail.com
gender: male
status: active
******************
id: 7668008
name: toty passman
email: totygoat1738172785264@gmail.com
gender: male
status: active
******************
id: 7668007
name: toty passman
email: totygoat1738172782176@gmail.com
gender: male
status: active
******************
id: 7667983
name: toty passman
email: totygoat1738172303723@gmail.com
gender: male
status: active
******************
id: 7667982
name: toty passman
email: totygoat1738172300973@gmail.com
gender: male
status: active
******************
Detalles del usuario:
ID: 7668178
Nombre: toty passman
Email: totygoat1738175958789@gmail.com
Usuario creado con ID: 7668179
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 7.857 s - in challenge.UserApiTest
[INFO] 
[INFO] Results:
[INFO]
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- jar:3.4.1:jar (default-jar) @ rest-assured-test ---
[WARNING] JAR will be empty - no content was marked for inclusion!
[INFO] Building jar: C:\Users\anton\rest-assured-test\target\rest-assured-test-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- install:3.1.2:install (default-install) @ rest-assured-test ---
[INFO] Installing C:\Users\anton\rest-assured-test\pom.xml to C:\Users\anton\.m2\repository\challenge\rest-assured-test\1.0-SNAPSHOT\rest-assured-test-1.0-SNAPSHOT.pom
[INFO] Installing C:\Users\anton\rest-assured-test\target\rest-assured-test-1.0-SNAPSHOT.jar to C:\Users\anton\.m2\repository\challenge\rest-assured-test\1.0-SNAPSHOT\rest-assured-test-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  12.252 s
[INFO] Finished at: 2025-01-29T15:39:24-03:00
[INFO] ------------------------------------------------------------------------