package model;

import java.util.Collection;
import java.util.HashSet;

public class InteractionAdministrator {
	private Collection<Entity> entities = new HashSet<>();

	public void savedInteraction(Collection<Entity> collisionEntities, Interaction interaction) {
		entities = collisionEntities;
	}

}
