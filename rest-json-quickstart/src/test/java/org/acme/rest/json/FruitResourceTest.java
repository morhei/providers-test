package org.acme.rest.json;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;

import javax.ws.rs.core.MediaType;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class FruitResourceTest {

	@Test
	void testGet() {
		String res = given().when().get("/fruits").then().statusCode(200).extract().asString();
		assertThat(res).as("Unexpected response").contains("fruitName", "");
	}

	@Test
	public void testAdd() {
		given().body("{\"name\": \"Pear\", \"description\": \"Winter fruit\"}")
				.header("Content-Type", MediaType.APPLICATION_JSON).when().post("/fruits").then().statusCode(200)
				.body("$.size()", is(3), "fruitName", containsInAnyOrder("Apple", "Pineapple", "Pear"), "fruitDesc",
						containsInAnyOrder("Winter fruit", "Tropical fruit", "Winter fruit"));
	}
}
