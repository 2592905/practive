public class Main {
    public static void main(String[] args) {
        String[][] gameBoard = {
                {"[ ]", "[ ]", "[ ]"},
                {"[ ]", "[ ]", "[ ]"},
                {"[ ]", "[ ]", "[ ]"}
        };
        for (int row = 0; row < gameBoard.length; row++) {
            for (int col = 0; col < gameBoard[row].length; col++) {
                System.out.print(gameBoard[row][col]);
            }
            System.out.println();
        }
    }
}

