package com.bloc.objects;

class Artist extends Object {
	// The artist's first name
	public String mFirstName;
	// The artist's last name
	public String mLastName;

	/*
	 * Artist
	 *
	 * @param firstName (String)
	 * @param lastName (String)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the Artist constructor
	/************************************************/
	public Artist (String firstName, String lastName) {
		this.mFirstName = firstName;
		this.mLastName = lastName;
	}
}