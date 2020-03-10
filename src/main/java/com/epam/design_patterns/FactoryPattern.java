package com.epam.design_patterns;

interface powerful
{
 String power();
}

class ChessPieces implements powerful
{
String name;
ChessPieces(String name)
{
this.name=name;
}
public String power()
{
return "Tells us about power";
}
}

class Solider extends ChessPieces
{
Solider(String name)
{
super(name);
}

public String power()
{
return this.name+" least powerful";
}
}

class King extends ChessPieces
{ 
 King(String name)
 {
  super(name);
 }

 public String power()
 {
   return this.name+" most powerful";
 }
}
public class FactoryPattern
{
public static void main(String args[])
{
 Solider solider = new Solider("solider");
 System.out.println(solider.power());
 King king = new King("king");
 System.out.println(king.power());
}
}