package home_work;

public enum Size {

    SMALL("S", 12, 13), MEDIUM("M", 16, 17), LARGE("L", 21, 22), EXTRA_LARGE("XL", 32, 34);

    String shortName;
    int width, length;

    public String getShortName() {
        return shortName;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    Size(String shortName, int width, int length) {
        this.shortName = shortName;
        this.width = width;
        this.length = length;

    }

    @Override
    public String toString() {
        return getShortName()+" or "+super.name()+" size :width="+getWidth()+", length="+getLength()+".";
    }
}
