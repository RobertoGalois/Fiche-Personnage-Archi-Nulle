package formElements;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class AgeInputPanel extends InputPanel
{

	protected JRadioButton	m_jrb1525;
	protected JRadioButton	m_jrb2635;
	protected JRadioButton	m_jrb3650;
	protected JRadioButton	m_jrbG50;
	protected ButtonGroup	m_buttonGroup;
	
	public		AgeInputPanel()
	{
		super();
		this.setBorder(BorderFactory.createTitledBorder("Âge du personnage"));
		
		this.m_jrb1525 = new JRadioButton("15 - 25 ans");
		this.m_jrb2635 = new JRadioButton("26 - 35 ans");
		this.m_jrb3650 = new JRadioButton("36 - 50 ans");
		this.m_jrbG50 = new JRadioButton("+ de 50 ans");
		
		this.m_jrb1525.setSelected(true);
		
		this.m_buttonGroup = new ButtonGroup();
		this.m_buttonGroup.add(this.m_jrb1525);
		this.m_buttonGroup.add(this.m_jrb2635);
		this.m_buttonGroup.add(this.m_jrb3650);
		this.m_buttonGroup.add(this.m_jrbG50);
		
		this.setLayout(new FlowLayout());
		this.add(this.m_jrb1525);
		this.add(this.m_jrb2635);
		this.add(this.m_jrb3650);
		this.add(this.m_jrbG50);
	}

	public JRadioButton		getBut1525()	{ return (this.m_jrb1525);		}
	public JRadioButton		getBut2635()	{ return (this.m_jrb2635);		}
	public JRadioButton		getBut3650()	{ return (this.m_jrb3650);		}
	public JRadioButton		getButG50()		{ return (this.m_jrbG50);		}
	public ButtonGroup		getButGroup()	{ return (this.m_buttonGroup);	}
}
