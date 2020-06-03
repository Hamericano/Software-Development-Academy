package builder;

public class TableBuilder {
    private String color;
    private String material;
    private boolean hasShinySurface;
    private boolean hasRoundCorners;
    private int length;
    private int width;
    private int height;

    public class Table {
        private String color;
        private String material;
        private boolean hasShinySurface;
        private boolean hasRoundCorners;
        private int length;
        private int width;
        private int height;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public boolean isHasShinySurface() {
            return hasShinySurface;
        }

        public void setHasShinySurface(boolean hasShinySurface) {
            this.hasShinySurface = hasShinySurface;
        }

        public boolean isHasRoundCorners() {
            return hasRoundCorners;
        }

        public void setHasRoundCorners(boolean hasRoundCorners) {
            this.hasRoundCorners = hasRoundCorners;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setHasShinySurface(boolean hasShinySurface) {
        this.hasShinySurface = hasShinySurface;
    }

    public void setHasRoundCorners(boolean hasRoundCorners) {
        this.hasRoundCorners = hasRoundCorners;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Table build(){

        if(color == null){
            throw new RuntimeException("Color not set.");
        }
        if(material == null){
            throw new RuntimeException("Material not set.");
        }
        if(length == 0){
            throw new RuntimeException("Length not set.");
        }
        if(width == 0){
            throw new RuntimeException("Width not set.");
        }
        if(height == 0){
            throw new RuntimeException("Height not set.");
        }
        Table table = new Table();
        table.setColor(color);
        table.setMaterial(material);
        table.setHeight(height);
        table.setLength(length);
        table.setWidth(width);

        return table;
    }
}
