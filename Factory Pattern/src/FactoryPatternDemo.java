import shape.*;
/**
 * FactoryPatternDemo
 * ACIT 2515 Activity name
 * demo class to use ShapeFactory to get a Shape Object
 *
 * @author Jed Iquin A00790108
 * @date 2017-03-13
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

    }
}
