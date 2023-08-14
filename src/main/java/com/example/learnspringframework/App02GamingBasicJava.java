package com.example.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.learnspringframework.game.GameRunner;
import com.example.learnspringframework.game.MarioGame;
import com.example.learnspringframework.game.PacmanGame;
import com.example.learnspringframework.game.SuperContraGame;

public class App02GamingBasicJava {

	public static void main(String[] args) {
		var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		
		System.out.println(context.getBean("name"));
		
	}
	

}
