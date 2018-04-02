package subPanels;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

import formElements.AgeInputPanel;
import formElements.GenderInputPanel;
import formElements.HairColorInputPanel;
import formElements.HeightInputPanel;
import formElements.NameInputPanel;

public class FormPanel extends JPanel
{
	protected NameInputPanel		m_nameInputPanel;
	protected GenderInputPanel		m_genderInputPanel;
	protected AgeInputPanel			m_ageInputPanel;
	protected HeightInputPanel		m_heightInputPanel;
	protected HairColorInputPanel	m_hairColorInputPanel;
	
	public		FormPanel()
	{
		super();
		this.setBackground(Color.WHITE);
		
		GridBagConstraints		gbc = new GridBagConstraints();
		
		/* initialization of instance variables */
		this.m_nameInputPanel = new NameInputPanel();
		this.m_genderInputPanel = new GenderInputPanel();
		this.m_ageInputPanel = new AgeInputPanel();
		this.m_heightInputPanel = new HeightInputPanel();
		this.m_hairColorInputPanel = new HairColorInputPanel();
		
		this.setLayout(new GridBagLayout());
		gbc.insets = new Insets(2, 2, 2, 2);
		
		/* setting m_nameInputPanel */
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        gbc.weightx = 0.5;
        gbc.weighty = 0.3;
        this.add(this.m_nameInputPanel, gbc);
		
        /* setting m_genderInputPanel */
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.weightx = 0.5;
        gbc.weighty = 0.3;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        this.add(this.m_genderInputPanel, gbc);
        
        /* setting m_ageInputPanel */
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1;
        gbc.weighty = 0.3;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        this.add(this.m_ageInputPanel, gbc);
        
        /* setting m_heightInputPanel */
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        gbc.weightx = 0.5;
        gbc.weighty = 0.3;
        this.add(this.m_heightInputPanel, gbc);
        
        /* setting m_hairColorInputPanel */
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.weightx = 0.5;
        gbc.weighty = 0.3;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        this.add(this.m_hairColorInputPanel, gbc);
	}
	
	public NameInputPanel		getNameInputPanel()			{ return (this.m_nameInputPanel); 		}
	public GenderInputPanel		getGenderInputPanel()		{ return (this.m_genderInputPanel);		}
	public AgeInputPanel		getAgeInputPanel()			{ return (this.m_ageInputPanel); 		}
	public HeightInputPanel		getHeightInputPanel()		{ return (this.m_heightInputPanel);		}
	public HairColorInputPanel	getHairColorInputPanel()	{ return (this.m_hairColorInputPanel);	}
}
