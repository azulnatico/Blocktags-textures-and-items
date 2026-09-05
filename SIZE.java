package circle.blue;

import net.minecraft.util.StringRepresentable;

public enum SIZE implements StringRepresentable {
    LITTLE("little"),
    MEDIUM("medium"),
    BIG("big");



    private final String name;

    private SIZE(final String name) {
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
