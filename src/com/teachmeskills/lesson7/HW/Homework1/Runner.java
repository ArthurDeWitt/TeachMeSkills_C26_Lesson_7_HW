package com.teachmeskills.lesson7.HW.Homework1;

import java.util.Random;

public class Runner {
    public static void main(String[] args) {{
        Random random = new Random();

        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(random.nextDouble() * 10, random.nextDouble() * 10, random.nextDouble() * 10);
        figures[1] = new Rectangle(random.nextDouble() * 10, random.nextDouble() * 10);
        figures[2] = new Circle(random.nextDouble() * 10);
        figures[3] = new Triangle(random.nextDouble() * 10, random.nextDouble() * 10, random.nextDouble() * 10);
        figures[4] = new Rectangle(random.nextDouble() * 10, random.nextDouble() * 10);

        double totalPerimeter = 0;
            for (Figure figure : figures) {
                System.out.println("Area of: " + figure.getArea());
                System.out.println("Perimeter: " + figure.getPerimeter());
                totalPerimeter += figure.getPerimeter();
                System.out.println();
            }

            System.out.println("Sum perimeters of figures: " + totalPerimeter);
        }
    }
}
