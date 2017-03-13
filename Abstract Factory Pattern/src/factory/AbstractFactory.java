package factory;

import color.*;
import shape.*;
/**
 * factory.AbstractFactory
 * ACIT 2515 Activity name
 * Enter a brief one sentence description of what this class is
 *
 * @author Jed Iquin A00790108
 * @date 2017-03-13
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
