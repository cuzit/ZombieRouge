package game;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Screen extends JPanel implements ActionListener {
	//Constants
	private final int SCREEN_WIDTH = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(); //800
	private final int SCREEN_HEIGHT = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight(); //600
	private final int SCREEN_SIZE = SCREEN_WIDTH * SCREEN_HEIGHT;
	
	//Variables
	private Timer time;
	private boolean running = true;
	
	//
	public Screen() {
		addKeyListener(new TAdapter());
		setBackground(Color.BLACK);
		setFocusable(true);
		
		setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
	}
	
	
	//Value Returns
	public int getScreenWidth() {
		return SCREEN_WIDTH;
	}
	
	public int getScreenHeight() {
		return SCREEN_HEIGHT;
	}
	
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	
	public boolean getRunning() {
		return running;
	}
	
	//ActionListeners
	//@Override
	public void actionPerformed(ActionEvent e) {
		//Do stuff for the game
		System.out.println("Something happened.");
	}
	
	private class TAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            if (key == KeyEvent.VK_P) {
                //KILLSWITCH
            	running = false;
            }
        }
    }
	
	//toString
	public String toString() {
		String screenString;
		
		screenString = "Variables" + "\n\n";
		screenString += "SCREEN_WIDTH = " + SCREEN_WIDTH + "\n";
		screenString += "SCREEN_HEIGHT = " + SCREEN_HEIGHT + "\n";
		screenString += "SCREEN_SIZE = " + SCREEN_SIZE + "\n";
		
		return screenString;
	}
}
