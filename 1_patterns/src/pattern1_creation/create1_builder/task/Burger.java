package pattern1_creation.create1_builder.task;

import java.util.ArrayList;
import java.util.List;

public final class Burger {

    // Required
    private Size size;
    private BunType bunType;

    // Optional
    private PattyType pattyType;
    private Cheese cheese;
    private Sauce sauce;
    private List<Extras> extras;

    public Burger(BurgerBuilder builder) {
        this.size = builder.size;
        this.bunType = builder.bunType;

        this.pattyType = builder.pattyType;
        this.cheese = builder.cheese;
        this.sauce = builder.sauce;
        this.extras = builder.extras;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "size=" + size +
                ", bunType=" + bunType +
                ", pattyType=" + pattyType +
                ", cheese=" + cheese +
                ", sauce=" + sauce +
                ", extras=" + extras +
                '}';
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public BunType getBunType() {
        return bunType;
    }

    public void setBunType(BunType bunType) {
        this.bunType = bunType;
    }

    public PattyType getPattyType() {
        return pattyType;
    }

    public void setPattyType(PattyType pattyType) {
        this.pattyType = pattyType;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public List<Extras> getExtras() {
        return extras;
    }

    public void setExtras(List<Extras> extras) {
        this.extras = extras;
    }

    public final static class BurgerBuilder {
        // Required
        private Size size;
        private BunType bunType;

        // Optional
        private PattyType pattyType = PattyType.BEEF;
        private Cheese cheese = Cheese.AMERICAN;
        private Sauce sauce = Sauce.KETCHUP;
        private final List<Extras> extras = new ArrayList<>();

        public BurgerBuilder(Size size, BunType bunType) {
            this.size = size;
            this.bunType = bunType;
        }

        public BurgerBuilder pattyType(PattyType pattyType) {
            this.pattyType = pattyType;
            return this;
        }

        public BurgerBuilder cheese(Cheese cheese) {
            this.cheese = cheese;
            return this;
        }

        public BurgerBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BurgerBuilder addExtra(Extras extras) {
            this.extras.add(extras);
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
