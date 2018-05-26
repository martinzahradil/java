package cz.isonsoft.lambda;

class Boss {
	private String name;

	public Boss(String name) {
		this.name = name;
	}

	public String getName() {
		return name.toUpperCase();
	}

	public String toString() {
		return name;
	}
}

