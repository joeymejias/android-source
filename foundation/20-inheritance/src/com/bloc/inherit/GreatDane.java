package com.bloc.inherit;

/************************************************
 *	ASSIGNMENT:
 *	Define the GreatDane class below
 *
 *	Great Danes have an extra size category, "huge".
 *	After growing to a "large" size, they may grow
 *	to an additional, "huge" size after 3 meals.
/************************************************/

public class GreatDane extends Dog {
	int MAX_SIZE_OF_DOG = 4;

	int max_size_of_dog() {
		return MAX_SIZE_OF_DOG;
	}

	@Override
	int getSizeIndex(String size) {
		if ("huge".equals(size)) {
			return 4;
		}
		else {
			return super.getSizeIndex(size);
		}
	}

	@Override
	String fromSizeIndex(int index) {
		if (index == 4)	{
			return "huge";
		}
		else {
			return super.fromSizeIndex(index);
		}
	}
}