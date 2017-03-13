import java.util.Hashtable;

/**
 * ShapeCache
 * ACIT 2515 Activity name
 * Enter a brief one sentence description of what this class is
 *
 * @author Jed Iquin A00790108
 * @date 2017-03-13
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
    //private static ShapeFactory shapeFactory = ShapeFactory.getInstance();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    //for each shape run database query and create shape
    //shapeMap.put(shapeKey, shape)
    //for example, we are adding three shapes

    public static void loadCache() {
        Shape circle = ShapeFactory.getShape("CIRCLE");
        shapeMap.put(circle.getId(), circle);

        Shape square = ShapeFactory.getShape("SQUARE");
        shapeMap.put(square.getId(), square);

        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
