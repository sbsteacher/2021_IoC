package com.koreait.spring.basic;

public class TvTest {
    public static void main(String[] args) {

        /*
        소스의 수정 없이!!!!
        main메소드의 파라미터인 args를 사용하여 아래 Tv변수에
        담기는 객체를 변경을 할 수 있다.

        IoC, DI 를 이해하기 위한 프로젝트를 해봤다.

        소스 외부에서 값을 가져오는 방법 3가지
        - args 이용
        - Scanner 이용
        - File 이용 (Spring은 파일을 이용)
         */

        System.out.println("len : " + args.length);
        for(int i=0; i<args.length; i++) {
            System.out.println(args[i]);
        }
        String speakerCompany = args[0];
        String tvCompany = args[1];

        Factory factory = new Factory();
        Speaker speaker = factory.getSpeaker(speakerCompany);

        Tv tv = factory.getTv(tvCompany, speaker);

    }
}
