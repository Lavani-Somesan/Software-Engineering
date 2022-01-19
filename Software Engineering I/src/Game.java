import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game {
	
	private JButton[][] userGameBoardButtons;
	private char[][] uesrGameBoardCharacterArray;
	private GameBoard gameBoard;
	private JFrame frame = new JFrame();
	private JPanel panelGameBoard;
	private JLabel imageLabel = new JLabel();
	private JPanel panelFormatForFrame;
	private ImageClass image = new ImageClass();
	
	private int frameWidth;  
	private int frameHeight;
	public int widthOfBoard;
	private int heightOfBoard;
	
	
	
	private void setWidthOfBoard(int widthOfBoard)
	{
		this.widthOfBoard = widthOfBoard;
	}
	
	
	private void setHeightOfBoard(int heightOfBoard)
	{
		this.heightOfBoard = heightOfBoard;
	}
	
	
	private void setHeightOfFrame(int frameHeight)
	{
		this.frameHeight = frameHeight;
	}
	
	
	private void setWidthOfFrame(int frameWidth)
	{
		this.frameWidth = frameWidth;
	}
	
	
	
	public void selectLevel(int levelOption)
	{
		if(levelOption == 1)
		{
			setWidthOfBoard(5);
			setHeightOfBoard(5);
			
			setWidthOfFrame(680);
			setHeightOfFrame(800);
			imageLabel.setIcon(image.getDungeonImage());
			Music.getMusicFile("src/Propertiming.wav");
			Music.play();
		}
		
		else if(levelOption == 2)
		{
			setWidthOfBoard(7);
			setHeightOfBoard(7);
			
			setWidthOfFrame(850);
			setHeightOfFrame(1000);
			imageLabel.setIcon(image.getSanctuaryImage());
			Music.getMusicFile("src/Outro.wav");
			Music.play();
		}
		
		else if(levelOption == 3)
		{
			setWidthOfBoard(9);
			setHeightOfBoard(9);
			
			setWidthOfFrame(900);
			setHeightOfFrame(1030);
			imageLabel.setIcon(image.getDragonImage());
			Music.getMusicFile("src/PeaceInSunlight.wav");
			Music.play();
		}
	}
	
	
	public void playGame(int levelSelected)
	{
		selectLevel(levelSelected);
		
		panelGameBoard = new JPanel();
		panelFormatForFrame = new JPanel();
		
		
		userGameBoardButtons = new JButton[widthOfBoard][heightOfBoard];
		uesrGameBoardCharacterArray = new char[widthOfBoard][heightOfBoard];

		
	    frame.setSize(frameWidth, frameHeight);
	    frame.setTitle("Minesweeper Madness");
	    frame.setResizable(false);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    panelGameBoard.setBackground(Color.BLACK);
	    panelFormatForFrame.setBackground(Color.BLACK);
	    
	    
	    gameBoard = new GameBoard(widthOfBoard, heightOfBoard, levelSelected, frame);
	    
	    
	    panelGameBoard.setLayout(new GridLayout(widthOfBoard, heightOfBoard, 4 , 5));
	    panelFormatForFrame.setLayout(new BorderLayout(1,1));
	    
	    
	    userGameBoardButtons = gameBoard.getGameBoard();
	    uesrGameBoardCharacterArray = gameBoard.getGameBoardCharacterArray();
	    
	    for(int i = 0; i < widthOfBoard; i++)
	    { 
	    	for(int j = 0; j < heightOfBoard; j++)
	    	{
	    		panelGameBoard.add(userGameBoardButtons[i][j]);
	    	}
	    }
	    
	    
	    for(int i = 0; i < widthOfBoard; i++)
	    { 
	    	for(int j = 0; j < heightOfBoard; j++)
	    	{
	    		System.out.print(uesrGameBoardCharacterArray[i][j] + " ");
	    	}
	    	System.out.println();
	    }
	    
	   
	    panelFormatForFrame.add(panelGameBoard, BorderLayout.NORTH);
	    panelFormatForFrame.add(imageLabel, BorderLayout.SOUTH);
	    
	    frame.getContentPane().add(panelFormatForFrame);
	    
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	}
	

}
