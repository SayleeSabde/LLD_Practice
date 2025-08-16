public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Saylee", 'O');
        Player player2 = new Player("Vaishnavi", 'X');

        Game game = new Game(player1, player2, 3);
        game.startGame();
    }
}