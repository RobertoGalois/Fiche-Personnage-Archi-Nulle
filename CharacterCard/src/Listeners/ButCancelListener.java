package Listeners;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ButCancelListener extends Listener
{
	public			ButCancelListener(JPanel p_transmitter)
	{
		super(p_transmitter);
	}
	public void		actionPerformed(ActionEvent e)
	{
		JOptionPane		msgBox = new JOptionPane();
		int				resp = msgBox.showConfirmDialog(this.m_transmitter,
														"Abandonner la création du personnage \n et fermer le programme ?",
														"Annulation de l'entrée",
														JOptionPane.YES_NO_OPTION,
														JOptionPane.WARNING_MESSAGE);
		
		if (resp == JOptionPane.OK_OPTION)
		{
			System.exit(0);
		}
	}
}
