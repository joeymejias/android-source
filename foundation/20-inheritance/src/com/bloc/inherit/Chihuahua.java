package com.bloc.inherit;

/************************************************
 *	ASSIGNMENT:
 *	Define the Chihuahua class below
 *
 *	Chiuahuas must be fed 5 times in order to grow
 *	larger.
/************************************************/
public class Chihuahua extends Dog {
	int NUMBER_OF_FEEDINGS_BEFORE_GROWING = 5;

	int number_of_feedings_before_growing() {
		return NUMBER_OF_FEEDINGS_BEFORE_GROWING;
	}
}