package br.com.agtec.ConfigurationBeanExample2.Configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.agtec.ConfigurationBeanExample2.Anotations.DesenvolvimentoConfiguration;

@Configuration
@DesenvolvimentoConfiguration //Anotação personalizada que indica que essa classe só será chamada se o perfil ativo for o de desenvolvimento
public class WebConfiguration {

	/*
	 * Bean que pode ser usado em toda a aplicação. Ver Vendas Controller.
	 */
	@Bean(name="projectName")
	public String getProjectName() {
		return "Configuration Example";
	}
	
	/*
	 * Callback executado ao inicializar Spring. Pode ser feitos vários beans com esse objeto CommandLineRunner;
	 */
	@Bean
	public CommandLineRunner executar() {
		return args -> {
			System.out.println("Executando CommandLineRunner ...");
			System.out.println(args);
		};
	}
}
