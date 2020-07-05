package pl.yellowduck.netflix90;

import pl.yellowduck.netflix90.Resources.Category;

public class Main3 {
    public static void main(String[] args) {

        Category category = Category.DRAMA;

        System.out.println(category);
        System.out.println(category.toString());
        System.out.println(category.name());
        System.out.println(category.ordinal());

        Category categoryComedy = Category.COMEDY;

        System.out.println(categoryComedy);
        System.out.println(categoryComedy.toString());
        System.out.println(categoryComedy.name());
        System.out.println(categoryComedy.ordinal());

//        System.out.println(Category.DRAMA.getClass());
//        System.out.println(Category.DRAMA.getDeclaringClass());
//        System.out.println(Category.HORROR.getClass());
//        System.out.println(Category.HORROR.getDeclaringClass());
    }
}
