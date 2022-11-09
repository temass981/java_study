package ru.stqa.java_study.Sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("people");

    double l = 5;
    System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

    double d = 2;
    double v = 3;
    System.out.println("Площадь прямоугольника с длиной " + d + " и шириной " + v + " = " + area(d, v));

  }

  public static void hello(String somebody) {

    System.out.println("Hello, " + somebody + "!");
    System.out.println("Hello, !");
  }

  public static double area(double l) {
    // System.out.println(l * l);
    return l * l;



  }
  public static double area(double a, double b) {
    return a * b;
  }
  public static int rectangle(int a, int b){
    return a * b;
  };



}

