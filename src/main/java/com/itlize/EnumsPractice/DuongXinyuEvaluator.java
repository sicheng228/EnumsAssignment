package com.itlize.EnumsPractice;

public class DuongXinyuEvaluator {

    String s;
    DuongXinyuEvaluator(String s){
        this.s=s;
    }

    public  boolean isDuong(){
        return s.equals("Duong");
    }
    public  boolean isXinyu(){
            return s.equals("Xinyu");
        }

}
