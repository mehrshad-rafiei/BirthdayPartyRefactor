package scrap.heap.refactor.domain;

public class Balloon implements Orderable {

    private Material material;
    private Color color;

    private Balloon (Builder builder) {
        this.material = builder.material;
        this.color = builder.color;
    }

    public static class Builder {
        private Material material;
        private Color color;

        public static Builder newInstance()
        {
            return new Builder();
        }

        private Builder() {}

        public Builder setMaterial(Material material)
        {
            this.material = material;
            return this;
        }

        public Builder setColor(Color color)
        {
            this.color = color;
            return this;
        }

        public Balloon build() {
            return new Balloon(this);
        }
    }

    public enum Material {
        MYLAR, LATEX
    }

    public Material getMaterial() {
        return material;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Balloon{");
        sb.append("material=").append(material);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }
}
