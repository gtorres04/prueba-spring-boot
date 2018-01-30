/**
 * 
 */
package com.example.facturacionwsboot.resources;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.facturacionwsboot.dto.Cliente;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gtorress
 *
 */
@Controller
@RequestMapping("/cliente")
public class ClienteResource {

	
	public ClienteResource() {
	}

	
	@PostMapping(produces = APPLICATION_JSON_VALUE)
	public HttpEntity<Cliente> create(@RequestBody Cliente dto) {
		Cliente resource = dto;
		resource.setNombre("Evelin");
		return new ResponseEntity<>(resource, HttpStatus.OK);
	}
	
	@GetMapping(produces = APPLICATION_JSON_VALUE)
	public HttpEntity<List<Cliente>> list() {
		List<Cliente> resources = new ArrayList<>();
		Cliente resource = new Cliente();
		resource.setId(1l);
		resource.setNombre("Ever");
		resource.setApellido("Blanco");
		resources.add(resource);
		return new ResponseEntity<>(resources, HttpStatus.OK);
	}

}
