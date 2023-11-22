package com.teachmeskills.lesson7.HW.Homework1;

public class Circle extends Figure{
    public double radius;

    public Circle (double radius){
        // Проверка на ноль и отрицательные величины
        if (radius <= 0){
            System.out.println("Invalid entry");
            return;
        }
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
