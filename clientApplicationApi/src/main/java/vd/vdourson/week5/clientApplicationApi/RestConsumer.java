package vd.vdourson.week5.clientApplicationApi;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestConsumer {
	public static void getDoctorsAsJson() {
        RestTemplate restTemplate = new RestTemplate();

        String resourceUrl
          = "http://localhost:8080/api/doctors";

        // Fetch JSON response as String wrapped in ResponseEntity
        ResponseEntity<String> response
          = restTemplate.getForEntity(resourceUrl, String.class);
        
        String productsJson = response.getBody();
        
        System.out.println(productsJson);
    }
	
	public static void createDoctor() {
        RestTemplate restTemplate = new RestTemplate();

        String resourceUrl
          = "http://localhost:8080/api/doctors";
        
        String requestJson = "{\"name\":\"Delatour\",\"specialization\":\"Gynecologist\"}";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        
        HttpEntity<String> request = new HttpEntity<String>(requestJson, headers);

        // Send the request body in HttpEntity for HTTP POST request
        String productCreateResponse = restTemplate
               .postForObject(resourceUrl, request, String.class);
        
        System.out.println(productCreateResponse);
    }
	
}
