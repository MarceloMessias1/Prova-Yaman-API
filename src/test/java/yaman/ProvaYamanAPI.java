package yaman;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ProvaYamanAPI {

	String baseUrl = "https://api.trello.com/1/actions/592f11060f95a3d3d46a987a";
	String path = "/list";

	Response response = RestAssured.get(baseUrl + path);

	@Test

	public void validarNome() {

		String name = response.getBody().path("name", "empregadoId");
		System.out.println(name);
		assertTrue(name.equals("Professional"));
	}

	@Test
	public void validarstatusCode() {

		assertEquals(200, response.getStatusCode());
	}
}
