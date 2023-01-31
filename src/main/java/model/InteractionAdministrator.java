package model;

import java.util.Collection;
import java.util.HashSet;

public class InteractionAdministrator {
	Collection<Interaction> interactionSet = new HashSet<>();

	public void add(Interaction interaction) {
		interactionSet.add(interaction);
	}
}