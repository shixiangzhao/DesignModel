package com.cienet.iterator;

class ConcreteIteratorDesc extends Iterator {

	private ConcreteAggregate aggregate;
	private int current;

	public ConcreteIteratorDesc(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
		current = aggregate.count() - 1;
	}

	@Override
	public Object first() {
		return aggregate.getItem(aggregate.count() - 1);
	}

	@Override
	public Object next() {
		Object ret = null;
		if (current >= 0) {
			ret = aggregate.getItem(current);
		}
		current--;
		return ret;
	}

	@Override
	public boolean isDone() {
		return current >= 0 ? false : true;
	}
}
