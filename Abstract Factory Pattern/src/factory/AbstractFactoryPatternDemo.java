package factory;

import shape.*;
import color.*;

/**
 * factory.AbstractFactoryPatternDemo
 * ACIT 2515 Activity name
 *
 * Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called
 as factory of factories. This type of design pattern comes under creational pattern as this pattern provides one
 of the best ways to create an object.

 In Abstract Factory pattern an interface is responsible for creating a factory of related objects without
 explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.
 *
 * @author Jed Iquin A00790108
 * @date 2017-03-13
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get an object of shape circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        //get an object of shape square
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        //get an object of shape rectangle
        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //get an object of color red
        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        //get an object of color green
        Color color2 = colorFactory.getColor("GREEN");
        color2.fill();

        //get an object of color blue
        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();
    }
}
