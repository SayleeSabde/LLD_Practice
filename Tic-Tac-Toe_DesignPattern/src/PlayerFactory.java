public class PlayerFactory {
    public static Player createPlayer(String type, String name, char symbol) {
        return switch (type.toLowerCase()) {
            case "human" -> new HumanPlayer(name, symbol);
            case "ai" -> new AIPlayer(name, symbol);
            default -> throw new IllegalArgumentException("Unknown player type");
        };
    }
}