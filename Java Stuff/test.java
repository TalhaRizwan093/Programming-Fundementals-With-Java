import java.util.Scanner;

public class test{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        char positionOne = ' ';
        char positionTwo = ' ';
        char positionThree = ' ';
        char positionFour = ' ';
        char positionFive = ' ';
        char positionSix = ' ';
        char positionSeven = ' ';
        char positionEight = ' ';
        char positionNine = ' ';

        System.out.print("Player 1, Please choose your sign \"X\" or \"O\": ");

        char playerOneSelection = userInput.next().charAt(0);
        char playerOne = Character.toUpperCase(playerOneSelection);
        char playerTwo = ' ';
        if(playerOne == 'X'){
            playerTwo = 'O';
            System.out.println("Player 2 gets \"O\"");
        }
        else if(playerOne == 'O'){
            playerTwo = 'X';
            System.out.println("Player 2 gets \"X\"");
        }
        else{
            System.out.println("Invalid Input. Program will terminate.");
            System.exit(-1);
        }

        System.out.println("Current Game table: \t\tPosition Table for reference:");
        System.out.println("\t\t"+positionOne+"|"+positionTwo+"|"+positionThree+"\t\t\t\t\t\t\t1|2|3");
        System.out.println("\t\t"+positionFour+"|"+positionFive+"|"+positionSix+"\t\t\t\t\t\t\t4|5|6");
        System.out.println("\t\t"+positionSeven+"|"+positionEight+"|"+positionNine+"\t\t\t\t\t\t\t7|8|9");

        System.out.print("\nPlayer 1 take your turn. Enter the reference position for your sign: ");
        char playerOnePlay = userInput.next().charAt(0);
        switch (playerOnePlay){
            case('1'):
                positionOne = playerOne;
                break;
            case('2'):
                positionTwo = playerOne;
                break;
            case('3'):
                positionThree = playerOne;
                break;
            case('4'):
                positionFour = playerOne;
                break;
            case('5'):
                positionFive = playerOne;
                break;
            case('6'):
                positionSix = playerOne;
                break;
            case('7'):
                positionSeven = playerOne;
                break;
            case('8'):
                positionEight = playerOne;
                break;
            case('9'):
                positionNine = playerOne;
                break;
            default:
                System.out.println("Invalid reference position.");
        }

        System.out.println("Current Game table: \t\tPosition Table for reference:");
        System.out.println("\t\t"+positionOne+"|"+positionTwo+"|"+positionThree+"\t\t\t\t\t\t\t1|2|3");
        System.out.println("\t\t"+positionFour+"|"+positionFive+"|"+positionSix+"\t\t\t\t\t\t\t4|5|6");
        System.out.println("\t\t"+positionSeven+"|"+positionEight+"|"+positionNine+"\t\t\t\t\t\t\t7|8|9");
        System.out.print("\nPlayer 2 take your turn. Enter the reference position for your sign: ");
        char playerTwoPlay = userInput.next().charAt(0);
        switch (playerTwoPlay){
            case('1'):
                positionOne = playerTwo;
                break;
            case('2'):
                positionTwo = playerTwo;
                break;
            case('3'):
                positionThree = playerTwo;
                break;
            case('4'):
                positionFour = playerTwo;
                break;
            case('5'):
                positionFive = playerTwo;
                break;
            case('6'):
                positionSix = playerTwo;
                break;
            case('7'):
                positionSeven = playerTwo;
                break;
            case('8'):
                positionEight = playerTwo;
                break;
            case('9'):
                positionNine = playerTwo;
                break;
            default:
                System.out.println("Invalid reference position.");
        }
        System.out.println("Current Game table: \t\tPosition Table for reference:");
        System.out.println("\t\t"+positionOne+"|"+positionTwo+"|"+positionThree+"\t\t\t\t\t\t\t1|2|3");
        System.out.println("\t\t"+positionFour+"|"+positionFive+"|"+positionSix+"\t\t\t\t\t\t\t4|5|6");
        System.out.println("\t\t"+positionSeven+"|"+positionEight+"|"+positionNine+"\t\t\t\t\t\t\t7|8|9");
        System.out.print("\nPlayer 1 take your turn. Enter the reference position for your sign: ");
        playerOnePlay = userInput.next().charAt(0);
        switch (playerOnePlay){
            case('1'):
                positionOne = playerOne;
                break;
            case('2'):
                positionTwo = playerOne;
                break;
            case('3'):
                positionThree = playerOne;
                break;
            case('4'):
                positionFour = playerOne;
                break;
            case('5'):
                positionFive = playerOne;
                break;
            case('6'):
                positionSix = playerOne;
                break;
            case('7'):
                positionSeven = playerOne;
                break;
            case('8'):
                positionEight = playerOne;
                break;
            case('9'):
                positionNine = playerOne;
                break;
            default:
                System.out.println("Invalid reference position.");
        }
        System.out.println("Current Game table: \t\tPosition Table for reference:");
        System.out.println("\t\t"+positionOne+"|"+positionTwo+"|"+positionThree+"\t\t\t\t\t\t\t1|2|3");
        System.out.println("\t\t"+positionFour+"|"+positionFive+"|"+positionSix+"\t\t\t\t\t\t\t4|5|6");
        System.out.println("\t\t"+positionSeven+"|"+positionEight+"|"+positionNine+"\t\t\t\t\t\t\t7|8|9");
        System.out.print("\nPlayer 2 take your turn. Enter the reference position for your sign: ");
        playerTwoPlay = userInput.next().charAt(0);
        switch (playerTwoPlay){
            case('1'):
                positionOne = playerTwo;
                break;
            case('2'):
                positionTwo = playerTwo;
                break;
            case('3'):
                positionThree = playerTwo;
                break;
            case('4'):
                positionFour = playerTwo;
                break;
            case('5'):
                positionFive = playerTwo;
                break;
            case('6'):
                positionSix = playerTwo;
                break;
            case('7'):
                positionSeven = playerTwo;
                break;
            case('8'):
                positionEight = playerTwo;
                break;
            case('9'):
                positionNine = playerTwo;
                break;
            default:
                System.out.println("Invalid reference position.");
        }
        System.out.println("Current Game table: \t\tPosition Table for reference:");
        System.out.println("\t\t"+positionOne+"|"+positionTwo+"|"+positionThree+"\t\t\t\t\t\t\t1|2|3");
        System.out.println("\t\t"+positionFour+"|"+positionFive+"|"+positionSix+"\t\t\t\t\t\t\t4|5|6");
        System.out.println("\t\t"+positionSeven+"|"+positionEight+"|"+positionNine+"\t\t\t\t\t\t\t7|8|9");
        System.out.print("\nPlayer 1 take your turn. Enter the reference position for your sign: ");
        playerOnePlay = userInput.next().charAt(0);
        switch (playerOnePlay){
            case('1'):
                positionOne = playerOne;
                break;
            case('2'):
                positionTwo = playerOne;
                break;
            case('3'):
                positionThree = playerOne;
                break;
            case('4'):
                positionFour = playerOne;
                break;
            case('5'):
                positionFive = playerOne;
                break;
            case('6'):
                positionSix = playerOne;
                break;
            case('7'):
                positionSeven = playerOne;
                break;
            case('8'):
                positionEight = playerOne;
                break;
            case('9'):
                positionNine = playerOne;
                break;
            default:
                System.out.println("Invalid reference position.");
        }
        /*
        if ((positionThree==positionSix && positionSix==positionNine)||(positionSeven==positionEight && positionEight==positionNine))
        {
            if (positionNine==playerOne)
                System.out.println("USER 1 WON");
            else
                System.out.println("USER 2 WON");
            System.out.println("GAME FINISHED :::: java programm has stopped!!!");
            System.exit(0);
        }
        else if((positionOne==positionTwo && positionTwo==positionThree )||(positionOne==positionFive&&positionFive==positionNine)||(positionOne==positionFour&&positionFour==positionSeven))
        {
            if (positionOne==playerOne)
                System.out.println("USER 1 WON");
            else
                System.out.println("USER 2 WON");
            System.out.println("GAME FINISHED :::: java programm has stopped!!!");
            System.exit(1);
        }
        else if (positionThree==positionFive && positionFive==positionSeven ) {
            if (positionFive==playerOne)
                System.out.println("USER 1 WON");
            else
                System.out.println("USER 2 WON");
            System.out.println("GAME FINISHED :::: java programm has stopped!!!");
            System.exit(1);
        }
        else
            System.out.printf("");
        */
        if (positionOne == 'O' && positionTwo == 'O' && positionThree == 'O' || positionOne == 'O' && positionFour == 'O' && positionSeven == 'O' || positionOne == 'O' && positionFive == 'O' && positionNine == 'O' || positionFour == 'O' && positionFive == 'O' && positionSix == 'O' || positionSeven == 'O' && positionEight == 'O' && positionNine == 'O' || positionThree == 'O' && positionSix == 'O' && positionNine == 'O' || positionTwo == 'O' && positionFive == 'O' && positionEight == 'O') {
            System.out.print("Player 1 won the game");
            System.exit(0);
        }
        else if (positionOne == 'X' && positionTwo == 'X' && positionThree == 'X' || positionOne == 'X' && positionFour== 'X' && positionSeven == 'X' || positionOne == 'X' && positionFive == 'X' && positionNine == 'X' || positionFour == 'X' && positionFive == 'X' && positionSix == 'X' || positionSeven == 'X' && positionEight == 'X' && positionNine == 'X' || positionThree == 'X' && positionSix == 'X' && positionNine == 'X' || positionTwo == 'X' && positionFive == 'X' && positionEight == 'X'  ) {
            System.out.println("Player 2 won the game");
            System.exit(0);
        }
        else
            System.out.println("Draw:");





        System.out.println("Current Game table: \t\tPosition Table for reference:");
        System.out.println("\t\t"+positionOne+"|"+positionTwo+"|"+positionThree+"\t\t\t\t\t\t\t1|2|3");
        System.out.println("\t\t"+positionFour+"|"+positionFive+"|"+positionSix+"\t\t\t\t\t\t\t4|5|6");
        System.out.println("\t\t"+positionSeven+"|"+positionEight+"|"+positionNine+"\t\t\t\t\t\t\t7|8|9");
        System.out.print("\nPlayer 2 take your turn. Enter the reference position for your sign: ");
        playerTwoPlay = userInput.next().charAt(0);
        switch (playerTwoPlay){
            case('1'):
                positionOne = playerTwo;
                break;
            case('2'):
                positionTwo = playerTwo;
                break;
            case('3'):
                positionThree = playerTwo;
                break;
            case('4'):
                positionFour = playerTwo;
                break;
            case('5'):
                positionFive = playerTwo;
                break;
            case('6'):
                positionSix = playerTwo;
                break;
            case('7'):
                positionSeven = playerTwo;
                break;
            case('8'):
                positionEight = playerTwo;
                break;
            case('9'):
                positionNine = playerTwo;
                break;
            default:
                System.out.println("Invalid reference position.");
        }
        System.out.println("Current Game table: \t\tPosition Table for reference:");
        System.out.println("\t\t"+positionOne+"|"+positionTwo+"|"+positionThree+"\t\t\t\t\t\t\t1|2|3");
        System.out.println("\t\t"+positionFour+"|"+positionFive+"|"+positionSix+"\t\t\t\t\t\t\t4|5|6");
        System.out.println("\t\t"+positionSeven+"|"+positionEight+"|"+positionNine+"\t\t\t\t\t\t\t7|8|9");
        System.out.print("\nPlayer 1 take your turn. Enter the reference position for your sign: ");
        playerOnePlay = userInput.next().charAt(0);
        switch (playerOnePlay) {
            case ('1'):
                positionOne = playerOne;
                break;
            case ('2'):
                positionTwo = playerOne;
                break;
            case ('3'):
                positionThree = playerOne;
                break;
            case ('4'):
                positionFour = playerOne;
                break;
            case ('5'):
                positionFive = playerOne;
                break;
            case ('6'):
                positionSix = playerOne;
                break;
            case ('7'):
                positionSeven = playerOne;
                break;
            case ('8'):
                positionEight = playerOne;
                break;
            case ('9'):
                positionNine = playerOne;
                break;
            default:
                System.out.println("Invalid reference position.");
        }
        System.out.println("Current Game table: \t\tPosition Table for reference:");
        System.out.println("\t\t"+positionOne+"|"+positionTwo+"|"+positionThree+"\t\t\t\t\t\t\t1|2|3");
        System.out.println("\t\t"+positionFour+"|"+positionFive+"|"+positionSix+"\t\t\t\t\t\t\t4|5|6");
        System.out.println("\t\t"+positionSeven+"|"+positionEight+"|"+positionNine+"\t\t\t\t\t\t\t7|8|9");
        System.out.print("\nPlayer 2 take your turn. Enter the reference position for your sign: ");
        playerTwoPlay = userInput.next().charAt(0);
        switch (playerTwoPlay){
            case('1'):
                positionOne = playerTwo;
                break;
            case('2'):
                positionTwo = playerTwo;
                break;
            case('3'):
                positionThree = playerTwo;
                break;
            case('4'):
                positionFour = playerTwo;
                break;
            case('5'):
                positionFive = playerTwo;
                break;
            case('6'):
                positionSix = playerTwo;
                break;
            case('7'):
                positionSeven = playerTwo;
                break;
            case('8'):
                positionEight = playerTwo;
                break;
            case('9'):
                positionNine = playerTwo;
                break;
            default:
                System.out.println("Invalid reference position.");
        }
        System.out.println("Current Game table: \t\tPosition Table for reference:");
        System.out.println("\t\t"+positionOne+"|"+positionTwo+"|"+positionThree+"\t\t\t\t\t\t\t1|2|3");
        System.out.println("\t\t"+positionFour+"|"+positionFive+"|"+positionSix+"\t\t\t\t\t\t\t4|5|6");
        System.out.println("\t\t"+positionSeven+"|"+positionEight+"|"+positionNine+"\t\t\t\t\t\t\t7|8|9");
        System.out.print("\nPlayer 1 take your turn. Enter the reference position for your sign: ");
        playerOnePlay = userInput.next().charAt(0);
        switch (playerOnePlay) {
            case ('1'):
                positionOne = playerOne;
                break;
            case ('2'):
                positionTwo = playerOne;
                break;
            case ('3'):
                positionThree = playerOne;
                break;
            case ('4'):
                positionFour = playerOne;
                break;
            case ('5'):
                positionFive = playerOne;
                break;
            case ('6'):
                positionSix = playerOne;
                break;
            case ('7'):
                positionSeven = playerOne;
                break;
            case ('8'):
                positionEight = playerOne;
                break;
            case ('9'):
                positionNine = playerOne;
                break;
            default:
                System.out.println("Invalid reference position.");
        }
        System.out.println("Current Game table: \t\tPosition Table for reference:");
        System.out.println("\t\t"+positionOne+"|"+positionTwo+"|"+positionThree+"\t\t\t\t\t\t\t1|2|3");
        System.out.println("\t\t"+positionFour+"|"+positionFive+"|"+positionSix+"\t\t\t\t\t\t\t4|5|6");
        System.out.println("\t\t"+positionSeven+"|"+positionEight+"|"+positionNine+"\t\t\t\t\t\t\t7|8|9");
    }
}