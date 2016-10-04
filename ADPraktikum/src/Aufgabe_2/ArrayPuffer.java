package Aufgabe_2;

import Aufgabe_1.PufferAbstract;

public class ArrayPuffer extends PufferAbstract {
	private String[] puffer;
	private int indexFirst = 0;
	private int indexLast = 1;
	private int size = 0;
	private int maxSize;

	public ArrayPuffer(int maxSize) {
		this.maxSize = maxSize;
		puffer = new String[maxSize];
	}

	public ArrayPuffer() {
		this.maxSize = MAX_PUFFER;
		puffer = new String[maxSize];
	}

	@Override
	protected boolean private_push(String value) {
		size++;
		if (size > maxSize)
			return false;
		indexLast--;
		if (indexLast < 0)
			indexLast += maxSize;
		puffer[indexLast] = value;
		return true;
	}

	@Override
	protected String private_pop() {
		if (isEmpty())
			return null;
		String val = puffer[indexFirst];
		indexFirst--;
		if (indexFirst < 0)
			indexFirst += maxSize;
		size--;
		return val;
	}

	@Override
	protected String private_peek() {
		if (size > 0)
			return puffer[indexFirst];
		return null;
	}

	@Override
	protected boolean private_contains(String value) {
		for (int i = 0; i < size; i++) {
			if (puffer[indexLast + i > maxSize - 1 ? indexLast + i - maxSize : indexLast + i] == value)
				return true;
		}
		return false;
	}

	@Override
	protected int private_size() {
		return size;
	}

	@Override
	protected boolean private_isEmpty() {
		if (size == 0)
			return true;
		return false;
	}

}
