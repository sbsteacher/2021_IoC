package com.koreait.spring.basic;

public class LgTv {
    private HamanSpeaker speaker; //결국 소스를 수정을 해야 한다.

    public LgTv() {
        System.out.println(" -- LgTv Created -- ");
        speaker = new HamanSpeaker();
    }

    public void volumeUp() {
        //소리크기 : ?
        speaker.speakUp();
        System.out.printf("소리크기 : %d\n", speaker.getVolume());
    }

    public void volumeDown() {
        speaker.speakDown();
        System.out.printf("소리크기 : %d\n", speaker.getVolume());
    }
}
