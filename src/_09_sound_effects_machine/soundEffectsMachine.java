package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundEffectsMachine implements ActionListener {
	JButton button = new JButton();
	JButton yeetbutton = new JButton();
	
	public void yeetus() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		
		button.setText("saw");
		yeetbutton.setText("hammer nails");
		
		frame.add(panel);
		frame.setVisible(true);
		panel.add(button);
		panel.add(yeetbutton);
		button.addActionListener(this);
		yeetbutton.addActionListener(this);
		frame.pack();
		
		
	}
	
	public void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
		playSound("sawing-wood-daniel_simon.wav");
		}
		else if(e.getSource()==yeetbutton) {
			playSound("hammering.wav");
		}
		
	}

	
	
	
	
}
