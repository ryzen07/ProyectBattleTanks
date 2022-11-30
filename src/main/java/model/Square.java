package model;

import java.util.Collection;
import java.util.HashSet;

public class Square {
	Collection<Entity> objects = new HashSet<>();

	public void add(Entity object) {
		objects.add(object);
	}

	public void remove(Entity object) {
		objects.remove(object);
	}

	public boolean contains(Entity entity) {
		return objects.contains(entity);
	}

	@Override
	public String toString() {
		return objects.toString();
	}
}
