package br.com.agtec.ConfigurationBeanExample2.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {

	@Bean(name="projectName")
	public String getProjectName() {
		return "Configuration Example";
	}
}
