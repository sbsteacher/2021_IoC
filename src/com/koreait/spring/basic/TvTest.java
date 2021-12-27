package com.koreait.spring.basic;

public class TvTest {
    public static void main(String[] args) {

        /*
        Speaker클래스를 추가하고 AppleSpeaker, HamanSpeaker를 상속으로
        구조화하면 LgTv와 SamsungTv에서 스피커를 교체할 때 타입은 변경할 필요없고
        클래스명만 바꿔주면 되기 때문에 수정을 한군대만 하면 된다.
        그래서 소스가 좀 더 발전되었다.
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
