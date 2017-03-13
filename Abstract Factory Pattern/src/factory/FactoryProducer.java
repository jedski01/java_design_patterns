package factory;

/**
 * FactoryProducer
 * ACIT 2515 Activity name
 * Enter a brief one sentence description of what this class is
 *
 * @author Jed Iquin A00790108
 * @date 2017-03-13
 */
public class FactoryProducer {

    //this design is from the singleton pattern
    //please refer to singleton pattern to make sure you
    //understand this
    private static ShapeFactory shapeFactoryInstance;
    private static ColorFactory colorFactoryInstance;

    private FactoryProducer(){}

    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("SHAPE")) {
            if (shapeFactoryInstance == null) {
                shapeFactoryInstance = new ShapeFactory();
            }
            return shapeFactoryInstance;
        } else if (choice.equalsIgnoreCase("COLOR")) {
            if (colorFactoryInstance == null) {
                colorFactoryInstance = new ColorFactory();
            }
            return colorFactoryInstance;
        }

        return null;
    }
}
