package Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Listener implements ActionListener
{
	protected JPanel	m_transmitter;
	
	public		Listener(JPanel p_transmitter)
	{
		this.m_transmitter = p_transmitter;
	}
	
	public void	actionPerformed(ActionEvent e)
	{
		
	}
}
