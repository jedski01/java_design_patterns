import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * PrototypePatternDemo
 * ACIT 2515 Activity name
 *
 * Prototype pattern refers to creating duplicate object while
 keeping performance in mind. This type of design pattern comes
 under creational pattern as this pattern provides one of the best
 ways to create an object.

 This pattern involves implementing a prototype interface which
 tells to create a clone of the current object. This pattern is
 used when creation of object directly is costly. For example, an
 object is to be created after a costly database operation. We
 can cache the object, returns its clone on next request and
 update the database as and when needed thus reducing database
 calls.

 NOTE:
 A static class is one that has only static methods, for which a
 better word would be "functions". The design style embodied in a
 static class is purely procedural.

 Singleton, on the other hand, is a pattern specific to OO design.
 It is an instance of an object (with all the possibilities
 inherent in that, such as polymorphism), with a creation
 procedure that ensures that there is only ever one instance of
 that particular role over its entire lifetime.
 *
 * @author Jed Iquin A00790108
 * @date 2017-03-13
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
