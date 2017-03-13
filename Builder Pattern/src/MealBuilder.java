import item.*;

/**
 * MealBuilder
 * ACIT 2515 Activity name
 *
 * Builder pattern builds a complex object using simple objects and
 using a step by step approach. This type of design pattern comes
 under creational pattern as this pattern provides one of the best
 ways to create an object.

 A Builder class builds the final object step by step. This
 builder is independent of other objects.
 *
 * @author Jed Iquin A00790108
 * @date 2017-03-13
 */
public class MealBuilder {

    private static MealBuilder instance;

    private MealBuilder() {}

    public static MealBuilder getInstance() {
        if (instance == null) {
            instance = new MealBuilder();
        }

        return instance;
    }

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
