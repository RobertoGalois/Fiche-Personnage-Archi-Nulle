package subPanels;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ValidationPanel extends JPanel 
{
	protected JButton	m_okButton;
	protected JButton	m_cancelButton;
	
	public		ValidationPanel()
	{
		super();
		this.setBackground(Color.WHITE);
		
		this.m_okButton = new JButton("OK");
		this.m_cancelButton = new JButton("Annuler");
		
		this.setLayout(new FlowLayout());
		this.add(this.m_okButton);
		this.add(this.m_cancelButton);
	}
	
	public JButton			getOkButton()		{ return (this.m_okButton);		}
	public JButton			getCancelButton()	{ return (this.m_cancelButton);	}
}
