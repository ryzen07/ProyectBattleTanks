package model;

import java.util.Collection;
import java.util.HashSet;

public class Square {
	Collection<Entity> objects = new HashSet<>();
	Collection<String> positions = new HashSet<>();

	public void add(Entity object) {
		objects.add(object);
	}

	public void add(String position) {
		positions.add(position);
	}

	public boolean contains(Entity entity) {
		return objects.contains(entity);
	}

	public boolean contains(String position) {
		return positions.contains(position);
	}

	@Override
	public String toString() {
		return objects.toString();
	}

	public String toStringPosition() {
		return positions.toString();
	}

}