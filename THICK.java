package circle.blue;

import net.minecraft.util.StringRepresentable;

public enum THICK implements StringRepresentable {
    BASE("base"),
    FRUSTUM("frustum"),
    MEDIUM("medium"),
    TIP("tip");
    private final String name;

    private THICK(final String name) {
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

