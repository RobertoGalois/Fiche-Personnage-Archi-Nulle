package Listeners;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ButOkListener extends Listener
{ 	
	public			ButOkListener(JPanel p_transmitter)
	{
		super(p_transmitter);
	}
	
	public void		actionPerformed(ActionEvent e)
	{
		JOptionPane		msgBox = new JOptionPane();
		int				resp = msgBox.showConfirmDialog(this.m_transmitter,
														"Sauvegarder le personnage ?",
														"Validation de l'entrée",
														JOptionPane.YES_NO_OPTION,
														JOptionPane.QUESTION_MESSAGE);
	}
}
