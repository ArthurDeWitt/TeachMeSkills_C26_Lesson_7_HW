package com.teachmeskills.lesson7.HW.Homework1;


// Создаём класс Triangle и наследуем необходимое из абстрактного класса Figure
public class Triangle extends Figure {
    // Ввод данных для расчёта
    public Triangle(double firstSide, double secondSide, double thirdSide) {

        // Проверка на ноль, отрицательные величины и условия существования треугольника
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0){
            System.out.println("Invalid entry");
            return ;
        } else if(firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide){
            System.out.println("No such triangle exists");
            return;
        }

        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    // Реализуем метод расчёта полупериметра
    public double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    // Реализуем метод расчёта площади по формуле Герона
    public double getArea() {
        double semiPerimeter = getPerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - firstSide) * (semiPerimeter - secondSide) * (semiPerimeter - thirdSide));
    }
}
