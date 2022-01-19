import java.awt.Image;
import javax.swing.ImageIcon;

public class ImageClass {
	
	private ImageIcon beginnerTile; 
	private ImageIcon intermediateTile;
	private ImageIcon intermediateOrb;
	private ImageIcon expertTile;
	private ImageIcon expertOrb;
	private ImageIcon mine; 
	private ImageIcon beginnerOrb; 
	private ImageIcon dungeon;
	private ImageIcon sanctuary;
	private ImageIcon dragon;
	private ImageIcon crystalCave;
	private ImageIcon knightImage;
	private ImageIcon catWizardImage;
	private ImageIcon warriorMageImage;
	private ImageIcon happyWizardCat;
	private ImageIcon sadWizardCat;
	private ImageIcon angryKnight;
	private ImageIcon angryWarriorSorceress;
	private ImageIcon happyKnight;
	private ImageIcon happyWarriorSorceress;
	
	private ImageIcon number0;
	private ImageIcon number1;
	private ImageIcon number2;
	private ImageIcon number3;
	private ImageIcon number4;
	private ImageIcon number5;
	private ImageIcon number6;
	private ImageIcon number7;
	private ImageIcon number8;
	
	
	public ImageClass()
	{
		beginnerTile = new ImageIcon("Tile.png");
		intermediateTile = new ImageIcon("intermediateTile.png");
		intermediateOrb = new ImageIcon("intermediateOrb.png"); 
		expertTile = new ImageIcon("expertTile.png");
		expertOrb = new ImageIcon("expertOrb.png"); 
		mine = new ImageIcon("mines.png");
		beginnerOrb = new ImageIcon("Orb.png");
		dungeon = new ImageIcon("Dungeon.jpg");
		sanctuary = new ImageIcon("Sanctuary.jpg");
		dragon = new ImageIcon("DragonLair.jpg");
		crystalCave = new ImageIcon("CrystalCave.jpg");
		knightImage = new ImageIcon("KnightImage1.png");
		catWizardImage = new ImageIcon("CatMage.png");
		warriorMageImage = new ImageIcon("WarriorMageImage.png");
		happyWizardCat = new ImageIcon("HappyWizardCat.png");
		sadWizardCat = new ImageIcon("SadWizardCat.png");
		angryKnight = new ImageIcon("AngryKnight.png");
		angryWarriorSorceress = new ImageIcon("AngryWarriorSorceress.png");
		happyKnight = new ImageIcon("HappyKnight.png");
		happyWarriorSorceress = new ImageIcon("HappyWarriorSorceress.png");
		
		
		number0 = new ImageIcon("Number0.png");
		number1 = new ImageIcon("Number1.png");
		number2 = new ImageIcon("Number2.png");
		number3 = new ImageIcon("Number3.png");
		number4 = new ImageIcon("Number4.png");
		number5 = new ImageIcon("Number5.png");
		number6 = new ImageIcon("Number6.png");
		number7 = new ImageIcon("Number7.png");
		number8 = new ImageIcon("Number8.png");	
	}
	
	public ImageIcon getDungeonImage()
	{
		Image img = dungeon.getImage();
		Image dungeonImg = img.getScaledInstance(660, 350, Image.SCALE_SMOOTH);
		ImageIcon dungeonImage = new ImageIcon(dungeonImg);
		
		return dungeonImage;
	}
	
	
	public ImageIcon getSanctuaryImage()
	{
		Image img = sanctuary.getImage();
		Image sanctImg = img.getScaledInstance(830, 370, Image.SCALE_SMOOTH);
		ImageIcon sanctuaryImage = new ImageIcon(sanctImg);
		
		return sanctuaryImage;
	}
	
	public ImageIcon getDragonImage()
	{
		Image img = dragon.getImage();
		Image dragonImg = img.getScaledInstance(900, 230, Image.SCALE_SMOOTH);
		ImageIcon dragonImage = new ImageIcon(dragonImg);
		
		return dragonImage;
	}
	
	
	public ImageIcon getCrystalCaveImage()
	{
		Image img = crystalCave.getImage();
		Image caveImg = img.getScaledInstance(880, 540, Image.SCALE_SMOOTH);
		ImageIcon crystalCaveImage = new ImageIcon(caveImg);
		
		return crystalCaveImage;
	}
	
	public ImageIcon getKnightImage()
	{
		Image img = knightImage.getImage();
		Image knightImg = img.getScaledInstance(960, 480, Image.SCALE_SMOOTH);
		ImageIcon knightImageNew = new ImageIcon(knightImg);
		
		return knightImageNew;
	}
	
	public ImageIcon getAngryKnight()
	{
		Image img = angryKnight.getImage();
		Image knightImg = img.getScaledInstance(893, 445, Image.SCALE_SMOOTH);
		ImageIcon angryKnightImageNew = new ImageIcon(knightImg);
		
		return angryKnightImageNew;
	}
	
	public ImageIcon getHappyKnight()
	{
		Image img = happyKnight.getImage();
		Image knightImg = img.getScaledInstance(893, 445, Image.SCALE_SMOOTH);
		ImageIcon happyKnightImageNew = new ImageIcon(knightImg);
		
		return happyKnightImageNew;
	}
	
	
	public ImageIcon getWizardImage()
	{
		Image img = catWizardImage.getImage();
		Image mageImg = img.getScaledInstance(893, 580, Image.SCALE_SMOOTH);
		ImageIcon catMageImageNew = new ImageIcon(mageImg);
		
		return catMageImageNew;
	}
	
	public ImageIcon getHappyWizardImage()
	{
		Image img = happyWizardCat.getImage();
		Image mageImg = img.getScaledInstance(893, 445, Image.SCALE_SMOOTH);
		ImageIcon happyWizardImageNew = new ImageIcon(mageImg);
		
		return happyWizardImageNew;
	}
	
	public ImageIcon getSadWizardImage()
	{
		Image img = sadWizardCat.getImage();
		Image mageImg = img.getScaledInstance(893, 445, Image.SCALE_SMOOTH);
		ImageIcon sadWizardImageNew = new ImageIcon(mageImg);
		
		return sadWizardImageNew;
	}
	
	
	public ImageIcon getWarriorMageImage()
	{
		Image img = warriorMageImage.getImage();
		Image wMImg = img.getScaledInstance(893, 530, Image.SCALE_SMOOTH);
		ImageIcon warriorMageImageNew = new ImageIcon(wMImg);
		
		return warriorMageImageNew;
	}
	
	
	public ImageIcon getAngryWarriorSorceress()
	{
		Image img = angryWarriorSorceress.getImage();
		Image angryWS = img.getScaledInstance(893, 475, Image.SCALE_SMOOTH);
		ImageIcon angryWSImageNew = new ImageIcon(angryWS);
		
		return angryWSImageNew;
	}
	
	public ImageIcon getHappyWarriorSorceress()
	{
		Image img = happyWarriorSorceress.getImage();
		Image happyWS = img.getScaledInstance(893, 475, Image.SCALE_SMOOTH);
		ImageIcon happyWSImageNew = new ImageIcon(happyWS);
		
		return happyWSImageNew;
	}
	
	
	public ImageIcon getTileImage(int currentLevel)
	{
		if(currentLevel == 1)
		{
			return beginnerTile;
		}
		
		else if (currentLevel == 2)
		{
			return intermediateTile;
		}
		
		else if (currentLevel == 3)
		{
			return expertTile;

		}
		
		else
		{
			return beginnerTile;
		}
	}
	
	
	public ImageIcon getMineImage(int currentLevel)
	{
		if(currentLevel == 1)
		{
			return mine;
		}
		if (currentLevel == 2)
		{
			return mine;
		}
		
		if (currentLevel == 3)
		{
			return mine;

		}
		return mine;
	}
	
	
	public ImageIcon getOrbImage(int currentLevel)
	{
		if(currentLevel == 1)
		{
			return beginnerOrb;
		}
		if (currentLevel == 2)
		{
			return intermediateOrb;
		}
		
		if (currentLevel == 3)
		{
			return expertOrb;

		}
		return beginnerOrb;
	}
	
	
	public ImageIcon getNumber0Image()
	{
		return number0;
	}
	
	
	public ImageIcon getNumber1Image()
	{
		return number1;
	}
	
	
	public ImageIcon getNumber2Image()
	{
		return number2;
	}
	
	
	public ImageIcon getNumber3Image()
	{
		return number3;
	}
	
	
	public ImageIcon getNumber4Image()
	{
		return number4;
	}
	
	
	public ImageIcon getNumber5Image()
	{
		return number5;
	}
	
	
	public ImageIcon getNumber6Image()
	{
		return number6;
	}
	
	
	public ImageIcon getNumber7Image()
	{
		return number7;
	}
	
	
	public ImageIcon getNumber8Image()
	{
		return number8;
	}
}