package com.epam.design_patterns;

import java.util.*;
public class IteratorPattern
{
public static void main(String args[])
{
ArrayList<String> items = new ArrayList<String>();
items.add("iterator pattern");
items.add("Template pattern");
items.add("Factory pattern");
items.add("Builder pattern");
items.add("Adapter pattern");;
System.out.println("Different design patterns are: ");
Iterator<String> iter = items.iterator();  
while (iter.hasNext())
{
System.out.print(iter.next());
if(iter.hasNext())
System.out.print(", ");
}
}
}