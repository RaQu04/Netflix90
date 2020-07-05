package pl.yellowduck.netflix90.Resources;

public enum Category implements Discontable {

    COMEDY(0, "Funny fims"){
        @Override
        public String toString() {
            return "Hahaha..";
        }
    },
    FANTASY(1, "Sci-fy films"), //1
    DRAMA(2, "Drama movie"),   //2
    HORROR(3, "Scarry films"),  //3
    MUSICAL(4, "Musicly films"), //4
    ACTION(5, "Action films");  //5

    private final int discount;
    private final String description;

    Category(int discount, String description) {
        this.discount = discount;
        this.description = description;
    }

    public String getDescription(){
        return "Hello";
    }

    @Override
    public String toString() {
        return name()+ " " + description;
    }

    @Override
    public int discount() {
        return discount;
    }
}
