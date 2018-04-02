package formElements;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GenderInputPanel extends InputPanel
{
	protected JLabel				m_label;
	protected JComboBox<String>		m_comboBox;
	protected String[]				m_choices;
	
	public		GenderInputPanel()
	{
		super();
		this.setBorder(BorderFactory.createTitledBorder("Genre du personnage"));
		
		this.m_choices = new String[] {"Masculin", "Féminin", "Indéterminé"};
		this.m_label = new JLabel("Genre: ");
		this.m_comboBox = new JComboBox<String>(this.m_choices);
		this.setLayout(new FlowLayout());
		this.add(this.m_label);
		this.add(this.m_comboBox);
	}
	
	public JComboBox		getComboBox()		{ return (this.m_comboBox);		}
}
