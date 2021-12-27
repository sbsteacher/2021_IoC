package com.koreait.spring.basic;

public class TvTest {
    public static void main(String[] args) {

        /*
        소스를 구조적으로 많이 바꿨음에도 불구하고, 여전히
        Tv의 Speaker를 바꿀려면 소스 수정이 불가피한 상태다.
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
