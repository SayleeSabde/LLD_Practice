# 🎮 Tic Tac Toe in Java

A modular, object-oriented implementation of the classic Tic Tac Toe game using Java. This project demonstrates clean architecture principles and design patterns including **Strategy** and **Factory**.

---

## 🧠 Design Patterns Used

### ✅ Strategy Pattern
- **Purpose:** Decouple the move selection logic from player types.
- **Implementation:**
    - `PlayerBehavior` interface defines the strategy for choosing a move.
    - `HumanPlayer` and other player types implement this interface with their own logic.

### 🏭 Factory Pattern
- **Purpose:** Abstract the creation of player instances.
- **Implementation:**
    - A `PlayerFactory` class (not shown here) can be used to return instances of `HumanPlayer`, `AIPlayer`, etc., based on input parameters.

## 🚀 How to Run

1. Clone or download the repository.
2. Compile all `.java` files:
   ```bash
   javac *.java

java Main