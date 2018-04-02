package	mainElements;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MainWindow extends JFrame
{
	public		MainWindow()
	{
		super();
		
		this.setTitle("Fiche Personnage");
		this.setContentPane(new MainPanel());
		this.setSize(new Dimension(700, 400));
		this.setMinimumSize(new Dimension(700, 400));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
