package com.koreait.spring.basic;

public class Speaker {
    private int volume;
    public final int MAX_VOLUME;

    public Speaker(int max_volume) {
        MAX_VOLUME = max_volume;
    }

    public void speakUp() { //volume 1올리시면 되는데 maxVolume값보다 커지면 안 된다.
        if(volume < MAX_VOLUME) {
            //volume++;
            //volume = volume + 1;
            volume += 1;
        }
    }

    public void speakDown() { //volume 1내리시면 되는데 0보다 작아지면 안 된다.
        if(volume > 0) {
            //volume--;
            //volume = volume - 1;
            volume -= 1;
        }
    }

    //volume getter 작성
    public int getVolume() {
        return volume;
    }

    //volume setter 작성
    /*
    public void setVolume(int volume) {
        this.volume = volume;
    }
    */
}
