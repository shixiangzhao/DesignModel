package com.cienet.iterator;

class ConcreteIterator extends Iterator {

	private ConcreteAggregate aggregate;
	private int current;

	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public Object first() {
		return aggregate.getItem(0);
	}

	@Override
	public Object next() {
		Object ret = null;
		if (current < aggregate.count()) {
			ret = aggregate.getItem(current);
		}
		current++;
		return ret;
	}

	@Override
	public boolean isDone() {
		return current < aggregate.count() ? false : true;
	}
}
