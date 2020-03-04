package hfad.com.r7coffeina;

public class Snacks {

    private String name, description;
    private int imageId;

    public static Snacks[] snacks = {
            new Snacks("Fries", "Fries Lorem ipsum dolor sit amet", R.drawable.snack_fries),
            new Snacks("Hamburger", "Hamburger Lorem ipsum dolor sit amet", R.drawable.snack_ham),
            new Snacks("Pizza", "Pizza Lorem ipsum dolor sit amet", R.drawable.snack_pizza)
    };

    Snacks(String name, String description, int imageID){
        this.name = name;
        this.description = description;
        this.imageId = imageID;
    }

    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public int getImageId(){
        return imageId;
    }
    //???????
    public String toString(){
        return this.name;
    }
}
