
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


import static io.restassured.RestAssured.given;



public class testApi {

    private final static String URL = "https://reqres.in/";


    @Test
    public void successUserRegTest() throws IOException {
        Specs.installSpecification(Specs.requestSpec(URL), Specs.responseSpecOK201());
        JSONObject json = new JSONObject(new String(Files.readAllBytes(Paths.get("src/test/resources/json/json.json"))));
        json.put("name", "Tomato");
        json.put("job", "Eat maket");
        Response response = given()
                .body(json.toString())
                .when()
                .post("api/users/")
                .then().log().all()
                .extract().response();
        JsonPath jsonPath = response.jsonPath();
        Assertions.assertEquals("Tomato", jsonPath.get("name"));
        Assertions.assertEquals("Eat maket", jsonPath.get("job"));


    }



}
