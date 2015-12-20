package com.bloc.securitypackages.apples;

import com.bloc.securitypackages.*;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

public class Macintosh extends Apple {

	public Macintosh() {
		super(Macintosh.class.getSimpleName(), 200, new com.bloc.securitypackages.colors.Red(), 0.14d);
	}

	public void bite() {
		setWeight(getWeight() - 0.01d);
	}

}