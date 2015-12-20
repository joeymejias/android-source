package com.bloc.securitypackages.apples;

import com.bloc.securitypackages.*;
/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

public abstract class Apple extends Fruit {

	public abstract void bite();

	public Apple(String name, int calories, Color color, double weight) {
		super(name, calories, color, weight);
	}

}