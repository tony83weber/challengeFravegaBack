package challenge;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class UserApiTest {

    
	//Variables globales 
    private static final String BASE_URL = "https://gorest.co.in/public/v2";
    private static final String TOKEN = "cc88d901ffb4b2b6a4d5604edaf5d0ea17fd59043d1c84ecdb9c1a83293cf085";
    private static final String NOMBRE_USUARIO = "toty passman";

    //crear mails 
    private String generarEmailAleatorio(String baseName) {
       long numeroAleatorio = System.currentTimeMillis(); // esta funcion genera un valor unico
       String numeroFormateado = String.valueOf(numeroAleatorio); 
        return baseName + numeroFormateado + "@gmail.com";
    }

    //Funcion para crear usuario
    private int crearUsuario(String nombre, String email) {
       
                String requestBody = String.format(
                    "{\n" +
                    "    \"name\": \"%s\",\n" +
                    "    \"gender\": \"male\",\n" +
                    "    \"email\": \"%s\",\n" +
                    "    \"status\": \"active\"\n" +
                    "}", nombre, email);

        return given()
                .baseUri(BASE_URL)
                .header("Authorization", "Bearer " + TOKEN)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .extract()
                .path("id");
    }

    @Test
    public void crearUsuario() {
        String email = generarEmailAleatorio("totygoat");
        int userId = crearUsuario(NOMBRE_USUARIO, email);
        System.out.println("Usuario creado con ID: " + userId);
    }

    @Test
    public void listarUsuarios() {
    	//Listamos usuarios 
        RestAssured.baseURI = BASE_URL;

        Response response = given()
                .baseUri(BASE_URL)
                .header("Authorization", "Bearer " + TOKEN)
                .contentType(ContentType.JSON)
                .when()
                .get("/users")
                .then()
                .statusCode(200)
                .extract()
                .response();

        List<Map<String, Object>> usuarios = response.jsonPath().getList("");
        usuarios.forEach(usuario -> {
            usuario.forEach((clave, valor) -> System.out.println(clave + ": " + valor));
            System.out.println("******************");
        });
    }

    @Test
    public void crearYBuscarUsuario() {
    	
    	
        String email = generarEmailAleatorio("totygoat");
        int userId = crearUsuario(NOMBRE_USUARIO, email);

        Response response = given()
                .baseUri(BASE_URL)
                .header("Authorization", "Bearer " + TOKEN)
                .contentType(ContentType.JSON)
                .pathParam("id", userId)
                .when()
                .get("/users/{id}")
                .then()
                .statusCode(200)
                .extract()
                .response();

        System.out.println("Detalles del usuario:");
        System.out.println("ID: " + response.jsonPath().getInt("id"));
        System.out.println("Nombre: " + response.jsonPath().getString("name"));
        System.out.println("Email: " + response.jsonPath().getString("email"));
    }
}
