package br.com.agtec.ConfigurationBeanExample2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendasController {

	@Autowired
	@Qualifier("projectName")
	private String projectName;
	
	
	@GetMapping("/configs")
	public String getConfiguration() {
		
		return projectName;
		
	}
}
