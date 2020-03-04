package hfad.com.r7coffeina;

public class Drink {

    private String name;
    private String decription;
    private int imageId;

    public static final Drink [] drink = {
            new Drink("Latte", "Latte Lorem ipsum dolor sit amet, consectetur adipiscing elit", R.drawable.latte),
            new Drink("Cappuccino", "Cappuccino Lorem ipsum dolor sit amet, consectetur adipiscing elit", R.drawable.capucino),
            new Drink("Espresso", "Espresso Lorem ipsum dolor sit amet, consectetur adipiscing elit", R.drawable.filter),
            new Drink("Tea", "Tea Lorem ipsum dolor sit amet, consectetur adipiscing elit", R.drawable.filter)
    };

    Drink(String name, String description, int imageId){
        this.name = name;
        this.decription = description;
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }
    public String getDecription(){
        return decription;
    }
    public int getImageId(){
        return imageId;
    }
    public String toString(){
        return this.name;
    }
}
