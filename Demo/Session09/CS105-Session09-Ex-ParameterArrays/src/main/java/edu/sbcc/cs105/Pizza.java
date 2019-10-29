package edu.sbcc.cs105;

import java.util.ArrayList;
import java.util.List;

public class Pizza{ 

	private List<String> toppings = new ArrayList<String>();
	private int pizzaId;
	
	public Pizza(int menuItemNo, String... additionalToppings){

	  
	  for (String topping : additionalToppings){
		  toppings.add(topping);
	  }

	}
	
	public List<String> getToppings(){
		return toppings;
	}
	}
