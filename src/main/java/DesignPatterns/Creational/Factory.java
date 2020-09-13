package DesignPatterns.Creational;

public class Factory {

    public interface Shape {
        void draw();
    }

    public static class Square implements Shape {
        @Override
        public void draw() {
            System.out.println("Inside Square::draw() method.");
        }
    }

    public static class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Inside Circle::draw() method.");
        }
    }

    public static class ShapeFactory {
        //use getShape method to get object of type shape
        private Shape getShape(String shapeType) {
            if (shapeType.equalsIgnoreCase("CIRCLE")) {
                return new Circle();

            } else if (shapeType.equalsIgnoreCase("SQUARE")) {
                return new Square();
            }

            return null;
        }
    }

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of square
        shape3.draw();
    }
}

