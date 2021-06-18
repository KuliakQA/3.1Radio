package ru.netology.domain;

public class Radio {
    private final int minRadioStation = 0;
    private final int maxRadioStation = 10;
    private int currentRadioStation;
    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int currentVolume;

    public Radio(int currentRadioStation, int currentVolume) {
        this.currentRadioStation = currentRadioStation;
        this.currentVolume = currentVolume;
    }
    public Radio() {
    }

    /*public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
        }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }
*/
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            currentRadioStation = maxRadioStation;
        }
        if (currentRadioStation < minRadioStation) {
            currentRadioStation = minRadioStation;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {
        if(currentRadioStation >= maxRadioStation){
            currentRadioStation = minRadioStation;
            return;
        }
        currentRadioStation ++;
    }


    public void previousRadioStation() {
        if (currentRadioStation <= minRadioStation) {
            currentRadioStation = maxRadioStation;
            return;
        }
        currentRadioStation = currentRadioStation - 1;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void previousVolume() {
        if (currentVolume <= minVolume) {
            return;
        }
        currentVolume = currentVolume - 1;
    }

    public void moreVolume() {
        if (currentVolume >= maxVolume) {
            return;
        }
        currentVolume++;
    }
}


