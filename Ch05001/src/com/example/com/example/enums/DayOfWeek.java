package com.example.com.example.enums;

public enum DayOfWeek {
    SUNDAY(1,"Sunday","Pazar"),
    MONDAY(2,"Monday","Pazartesi"),
    TUESDAY(3,"Tuesday","Salı"),
    WEDNESDAY(4,"Wednesday","Çarşamba"),
    THURSDAY(5,"Thursday","Perşembe"),
    FRIDAY(6,"Friday","Cuma"),
    SATURDAY(7,"Saturday","Cumartesi");
    private int i;
    private String eng;
    private String  tr;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getTr() {
        return tr;
    }

    public void setTr(String tr) {
        this.tr = tr;
    }

    DayOfWeek(int i, String eng, String tr) {
        this.i=i;
        this.eng=eng;
        this.tr=tr;
    }

    public DayOfWeek getNextDay() {
        int nextOrdinal = (this.ordinal() + 1) % values().length;
        return values()[nextOrdinal];
    }
}
