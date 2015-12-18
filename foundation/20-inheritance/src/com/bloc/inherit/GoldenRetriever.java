package com.bloc.inherit;

/************************************************
 *	ASSIGNMENT:
 *	Define the GoldenRetriever class below
 *
 *	Golden Retrievers shrink to a smaller size after
 *	playing only 3 times.
/************************************************/

public class GoldenRetriever extends Dog {
	int NUMBER_OF_PLAYS_BEFORE_SHRINKING = 3;

	int number_of_plays_before_shrinking() {
		return NUMBER_OF_PLAYS_BEFORE_SHRINKING;
	}
}