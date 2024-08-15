package creational.prototype;


public class Main {

    /*
        The Prototype pattern is a creational design pattern
         that allows you to create new objects by copying an existing object, known as a prototype,
          instead of creating new instances from scratch.
           This pattern is useful
           when the cost of creating a new object is  more expensive than copying an existing one,
           or when you need to preserve the state of an existing object.
     */
    public static void main(String[] args) {
        ShapeCache.loadCache();
        ShapeCache.getAll().forEach(a -> {
                    System.out.println("Shape : " + a.getType());
                    a.draw();

                }

        );
//        Shape clonedShape1 = ShapeCache.getShape("1");
//        System.out.println("Shape : " + clonedShape1.getType());
//        clonedShape1.draw();
//
//        Shape clonedShape2 = ShapeCache.getShape("2");
//        System.out.println("Shape : " + clonedShape2.getType());
//        clonedShape2.draw();
    }



}