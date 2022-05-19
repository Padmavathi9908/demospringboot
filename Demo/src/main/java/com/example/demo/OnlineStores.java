package com.example.demo;

public class OnlineStores {
	long id;
	String name;
	String CEO;

	public OnlineStores(long id, String name, String cEO) {
		super();
		this.id = id;
		this.name = name;
		CEO = cEO;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the cEO
	 */
	public String getCEO() {
		return CEO;
	}

	@Override
	public String toString() {
		return "OnlineStores [id=" + id + ", name=" + name + ", CEO=" + CEO + "]";
	}

}
