package com.robertodev.springsecuritycrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class SpringSecurityCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityCrudApplication.class, args);
		//Realizando a Autenticação básica
		//Curso
		// 6.1. Implementando autenticação Basic
		/*RegraBásica
		
			Criar uma Classe que extenda a WebSecurityConfigurerAdapter
			Implementar os métodos 
				- configure(AuthenticationManagerBuilder auth) e
					Aqui informa em memória, usuário e senha
				- configure(HttpSecurity http)
					Aqui informa as configurações Stateless
					Quais apis são permitidas e para quem
			
			Para o Postman
				Marca a Authorization como Basic Auth
				informa o usuário e senha
				faz o preview request
				verificar que foi criado no header(cabeçalho) a informação
				Manda enviar a requisição
			*/
	}
}


