## Factory Design Pattern Guide
The Factory Design Pattern is a creational design pattern used in object-oriented programming to 
create objects without specifying the exact class of object that will be created. 
Instead of instantiating objects directly using new, the pattern delegates the responsibility of creating objects to a factory class or method.

## 🏭 What Is the Factory Pattern?
Imagine a factory that produces different types of vehicles—cars, bikes, trucks—based on a request. You don’t need to know how each vehicle is built; you just ask the factory for one, and it gives you the right type.
In code, this means:
- You define an interface or abstract class for the type of object you want.
- You implement concrete classes for each specific type.
- You use a factory method to decide which concrete class to instantiate based on input.


## 🔧 Why Use It?
- Encapsulation of object creation logic
- Decouples client code from concrete classes
- Improves code maintainability and scalability
- Supports polymorphism


## ✅ When to Use the Factory Pattern
Use it when:
• 	🔄 You need to create objects without exposing the instantiation logic to the client.
• 	🧩 You have multiple subclasses of a common interface or abstract class, and the exact subclass to instantiate depends on input or context.
• 	🔧 Object creation is complex or involves configuration, caching, or conditional logic.
• 	📦 You want to encapsulate object creation to make your code more modular and testable.
• 	🔄 You anticipate changes in the types of objects being created (e.g., adding new types later).

## 🚫 When Not to Use It
Avoid it when:
- 🧱 You only have one concrete class and no foreseeable need for flexibility.
- 🧪 Object creation is simple and unlikely to change—a direct new is cleaner and more readable.
- 🧵 You don’t need polymorphism or abstraction—adding a factory adds unnecessary complexity.
- 🧭 You want full control over object instantiation in the client code (e.g., for performance tuning or dependency injection).


## 👍 Advantages
| Benefit | Description |
| 🔒 Encapsulation | Hides the creation logic from the client |
| 🔄 Flexibility | Easy to add new types without changing client code |
| 🧪 Testability | Easier to mock or stub objects in unit tests |
| 🔧 Centralized Control | All object creation logic is in one place |
| 🧩 Supports Polymorphism | Clients work with interfaces, not concrete classes |


## 👎 Disadvantages
| Drawback | Description |
| 🧱 Complexity | Adds extra layers of abstraction that may be overkill |
| 🔍 Maintenance Overhead | More classes and methods to manage |
| 🧭 Less Transparency | Can obscure what concrete class is being used |
| 🧵 Tight Coupling to Factory | If not designed well, clients may depend too much on the factory itself |


## 🧠 Quick Rule of Thumb
If you're writing code that might need to support multiple types, change frequently, 
or be tested independently, the Factory Pattern is your friend.
If you're just creating a single object with no variation, skip the factory—keep it simple.

## Example

// Step 1: Create an interface
interface Shape {
void draw();
}

// Step 2: Implement concrete classes
class Circle implements Shape {
public void draw() {
System.out.println("Drawing a Circle");
}
}

class Square implements Shape {
public void draw() {
System.out.println("Drawing a Square");
}
}

// Step 3: Create the Factory
class ShapeFactory {
public Shape getShape(String shapeType) {
if (shapeType == null) return null;
if (shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
if (shapeType.equalsIgnoreCase("SQUARE")) return new Square();
return null;
}
}

// Step 4: Use the Factory
public class FactoryPatternDemo {
public static void main(String[] args) {
ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = factory.getShape("SQUARE");
        shape2.draw();
    }
}