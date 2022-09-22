package br.com.agtec.ConfigurationBeanExample2.Anotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/*
 * Anotação que indicará o perfil de desenvolvimento. Uma ou várias classes
 * Configuration podem receber essa anotação. Ver uso na classe WebConfiguration
 */
@Target(ElementType.TYPE) //Define que a anotação só pode ser usada em classes/enums/interfaces
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@Profile("development")
public @interface DesenvolvimentoConfiguration {

}
