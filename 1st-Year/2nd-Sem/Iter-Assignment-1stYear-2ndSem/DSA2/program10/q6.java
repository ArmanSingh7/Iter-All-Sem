package program10;
abstract class Shape {
    abstract void Area();
}
class square extends Shape {
    double side;

    public square(double side) {
        this.side = side;
    }

    void Area() {
        System.out.println("ar sq: " + side * side);
    }
    class circle extends Shape {
        double radius;

        public circle(double radius) {
            this.radius = radius;
        }

        void Area() {
            System.out.println("ar cir: " + Math.PI * radius * radius);

        }
        class triangle extends Shape {
            double base, height;

            public triangle(double base, double height) {
                this.base = base;
                this.height = height;
            }

            void Area() {
                System.out.println("ar tri: " + 0.5 * base * height);
            }
        }
    }

    public class Q6 {
        public static void main(String[] args) {
            square s = new square(7.5);
            s.Area();
//            circle c = new circle(5.5);
//            c.Area();
////            triangle t = new triangle(5.5, 3.5);
//            t.Area();

        }
    }

}