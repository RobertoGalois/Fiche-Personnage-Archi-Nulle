package subPanels;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class ScreenPanel extends JPanel
{
	protected FormPanel			m_formPanel;
	protected IllustrationPanel	m_illustrationPanel;
	
	public		ScreenPanel()
	{	
		super();
		
		GridBagConstraints		gbc = new GridBagConstraints();
		
		this.m_formPanel = new FormPanel();
		this.m_illustrationPanel = new IllustrationPanel();
	
		this.setLayout(new GridBagLayout());
		
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 0.5;
        gbc.weighty = 1;
        this.add(this.m_illustrationPanel, gbc);
        
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.weightx = 0.5;
        gbc.weighty = 1;
        this.add(this.m_formPanel, gbc);    
	}
	
	public FormPanel			getFormPanel()			{ return (this.m_formPanel);			}
	public IllustrationPanel	getIllustrationPanel()	{ return (this.m_illustrationPanel);	}
}
