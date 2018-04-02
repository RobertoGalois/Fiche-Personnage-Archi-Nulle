package formElements;

import java.awt.Dimension;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;

public class HeightInputPanel extends InputPanel
{
	protected JLabel				m_label;
	protected JFormattedTextField	m_textField;
	
	public		HeightInputPanel()
	{
		super();
		this.setBorder(BorderFactory.createTitledBorder("Taille du personnage"));
		
		this.m_label = new JLabel("Taille (cm): ");
		try
		{
			this.m_textField = new JFormattedTextField(new MaskFormatter("###"));
		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}
		
		this.m_textField.setPreferredSize(new Dimension(50, 30));
		this.add(this.m_label);
		this.add(this.m_textField);
	}
	
	public JFormattedTextField			getTextField()	{ return (this.m_textField);	}
}
