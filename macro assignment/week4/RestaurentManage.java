// 3. Restaurant: Create a class called "Dish" that represents a dish. The class should have properties such as name, ingredients, and price, and methods such as getName, getIngredients, and getPrice. Create another class called "Restaurant" that represents a restaurant. The class should have a list of dishes, and methods such as addDish, removeDish, and getTotalCost

class Dish1 {
    private String name;
    private String[] ingredients;
    private double price;

    public Dish1(String name, String[] ingredients, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return price;
    }
}
class Restaurant {
    private Dish1[] dishes;
    private int numDishes;

    public Restaurant() {
        this.dishes = new Dish1[10];
        this.numDishes = 0;
    }

    public void addDish(Dish1 dish) {
        if (numDishes < dishes.length) {
            dishes[numDishes] = dish;
            numDishes++;
        } else {
            System.out.println("Error: Restaurant is full");
        }
    }

    public void removeDish(Dish1 dish) {
        int index = -1;
        for (int i = 0; i < numDishes; i++) {
            if (dishes[i] == dish) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            for (int i = index; i < numDishes - 1; i++) {
                dishes[i] = dishes[i + 1];
            }
            dishes[numDishes - 1] = null;
            numDishes--;
        }
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < numDishes; i++) {
            totalCost += dishes[i].getPrice();
        }
        return totalCost;
    }
}
public class RestaurentManage {
    public static void main(String[] args) {
        Dish1 dish1 = new Dish1("Spaghetti Bolognese", new String[]{"spaghetti", "tomato sauce", "Fish"}, 125.99);
        Dish1 dish2 = new Dish1("Margherita Pizza", new String[]{"pizza dough", "tomato sauce", "mozzarella"}, 229.99);
        Dish1 dish3 = new Dish1("Chicken Caesar Salad", new String[]{"romaine lettuce", "grilled chicken", "croutons", "caesar dressing"}, 118.99);

        Restaurant restaurant = new Restaurant();
        restaurant.addDish(dish1);
        restaurant.addDish(dish2);
        restaurant.addDish(dish3);

        System.out.println("Total cost of all dishes: " + restaurant.getTotalCost());
        restaurant.removeDish(dish2);
      System.out.println("Total cost of all dishes: " + restaurant.getTotalCost());
    }
}
