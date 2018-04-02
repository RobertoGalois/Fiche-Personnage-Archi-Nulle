package subPanels;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class IllustrationPanel extends JPanel
{
	protected String	m_illustrationImgPathway;
	
	public		IllustrationPanel()
	{
		super();
		
		this.m_illustrationImgPathway = new String("./Pictures/character.png");
	}
	
	public void	paintComponent(Graphics g)
	{
		/* set the character.jpg image as background */
		Image img = (new ImageIcon(this.m_illustrationImgPathway)).getImage();
	     g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	}
	
	public String getIllustrationImgPathway()
	{
		return (this.m_illustrationImgPathway);
	}
	
	public void setIllustrationImgPathWay(String p_pathway)
	{
		this.m_illustrationImgPathway = p_pathway;
	}
}
