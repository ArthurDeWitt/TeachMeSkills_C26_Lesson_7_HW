package com.teachmeskills.lesson7.HW.Homework1;

public class Rectangle extends Figure{
    public double length;
    public double width;

    // Создаём конструктор для прямоугольника с параметрами длины (length) и ширины (width)
    public Rectangle (double length, double width){
        // Проверка на ноль и отрицательные величины
        if (width <= 0 || length <= 0){
            System.out.println("Invalid entry");
            return;
        }
        this.length = length;
        this.width = width;
    }

    // Создаём метод расчёта периметра прямоугольника
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Создаём метод расчёта площади прямоугольника
    public double getArea(){
        return length * width;
    }
}
