package model;

public class Interaction {
    private Movable movable;
    private Entity entity;
    public Interaction(Movable movable, Entity entity) {
        this.entity = entity;
        this.movable = movable;
    }
    public void collision()
    {
        this.movable.moveBack();
    }
}