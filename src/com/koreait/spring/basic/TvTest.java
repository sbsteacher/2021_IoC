package com.koreait.spring.basic;

public class TvTest {
    public static void main(String[] args) {

        /*
        현재 LgTv는 AppleSpeaker를 사용하고 있다.
        그런데 HamanSpekaer로 바꾸고 싶다면
        결국 소스를 수정을 해야 한다.
         */
        LgTv lgTv = new LgTv();
        SamsungTv samsungTv = new SamsungTv();

        /*
        // volumeUp, volumeDown 잘 제작을 하였는지 단위 테스트용
        for(int i=0; i<50; i++) {
            lgTv.volumeUp();
        }
        System.out.println("--------------------");
        for(int i=0; i<50; i++) {
            lgTv.volumeDown();
        }
        */
    }
}
