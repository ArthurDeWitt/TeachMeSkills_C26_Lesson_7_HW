package com.teachmeskills.lesson7.HW.Homework1;
/*
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя абстрактный класс/методы).
Создать массив из 5 разных фигур.
Пройтись циклом по массиву и вывести информацию о каждой фигуре.
Вывести на экран сумму периметров всех фигур в массиве.
 */

// Инициализация абстрактного класса Figure с параметрами трёх сторон и радиуса
public abstract class Figure {
    abstract double getArea();
    abstract double getPerimeter();
    public double firstSide;
    public double secondSide;
    public double thirdSide;
    public double radius;
}
