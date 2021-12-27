package com.koreait.spring.basic;

public class LgTv extends Tv {

    public LgTv() {
        super(new AppleSpeaker());
        System.out.println(" -- LgTv Created -- ");
    }
}
