import java.util.ArrayList; 

public class Menu {
    private ArrayList<Food> foodItems;

    public Menu()
    {
        this.foodItems = new ArrayList<Food>(0);
        //System.out.println("We have initialized the menu");
    }

    void addFoodItems(Food currentFoodItem)
    {
        this.foodItems.add(currentFoodItem);
        //System.out.println("Added this item: " + currentFoodItem);
    }

    @Override
    public String toString() { 
        String result = "";
        for(Food currentFoodItem : this.foodItems)
            result += currentFoodItem.toString(); 
        return result;
    } 
}