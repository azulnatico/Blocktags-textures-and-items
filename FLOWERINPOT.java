package circle.blue;

import net.minecraft.util.StringRepresentable;

public enum FLOWERINPOT implements StringRepresentable {
     POPPY("poppy"),
    ALLIUM("allium"),
    DANDELION("dandelion"),
    EYEBLOSSOM("eyeblossom"),
    WHITE_TULIP("white_tulip"),
    RED_TULIP("red_tulip"),
    ORANGE_TULIP("orange_tulip"),
    BLUE_ORCHID("blue_orchid"),
    AZURE_BLUET("azure_bluet"),
    CORNFLOWER("cornflower"),
    LILY_OF_THE_VALLEY("lily_of_the_valley"),
    WITHER_ROSE("wither_rose"),
    OXEYE_DAISY("oxeye_daisy"),
    PINK_TULIP("pink_tulip");



    private final String name;
    private FLOWERINPOT(final String name) {
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
