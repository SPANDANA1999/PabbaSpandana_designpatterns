package com.epam.design_patterns;

abstract class Shape
{
int side1, side2;
double area;
abstract void area();
}

class Rectangle extends Shape
{
Rectangle(int length, int breadth)
{
super.side1=length;
super.side2=breadth;
}

void area()
{
area = side1*side2;
}
}

class square extends Shape
{
  square(int side)
{
  side1=side;
  side2=side;
}
void area()
{
area = (side1*side2);
}
}

public class TemplatePattern
{
public static void main(String args[])
{
Rectangle rectangle = new Rectangle(2, 4);
rectangle.area();
System.out.println("Area of rectangle with side lengths as: "+rectangle.side1+" and "+rectangle.side2+" is : "+rectangle.area);

square square = new square(2);
square.area();
System.out.println("Area of square with side lengths as : "+square.side1+" and "+square.side2+" is: "+square.area);
}

}

