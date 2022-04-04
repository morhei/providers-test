package org.acme.rest.json;

public class Fruit {

    private String name;
    private String description;

    public Fruit() {
    }

    public Fruit(String name, String description) {
        this.name = name;
        this.description = description;
    }

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
    
    
}
