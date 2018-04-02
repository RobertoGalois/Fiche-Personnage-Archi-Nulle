package mainElements;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import subPanels.ScreenPanel;
import subPanels.ValidationPanel;
import Listeners.ButCancelListener;
import Listeners.ButOkListener;

public class MainPanel extends JPanel
{
	protected ScreenPanel			m_screenPanel;
	protected ValidationPanel		m_validationPanel;
	protected ButOkListener			m_butOkListener;
	protected ButCancelListener		m_butCancelListener;
	
	public		MainPanel()
	{
		super();
	
		/* set instance variables */
		this.m_screenPanel = new ScreenPanel();
		this.m_validationPanel = new ValidationPanel();
		this.m_butOkListener = new ButOkListener(this);
		this.m_butCancelListener = new ButCancelListener(this);
		
		this.setLayout(new BorderLayout());
		this.add(this.m_screenPanel, BorderLayout.CENTER);
		this.add(this.m_validationPanel, BorderLayout.SOUTH);
		
		this.m_validationPanel.getOkButton().addActionListener(this.m_butOkListener);
		this.m_validationPanel.getCancelButton().addActionListener(this.m_butCancelListener);
	}

	public ScreenPanel		getScreenPanel() 		{ return (this.m_screenPanel);		}
	public ValidationPanel	getValidationPanel()	{ return (this.m_validationPanel);	}
}
