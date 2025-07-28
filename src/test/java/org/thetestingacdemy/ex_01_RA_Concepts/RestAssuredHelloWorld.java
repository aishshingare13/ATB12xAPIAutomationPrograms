package org.thetestingacdemy.ex_01_RA_Concepts;

import io.restassured.RestAssured;

public class RestAssuredHelloWorld {
    public static void main(String[] args) {

        //verify the api - https://api.postalpincode.in/pincode/560036
        //baseUri
//        RestAssured.given()
//                .baseUri("https://api.postalpincode.in")
//                .basePath("/pincode/560036")
//
//                .when()
//                .get()
//
//                .then()
//                .statusCode(200);

        RestAssured.given()
                .baseUri("https://api.postalpincode.in/pincode/560036")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
