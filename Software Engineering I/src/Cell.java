public class Cell {
	
	
	public Cell()
	{
		
	}
	
	
	public boolean isMine(char gameBoard[][], int rowPos, int columnPos)
	{
		if(gameBoard[rowPos][columnPos] == '*')
		{
			return true;
		}
		else 
		{
			return false;
		}	
	}
	
	
	public boolean isOrb(char gameBoardCopy[][], int rowPos, int columnPos)
	{
		if(gameBoardCopy[rowPos][columnPos] == 'f')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	public boolean isValidCell(int rowPos, int columnPos, int widthOfBoard, int heightOfBoard)
	{
		if((rowPos >= 0 && rowPos < widthOfBoard) && (columnPos >= 0 && columnPos < heightOfBoard))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public int getMineCount(char gameBoard[][], int rowPos, int columnPos, int widthOfBoard, int heightOfBoard)
	{
		int count = 0;
		
		//Checking South of Cell to see if there are any mines
		if(isValidCell(rowPos + 1, columnPos, widthOfBoard, heightOfBoard) == true)
		{
			if(isMine(gameBoard, rowPos + 1, columnPos) == true)
			{
				count++;
			}
		}

		//Checking South West of Cell to see if there are any mines
		if(isValidCell(rowPos + 1, columnPos - 1, widthOfBoard, heightOfBoard) == true)
	        {
	                if(isMine(gameBoard, rowPos + 1, columnPos - 1) == true)
	                {
	                        count++;
	                }
	        }

		//Checking West of Cell to see if there are any mines
		if(isValidCell(rowPos, columnPos - 1, widthOfBoard, heightOfBoard) == true)
	        {
	                if(isMine(gameBoard, rowPos, columnPos - 1) == true)
	                {
	                        count++;
	                }
	        }

		//Checking North West of Cell to see if there are any mines
		if(isValidCell(rowPos - 1, columnPos - 1, widthOfBoard, heightOfBoard) == true)
	        {
	                if(isMine(gameBoard, rowPos - 1, columnPos - 1) == true)
	                {
	                        count++;
	                }
	        }

		//Checking North of Cell to see if there are any mines
		if(isValidCell(rowPos - 1, columnPos, widthOfBoard, heightOfBoard) == true)
	        {
	                if(isMine(gameBoard, rowPos - 1, columnPos) == true)
	                {
	                        count++;
	                }
	        }

		//Checking North East of Cell to see if there are any mines
		if(isValidCell(rowPos - 1, columnPos + 1, widthOfBoard, heightOfBoard) == true)
	        {
	                if(isMine(gameBoard, rowPos - 1, columnPos + 1) == true)
	                {
	                        count++;
	                }
	        }

		//Checking East of Cell to see if there are any mines
		if(isValidCell(rowPos, columnPos + 1, widthOfBoard, heightOfBoard) == true)
	        {
	                if(isMine(gameBoard, rowPos, columnPos + 1) == true)
	                {
	                        count++;
	                }
	        }

		//Checking South East of Cell to see if there are any mines
		if(isValidCell(rowPos + 1, columnPos + 1, widthOfBoard, heightOfBoard) == true)
	        {
	                if(isMine(gameBoard, rowPos + 1, columnPos + 1) == true)
	                {
	                        count++;
	                }
	        }

		//Returns Number of mines that are adjacent to cell specified
		return count;			
	}
	
	
	public int explode(char gameBoardCharacterArray[][], int rowPos, int columnPos)
	{
		if(gameBoardCharacterArray[rowPos][columnPos] == '*') 
		{
			return -1;
		}
		
		else if(gameBoardCharacterArray[rowPos][columnPos] == '0')
		{
			return 0;
		}
		
		else if(gameBoardCharacterArray[rowPos][columnPos] == '1')
		{
			return 1;
		}
		
		else if(gameBoardCharacterArray[rowPos][columnPos] == '2')
		{
			return 2;
		}
		
		else if(gameBoardCharacterArray[rowPos][columnPos] == '3')
		{
			return 3;
		}
		
		else if(gameBoardCharacterArray[rowPos][columnPos] == '4')
		{
			return 4;
		}
		
		else if(gameBoardCharacterArray[rowPos][columnPos] == '5')
		{
			return 5;
		}
		
		else if(gameBoardCharacterArray[rowPos][columnPos] == '6')
		{
			return 6;
		}
		
		else if(gameBoardCharacterArray[rowPos][columnPos] == '7')
		{
			return 7;
		}
		
		else if(gameBoardCharacterArray[rowPos][columnPos] == '8')
		{
			return 8;
		}
		
		return -2;
	}
	
	public boolean isNumber0(char gameBoard[][], int rowPos, int columnPos)
	{
		if(gameBoard[rowPos][columnPos] == '0')
		{
			return true;
		}
		else 
		{
			return false;
		}	
	}
	
	
	public boolean isNumber1(char gameBoard[][], int rowPos, int columnPos)
	{
		if(gameBoard[rowPos][columnPos] == '1')
		{
			return true;
		}
		else 
		{
			return false;
		}	
	}
	
	
	public boolean isNumber2(char gameBoard[][], int rowPos, int columnPos)
	{
		if(gameBoard[rowPos][columnPos] == '2')
		{
			return true;
		}
		else 
		{
			return false;
		}	
	}
	
	public boolean isNumber3(char gameBoard[][], int rowPos, int columnPos)
	{
		if(gameBoard[rowPos][columnPos] == '3')
		{
			return true;
		}
		else 
		{
			return false;
		}	
	}
	
	public boolean isNumber4(char gameBoard[][], int rowPos, int columnPos)
	{
		if(gameBoard[rowPos][columnPos] == '4')
		{
			return true;
		}
		else 
		{
			return false;
		}	
	}
	
	public boolean isNumber5(char gameBoard[][], int rowPos, int columnPos)
	{
		if(gameBoard[rowPos][columnPos] == '5')
		{
			return true;
		}
		else 
		{
			return false;
		}	
	}
	
	public boolean isNumber6(char gameBoard[][], int rowPos, int columnPos)
	{
		if(gameBoard[rowPos][columnPos] == '6')
		{
			return true;
		}
		else 
		{
			return false;
		}	
	}
	
	
	public boolean isNumber7(char gameBoard[][], int rowPos, int columnPos)
	{
		if(gameBoard[rowPos][columnPos] == '7')
		{
			return true;
		}
		else 
		{
			return false;
		}	
	}
	
	public boolean isNumber8(char gameBoard[][], int rowPos, int columnPos)
	{
		if(gameBoard[rowPos][columnPos] == '8')
		{
			return true;
		}
		else 
		{
			return false;
		}	
	}


}