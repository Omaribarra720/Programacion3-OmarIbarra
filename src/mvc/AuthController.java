package mvc;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class AuthController {
	private JFrame frame;
	private AuthView view;

	public AuthController() {
		frame = new JFrame();
		frame.setVisible(false);
		frame.setBounds(100, 100, 800, 810);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0,1,0,2));
		view= new AuthView();
		

	}
	public void Login() {
		frame.add(view.Login());
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
		
		
	}

}
