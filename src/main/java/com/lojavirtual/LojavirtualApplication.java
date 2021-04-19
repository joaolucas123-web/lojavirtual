package com.lojavirtual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import domain.Categoria;

@SpringBootApplication
public class LojavirtualApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojavirtualApplication.class, args);
		
		
	    System.out.println("BANCO RODANDO");
		
	    Categoria cat1 = new Categoria(1,"camisetas");
	    
	    Categoria cat2 = new Categoria(2,"calça");
	    
	    
	    System.out.println(" categoria 1: " + cat1.getNome() + " categoria 2: " + cat2.getNome());
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
