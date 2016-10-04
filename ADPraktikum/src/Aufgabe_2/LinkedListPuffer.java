package Aufgabe_2;

import Aufgabe_1.PufferAbstract;

public class LinkedListPuffer extends PufferAbstract {
	private int maxSize;
	private int size = 0;
	private ConsZelle head;
	private ConsZelle tail;

	public LinkedListPuffer() {
		this.maxSize = MAX_PUFFER;
	}

	public LinkedListPuffer(int maxSize) {
		this.maxSize = maxSize;
	}

	@Override
	protected boolean private_push(String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected String private_pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String private_peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean private_contains(String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected int private_size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected boolean private_isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
