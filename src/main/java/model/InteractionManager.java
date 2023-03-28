package model;

import java.util.Collection;
import java.util.HashSet;

public class InteractionManager {
	Collection<Interaction> interactions = new HashSet<>();

	public void add(Interaction interaction) {
		interactions.add(interaction);
	}

	public Collection<Interaction> getInteractions() {
		return interactions;
	}

	public boolean canMove() {

		for (Interaction interaction : interactions) {
			if (!interaction.canMove()) {
				return false;
			}
		}
		return true;
	}
}