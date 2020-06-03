package com.sda.comparable;

public class Patrat implements Comparable<Patrat>{
    private int latura;

    public Patrat(int latura) {
        this.latura = latura;
    }

    public double getArea() {
        return this.latura * this.latura;
    }

    @Override
    public String compareTo(Patrat patrat) {
        if(patrat.getArea() > this.getArea())
            return "-1";
        if(patrat.getArea() < this.getArea())
            return "1";
        else
            return "0";

    }
}
