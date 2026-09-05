package circle.blue;

import net.minecraft.util.StringRepresentable;

public enum PLACED implements StringRepresentable {
    NORTH("north"),
    SOUTH("south"),
    WEST("west"),
    EAST("east"),
    ABOVE("above"),
    BELOW("below");


    private final String name;

    private PLACED(final String name) {
        this.name = name;
    }

    public String toString() {
        return this.getSerializedName();
    }
    @Override
    public String getSerializedName() {
        return this.name;
    }
}
