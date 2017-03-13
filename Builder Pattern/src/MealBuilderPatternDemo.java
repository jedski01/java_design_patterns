import item.*;

/**
 * MealBuilderPatternDemo
 * ACIT 2515 Activity name
 * Enter a brief one sentence description of what this class is
 *
 * @author Jed Iquin A00790108
 * @date 2017-03-13
 */
public class MealBuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = MealBuilder.getInstance();

        Meal vegMeal = mealBuilder.prepareVegMeal();

        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();

        System.out.println("Non Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());

    }

}
