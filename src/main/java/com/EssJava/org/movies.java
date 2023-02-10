package com.EssJava.org;

public class movies {
	String titolo;
	int id;
	public movies(String titolo, int id) {
		this.titolo = titolo;
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
