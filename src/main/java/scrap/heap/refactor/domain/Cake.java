package scrap.heap.refactor.domain;

public class Cake implements Orderable{

    private Flavor flavor;
    private Flavor frostingFlavor;
    private Shape shape;
    private Color color;
    private Size size;

    private Cake(Builder builder) {
        this.flavor = builder.flavor;
        this.frostingFlavor = builder.frostingFlavor;
        this.shape = builder.shape;
        this.color = builder.color;
        this.size = builder.size;
    }

    public static class Builder {
        private Flavor flavor;
        private Flavor frostingFlavor;
        private Shape shape;
        private Color color;
        private Size size;

        public static Builder newInstance()
        {
            return new Builder();
        }

        private Builder() {}

        public Builder setFlavor(Flavor flavor)
        {
            this.flavor = flavor;
            return this;
        }

        public Builder setFrostingFlavor(Flavor frostingFlavor)
        {
            this.frostingFlavor = frostingFlavor;
            return this;
        }

        public Builder setShape(Shape shape)
        {
            this.shape = shape;
            return this;
        }

        public Builder setColor(Color color)
        {
            this.color = color;
            return this;
        }

        public Builder setSize(Size size)
        {
            this.size = size;
            return this;
        }

        public Cake build() {
            return new Cake(this);
        }
    }

    public enum Flavor {
        CHOCOLATE, VANILLA
    }

    public enum Shape {
        CIRCLE, SQUARE
    }

    public enum Size {
        LARGE, MED, SMALL
    }

    public Flavor getFlavor() {
        return flavor;
    }

    public Flavor getFrostingFlavor() {
        return frostingFlavor;
    }

    public Shape getShape() {
        return shape;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cake{");
        sb.append("flavor=").append(flavor);
        sb.append(", frostingFlavor=").append(frostingFlavor);
        sb.append(", shape=").append(shape);
        sb.append(", color=").append(color);
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}
