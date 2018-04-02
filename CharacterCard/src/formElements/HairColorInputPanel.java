package formElements;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HairColorInputPanel extends InputPanel
{
	protected JLabel			m_label;
	protected JComboBox<String> m_comboBox;
	protected String[]			m_choices;
	
	public		HairColorInputPanel()
	{
		super();
		this.setBorder(BorderFactory.createTitledBorder("Couleur de cheveux du personnage"));
		
		this.m_choices = new String[] {"Blancs", "Blonds", "Bruns", "Châtains", "Noirs", "Roux"};
		this.m_label = new JLabel("Cheveux: ");
		this.m_comboBox = new JComboBox<String>(this.m_choices);
		this.add(this.m_label);
		this.add(this.m_comboBox);
	}

	public JComboBox		getComboBox()		{ return (this.m_comboBox);	}
}
