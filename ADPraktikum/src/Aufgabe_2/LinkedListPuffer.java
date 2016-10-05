package Aufgabe_2;

import Aufgabe_1.PufferAbstract;

public class LinkedListPuffer extends PufferAbstract {
	private int maxSize;
	private int size = 0;
	private ConsZelle head = new ConsZelle(null, null, null);
	private ConsZelle tail = new ConsZelle("test", head, head);

	{
		head.next = tail;
		head.prev = tail;
	}

	public LinkedListPuffer() {
		this.maxSize = MAX_PUFFER;

	}

	public LinkedListPuffer(int maxSize) {
		this.maxSize = maxSize;
	}

	@Override
	protected boolean private_push(String value) {
		if (size + 1 > maxSize)
			return false;
		size++;
		tail.next.prev = new ConsZelle(value, tail.next, tail);
		tail.next = tail.next.prev;
		return true;
	}

	@Override
	protected String private_pop() {
		if (isEmpty())
			return null;
		size--;
		String val = head.prev.getValue();
		head.prev = head.prev.prev;
		head.prev.next = head;
		return val;
	}

	@Override
	protected String private_peek() {
		if (isEmpty())
			return null;
		return head.prev.getValue();
	}

	@Override
	protected boolean private_contains(String value) {
		ConsZelle cursor = tail.next;
		for (int i = 0; i < size; i++) {
			if (cursor.getValue() == value)
				return true;
			cursor = cursor.next;
		}
		return false;
	}

	@Override
	protected int private_size() {
		return size;
	}

	@Override
	protected boolean private_isEmpty() {
		return size == 0 ? true : false;
	}

}
