public class Food {
    private String foodName;
    private double foodPrice;
    private String foodDescription;

    public Food()
    {
        this.foodName = null;
        this.foodPrice = 0;
        this.foodDescription = null;
    }

    public Food(String name,double price, String description)
    {
        this.foodName = name;
        this.foodPrice = price;
        this.foodDescription = description;
    }

    void updateFoodName(String name)
    {
        this.foodName = name;
    }

    void updateFoodPrice(double price)
    {
        this.foodPrice = price;
    }

    void updateFoodDescription(String description)
    {
        this.foodDescription = description;
    }

    String getFoodName()
    {
        return this.foodName;
    }

    double getFoodPrice()
    {
        return this.foodPrice;
    }

    String getFoodDescription()
    {
        return this.foodDescription;
    }

    @Override
    public String toString() { 
        String result = "Current Food item Name: " + getFoodName() +" and Food Price: " + getFoodPrice() + "\n";
        result += getFoodDescription() + "\n";
        return result;
    } 
}