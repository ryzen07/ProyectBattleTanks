package model;

import java.util.Collection;
import java.util.HashSet;

public class Square {
	private final Collection<Entity> entities = new HashSet<>();

	public void add(Entity object) {
		entities.add(object);
	}

	public void remove(Entity object) {
		entities.remove(object);
	}

	public boolean isEmpty() {
		return entities.isEmpty();
	}

	public boolean contains(Entity entity) {
		return entities.contains(entity);
	}

	public Collection<Entity> getEntities() {
		return entities;
	}

	@Override
	public String toString() {
		return entities.toString();
	}
}