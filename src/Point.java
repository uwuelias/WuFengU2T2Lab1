public class Point {
    private int xvalue;
    private int yvalue;

    public Point(int xvalue, int yvalue) {
        this.xvalue = xvalue;
        this.yvalue = yvalue;
    }

    public Point(int value) {
        this.xvalue = value;
        this.yvalue = value;
    }
    public Point() {
            this.xvalue = 0;
            this.yvalue = 0;
    }

    public int getX() {
        return xvalue;
    }

    public int getY() {
        return yvalue;
    }

    public String coordinate() {
        return "(" + xvalue + ", " + yvalue + ")";
    }

    public void setX(int newX) {
        xvalue = newX;
    }

    public void setY(int newY) {
        yvalue = newY;
    }

    public String quadrant() {
        if (xvalue > 0 && yvalue > 0) {
            return "I";
        }
        if (xvalue < 0 && yvalue > 0) {
            return "II";
        }
        if (xvalue < 0 && yvalue < 0) {
            return "III";
        }
        if (xvalue > 0 && yvalue < 0) {
            return "IV";
        }
        if (xvalue == 0 && yvalue == 0) {
            return "origin";
        }
        if (xvalue>0 || xvalue<0 && yvalue == 0) {
            return "on an axis";
        }
        if (xvalue == 0 && yvalue>0 || yvalue<0) {
            return "on an axis";
        }
        return "";
    }
}

