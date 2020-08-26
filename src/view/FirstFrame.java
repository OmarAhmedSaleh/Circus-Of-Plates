package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import controller.NewGameListener;

@SuppressWarnings("serial")
public class FirstFrame extends JFrame{
	private static FirstFrame instance;
	
	private JPanel panel;
	private JButton newGameBtn;
	
	private FirstFrame() {
		super("Circus Of Plates");
	}
	
	public static FirstFrame getInstance() {
		if(instance == null) {
			instance = new FirstFrame();
		}
		return instance;
	}

	public void showFrame() {
		newGameBtn = new JButton("Start a new game!");
		newGameBtn.addActionListener(new NewGameListener());
		
		panel = new JPanel();
		panel.add(newGameBtn);
		add(panel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
}
