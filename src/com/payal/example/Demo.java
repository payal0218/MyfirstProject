package com.payal.example;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public void m1()
	{
		List<String> list = new ArrayList<String>();
		list.add("core java");
		list.add("collection framework");
		list.add("Database");
		list.add("git");
		list.add("JDBC");
		System.out.println(list);
	}
	public static void main(String[] args)
	{
		Demo demo = new Demo();
		demo.m1();
	}
}
