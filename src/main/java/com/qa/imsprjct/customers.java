package com.qa.imsprjct;

public class customers {

	private int id;
	private String first_name;
	private String surname;
	

	public customers() {
		super();
	}

	public customers(int id, String first_name, String surname) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.surname = surname;
		
	}

	public customers(String first_name, String surname) {
		super();
		this.first_name= first_name;
		this.surname = surname;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfirst_name() {
		return first_name;
	}

	public void setfirst_name(String first_name) {
		this.first_name = first_name;
	}



	public String surname() {
		return surname;
	}

	public void setsurname(String surname) {
		this.surname = surname;
	}

	
	}


