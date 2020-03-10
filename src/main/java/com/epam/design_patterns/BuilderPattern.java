package com.epam.design_patterns;

abstract class Cake
{
String name;
int amtofsugar, amtofmilk;
String flavour;
Cake(String name,int amtofsugar, int amtofmilk, String flavour)
{
this.name=name;
this.amtofmilk=amtofmilk;
this.amtofsugar=amtofsugar;
this.flavour=flavour;
}
}

class VanillaCake extends Cake
{
int eggs;
boolean cherries;
VanillaCake(String name,int amtofsugar, int amtofmilk, int eggs, boolean cherries)
{
super(name,amtofsugar,amtofmilk,"Vanilla");
this.eggs=eggs;
this.cherries= cherries;
}

@Override
public String toString() {
String res=this.name+" is made by: ";
res+="\n"+this.amtofsugar+" kg sugar, "+this.amtofmilk+" litre of milk, "+this.eggs+" eggs ";
if(this.cherries==false)
res+="and no cherries";
else
res+="and cherries";
return res;
}
}

class ChocolateCake extends Cake
{
boolean eggs;
String toppings;
ChocolateCake(String name,int amtofsugar, int amtofmilk,boolean eggs, String toppings)
{
super(name,amtofsugar,amtofmilk,"Chocolate");
this.eggs=eggs;
this.toppings=toppings;
}

@Override
public String toString() {
String res= this.name+" is made by: ";
res+="\n"+this.amtofsugar+" kg sugar, "+this.amtofmilk+" litre of milk, "+this.toppings+" as toppings ";
if(this.eggs==false)
res+="and no eggs";
else
res+=" and eggs";
return res;
}
}
public class BuilderPattern
{
public static void main(String args[])
{
VanillaCake vanilla_cake = new VanillaCake("vanilla_cake ",5, 3, 1, true);
VanillaCake vanilla_cake2 = new VanillaCake("vanilla_cake2",4, 2, 4,false);

ChocolateCake choc1 = new ChocolateCake("choc1",1, 2, false, "choco chip");
ChocolateCake choc2 = new ChocolateCake("choc2",3, 1, true, "choco nuts");

System.out.println(vanilla_cake);
System.out.println(vanilla_cake2);
System.out.println(choc1);
System.out.println(choc2);
}
}

