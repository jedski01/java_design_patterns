/**
 * ShapeFactory
 * ACIT 2515 Activity name
 * Enter a brief one sentence description of what this class is
 *
 * @author Jed Iquin A00790108
 * @date 2017-03-13
 */
public class ShapeFactory {

//    private static ShapeFactory instance = new ShapeFactory();
//
//    private ShapeFactory() {}
//
//    public static ShapeFactory getInstance() {
//        return instance;
//    }

    public static Shape getShape(String shapeType) {

        Shape shape = null;
        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            shape = new Circle();
            shape.setId("1");
        } else if(shapeType.equalsIgnoreCase("SQUARE")) {
            shape = new Square();
            shape.setId("2");
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            shape = new Rectangle();
            shape.setId("3");
        }

        return shape;
    }
}
