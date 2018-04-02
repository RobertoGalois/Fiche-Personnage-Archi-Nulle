package formElements;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NameInputPanel extends InputPanel
{
	protected JLabel		m_label;
	protected JTextField	m_textField;
	
	public		NameInputPanel()
	{
		super();
		this.setBorder(BorderFactory.createTitledBorder("Nom du personnage"));
		
		this.m_label = new JLabel("Saisir un nom: ");
		this.m_textField = new JTextField();
		
		this.m_textField.setPreferredSize(new Dimension(220, 30));
		
		
		
		this.setLayout(new FlowLayout());
		this.add(this.m_label);
		this.add(this.m_textField);
	}
}
