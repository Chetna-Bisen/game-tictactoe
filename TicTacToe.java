import java.util.Random;
import java.util.Scanner;

public class Tictactoe{
  public static char[][] board= new char[3][3];
  public static int row, col;
  public static Scanner scan = new Scanner(System.in);
  public static int player;
  public static String userSymbol = " ";
  public static String compSymbol = " ";


//UC1
   public static void createBoard(){
        for(int row = 0; row < board.length; row++) {
         for(int col = 0; col < board.length; col++) {
            board[row][col] = '-';
         }
      }
    }

//UC2
   public static void chooseMark() {
     Scanner choice = new Scanner(System.in);
     System.out.println("Enter your Symbol");
     int player=(int)Math.floor(Math.random()*10)%2;
     if (player==1){
        System.out.println("User will choose first:-");
        System.out.println("Choose either 'X' or 'O' :-");
        userSymbol=choice.nextLine();
}
     else{
        System.out.println("Computer will choose first:-");
        System.out.println("Choose either 'X' or 'O' :-");
        compSymbol=choice.nextLine();
}
    if (userSymbol == "X") {
        compSymbol = "O";
    } else {
        compSymbol = "X";
        userSymbol = "O";
    }
   System.out.println("User_Symbol="+userSymbol);
   System.out.println("Comp_Symbol="+compSymbol);
}


//UC3
   public static void displayBoard(){
      for(int row = 0; row < board.length; row++) {
            System.out.println();
         for(int col = 0; col < board.length; col++) {
               if (col == 0) {
            System.out.print("|");
         }
         System.out.print(board[row][col] + "|");
      }
   }

    }


//UC4
  //public static boolean isValidMove(char[][] board,int row, int col)
  //{
   //System.out.println("Enter Index number between 1 to 9");
   //if(board[row][col]=='-')
//{
  // return True;
//}
 //else {
   // return False;
//}


//UC5
// public static void makeMove(){
    

//}


  


   public static void main(String[] args) {
        Tictactoe game = new Tictactoe();
        game.createBoard();
        game.chooseMark();
        game.displayBoard();
        //game.isValidMove(char[][] board);
  }
}
