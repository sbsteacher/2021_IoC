package com.koreait.spring.basic;

public class SamsungTv extends Tv {
    public SamsungTv() {
        super(new AppleSpeaker()); //HamanSpeaker로 바꾸고 싶다면 소스 수정을 해야 한다.
        System.out.println(" -- SamsungTv Created -- ");

    }
}
