package org.thetestingacdemy.ex_04_RestAssured_HTTP_Methods.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab013_PATCH_NONBDDStyle {
    @Test
    public void test_patch_non_bdd() {


        String token = "ee8e2c3e77ea4f9";
        String bookingid = "3155";

        String payloadPatch = "{\n" +
                "    \"firstname\" : \"Lucky\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";


        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/" + bookingid);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token", token);

        requestSpecification.body(payloadPatch).log().all();

        Response response = requestSpecification.when().patch();

        ValidatableResponse validatableResponse = response.then().log().all();

        validatableResponse.statusCode(200);

    }
}
