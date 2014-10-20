/**
 * ZombieRogue Game by Matt Silvey - Cuzit
 * @author cuzit
 * Documentation goes here.
 * This file starts the game.
 */
package game;

import java.awt.*;
import javax.swing.*;

public class Start extends JFrame {
	Screen display = new Screen();
	
	public Start() {
		//Screen display = new Screen();
		add(display);
		
		setResizable(false);
		setUndecorated(true);
		setBackground(Color.BLACK);
		setFocusable(true);
		//pack();
		setSize(display.getScreenWidth(), display.getScreenHeight());
		
		setTitle("ZombieRouge");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public Screen getScreen() {
		return display;
	}
	
	public static void main(String[] args) {
		System.out.println("Game initializing...");
		
		JFrame game = new Start();
		game.setVisible(true);
		
		/*while(game.getScreen().getRunning()) {
			//Do game
			
		}*/
		
		/*EventQueue.invokeLater(new Runnable() {
			@Override 
			public void run() {
				JFrame game = new Start();
				System.out.println(game.toString());
				game.setVisible(true);
			}
		});*/

	}

}
