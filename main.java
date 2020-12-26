public class main{
    public static void main(String[] args)
    {
        System.out.println("Started the program");
        Food t = new Food("Pad Thai", 1.20, "A tasty thai meal. Best served on Friday.");

        Food t1 = new Food("Drunken Noodles", 8.40, "How spicy please?");
        Menu m = new Menu();
        m.addFoodItems(t);
        m.addFoodItems(t1);
        System.out.println(m.toString());
        int[]  daysOpen    = {-1,700,700,700,700,700,-1};
        int[]  daysClosed  = {-1,500,500,500,500,500,-1};
        String testEmail   = "test@example.com";
        long    phoneNumber = Long.parseLong("4805500889");
        Contact c = new Contact(phoneNumber,daysOpen,daysClosed,testEmail);
        System.out.println(c.toString());
    }
}