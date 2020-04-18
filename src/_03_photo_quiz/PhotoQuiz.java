package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String patrick = "https://lh3.googleusercontent.com/proxy/m0aQOtQdxSIOmXUupsijkxmviY2RjTNMJJR4OsZjYVzmNT5w3MVXN-3n0ZFfVMoU1xDVJOyoa5UvY7-ZSTWE3_DrmFQBIIMXV8-hhu2K5Nr1hj3BiybPZ_EflGLsWZoJ9XU";
		// 2. create a variable of type "Component" that will hold your image
		Component image;
		// 3. use the "createImage()" method below to initialize your Component
		image = createImage(patrick);
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String ans = JOptionPane.showInputDialog("who is this?");
		// 7. print "CORRECT" if the user gave the right answer
		if(ans.equalsIgnoreCase("patrick")) {
			System.out.println("Correct");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("Incorrect");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
		Component pic;
		String naruto = "https://pluspng.com/img-png/png-naruto-image-naruto-sage-mode-render-by-ahmedovicce-d4mqn5e-png-mangapanda-wiki-fandom-powered-by-wikia-900.png";
		pic = createImage(naruto);
		// 11. add the second image to the quiz window
		quizWindow.add(pic);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answ = JOptionPane.showInputDialog("who is this");
		// 14+ check answer, say if correct or incorrect, etc.
		if(answ.equalsIgnoreCase("naruto")) {
			System.out.println("Correct");
		}
		
		else {
			System.out.println("Incorrect");
		}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
