    
class Solution {
    
    
    public  static int live(int a, int live)
    {
        if(a==1 && live<2)
            return 0;
        else if(a==1 && (live ==2 || live ==3))
            return 1;
        else if(a==1 && live >3)
            return 0;
        else if(a==0 && live == 3)
            return 1;
        return 0;
    }
        
    public static int checkingNeighbours(int r, int c, int[][] board)
    {
        int live=0;
        int column = board[0].length-1;
        int row = board.length-1;
        if((r-1) >=0 && (c-1) >=0 ){if(board[r-1][c-1] == 1) live++;}
        if((r-1) >=0  ){if(board[r-1][c] == 1) live++;}
        if((r-1) >=0 && (c+1) <=column ){if(board[r-1][c+1] == 1) live++;}
        if((c-1) >=0 ){if(board[r][c-1] == 1) live++;}
        if((c+1)<=column){if(board[r][c+1] == 1) live++;}
        if((r+1) <=row && (c-1) >=0){if(board[r+1][c-1] == 1) live++;}
        if((r+1) <= row  ){if(board[r+1][c] == 1) live++;}
        if((r+1) <= row && (c+1) <= column ){if(board[r+1][c+1] == 1) live++;}
        
        return live(board[r][c] , live);
    }
        
    public void gameOfLife(int[][] board) {
        int column = board[0].length;
        int row = board.length;
        int [][] newArr = new int[row][column];
        int total = column*row;
        int r=0;
        int c=0;
        int check = 0;
        
        for(int i =0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                newArr[i][j] = checkingNeighbours(i,j,board);
            }
        }
        
        for(int i =0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                board[i][j] = newArr[i][j];
            }
        }
        
    }
}
