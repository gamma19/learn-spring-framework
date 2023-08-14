package com.example.learnspringframework;

import com.example.learnspringframework.game.GameRunner;
import com.example.learnspringframework.game.MarioGame;
import com.example.learnspringframework.game.PacmanGame;
import com.example.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var game = new MarioGame();
		var pacmanGame = new PacmanGame();
		//var game = new SuperContraGame();
		var gameRunner = new GameRunner(pacmanGame);
		gameRunner.run();
	}

}
