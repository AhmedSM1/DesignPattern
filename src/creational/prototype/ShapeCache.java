package creational.prototype;

import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeCache {


    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static List<Shape> getAll() {
        return shapeMap.values().stream().collect(Collectors.toList());
    }

    // For each shape, run the database query and create a shape
    // ShapeCache.loadCache() should be called to initialize the cache
    public static void loadCache() {
        int CIRCLE_COUNT = 5;
        int RECTANGLE_COUNT = 5;

        for (int i = 0; i <= CIRCLE_COUNT ; i++){
            Circle circle = new Circle();
            circle.setId("CIRCLE_"+i);
            shapeMap.put(circle.getId(), circle);
        }

        for (int i = 0; i <= RECTANGLE_COUNT ; i++){
            Rectangle rectangle = new Rectangle();
            rectangle.setId("RECTANGLE_"+i);
            shapeMap.put(rectangle.getId(), rectangle);
        }





    }
}
