package Aufgabe_2;

public class ConsZelle {
	private ConsZelle next;
	private ConsZelle prev;
	private String value;

	public ConsZelle(String value) {
		this.value = value;
	}

	public ConsZelle getNext() {
		return next;
	}

	public ConsZelle getPrev() {
		return prev;
	}

	public String getValue() {
		return value;
	}
}
