public class Contact {
    private long phoneNumber;
    private int[] daysOpen;
    private int[] daysClosed;
    private String[] currentDay = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    private String email;

    public Contact()
    {
        this.phoneNumber = 0;
        this.daysClosed = new int[7];
        this.daysOpen = new int[7];
        this.email = "default@email.com";
    }

    public Contact(long phoneNumber,int[] daysOpen,int[] daysClosed, String inputEmail)
    {
        this.phoneNumber = phoneNumber;
        this.daysClosed = daysOpen;
        this.daysOpen = daysClosed;
        this.email = inputEmail;
    }

    void setPhoneNumber(long item)
    {
        this.phoneNumber = item;
    }

    String getPhoneNumber()
    {
       return String.valueOf(this.phoneNumber).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3");
    }

    void setDaysClosed(int[] item)
    {
        this.daysClosed = item;
    }

    int[] getDaysClosed()
    {
       return this.daysClosed;
    }

    void setDaysOpen(int[] item)
    {
        this.daysOpen = item;
    }

    int[] getDaysOpen()
    {
       return this.daysOpen;
    }

    void setEmail(String item)
    {
        this.email = item;
    }

    String getEmail()
    {
       return this.email;
    }

    @Override
    public String toString() { 
        String result = "Our Phone Number is: "  + getPhoneNumber() + "\n";
        result += "Our days of operation:\n";
        for(int i = 0; i < 7; i++)
        {
            result+="\t" + currentDay[i] + ": " + daysOpen[i] + "AM - " + daysClosed[i] + "PM.\n";
        }
        result += "Our email is: " + getEmail();
        return result;
    } 
}