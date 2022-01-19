import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu implements ActionListener {
	
	private JFrame frame = new JFrame();
	private JButton level1Button = new JButton("Beginner Level (5x5)");
	private JButton level2Button = new JButton("Intermediate Level (7x7)");
	private JButton level3Button = new JButton("Expert Level (9x9)");
	
	private ImageClass image = new ImageClass();
	private BeginnerStory story = new BeginnerStory();
	private IntermediateStory story2 = new IntermediateStory();
	private ExpertStory story3 = new ExpertStory();
		
	
	public Menu()
	{
		JPanel levelPanel = new JPanel();
		JPanel gameTitlePanel = new JPanel();
		JLabel imageLabel = new JLabel();
		JLabel tittleLabel = new JLabel("Minesweeper Madness");
		Font font = new Font("Bell MT",Font.BOLD,55);
		
		imageLabel.setIcon(image.getCrystalCaveImage());
		
		tittleLabel.setForeground(Color.WHITE);
		tittleLabel.setFont(font);
		
		frame.setSize(900, 900);
	    frame.setTitle("Minesweeper Madness");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    levelPanel.setLayout(new GridLayout(3,1, 2, 8));
	    
	    gameTitlePanel.setBackground(Color.BLACK);
	    levelPanel.setBackground(Color.BLACK);
	    
	    
	    level1Button.setPreferredSize(new Dimension(150, 60));
	    level2Button.setPreferredSize(new Dimension(150, 60));
	    level3Button.setPreferredSize(new Dimension(150, 60));
	    
	    level1Button.setBackground(Color.WHITE);
	    level2Button.setBackground(Color.WHITE);
	    level3Button.setBackground(Color.WHITE);
	    
	    level1Button.addActionListener(this);
	    level2Button.addActionListener(this);
	    level3Button.addActionListener(this);
	    
	    levelPanel.add(level1Button);
	    levelPanel.add(level2Button);
	    levelPanel.add(level3Button);
	    
	    
	    gameTitlePanel.add(tittleLabel);
	    gameTitlePanel.add(imageLabel);
	    
	    frame.add(levelPanel, BorderLayout.SOUTH);
	    frame.add(gameTitlePanel, BorderLayout.CENTER);
	    
	    frame.setResizable(false);
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	    
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == level1Button)
		{
			frame.dispose();
			story.beginnerStory();
		}
		
		else if(e.getSource() == level2Button)
		{
			frame.dispose();
			story2.intermediateStory();
		}
		
		else if(e.getSource() == level3Button)
		{
			frame.dispose();
			story3.expertStory();
		}
		
	}


}
