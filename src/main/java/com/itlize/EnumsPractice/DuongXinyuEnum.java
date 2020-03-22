package com.itlize.EnumsPractice;

public enum DuongXinyuEnum {
    Duong,Xinyu;

    public String getCatchPhrase(){
        return "Hey, my name is "+this+"!";
    }
    public  boolean isDuong(){
        return this.toString().equals("Duong");
    }
    public  boolean isXinyu(){
        return this.toString().equals("Xinyu");
    }
}
