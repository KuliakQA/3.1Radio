package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void allLessData() {
        Radio rad = new Radio(0, 15, 7, 0, 70, 49);
        rad.nextRadioStation();
        rad.moreVolume();
        assertEquals(8, rad.getCurrentRadioStation());
        assertEquals(50, rad.getCurrentVolume());
    }

    @Test
    public void curStation() {
        Radio rad = new Radio(47);
        assertEquals(47, rad.getMaxRadioStation());
    }

    @Test
    public void nextRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);
        rad.nextRadioStation();
        assertEquals(9, rad.getCurrentRadioStation());
    }

    @Test
    public void afterMaxRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);
        rad.nextRadioStation();
        assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void previousRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(2);
        rad.previousRadioStation();
        assertEquals(1, rad.getCurrentRadioStation());
    }

    @Test
    public void backMinRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.previousRadioStation();
        assertEquals(10, rad.getCurrentRadioStation());
    }

    @Test
    public void moreMaxRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(11);
        rad.nextRadioStation();
        assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void moreMinRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);
        rad.previousRadioStation();
        assertEquals(10, rad.getCurrentRadioStation());
    }

    @Test
    public void previousVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(2);
        rad.previousVolume();
        assertEquals(1, rad.getCurrentVolume());
    }

    @Test
    public void backMinVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.previousVolume();
        assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void moreVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(99);
        rad.moreVolume();
        assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void moreMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.moreVolume();
        assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void nextMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);
        rad.moreVolume();
        assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void moreMinVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        rad.previousVolume();
        assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void nextStationVolume() {
        Radio rad = new Radio(4, 48);
        rad.nextRadioStation();
        assertEquals(5, rad.getCurrentRadioStation());
    }

    @Test
    public void moreVolumeStation() {
        Radio rad = new Radio(6, 77);
        rad.moreVolume();
        assertEquals(78, rad.getCurrentVolume());
    }

    @Test
    public void backStationVolume() {
        Radio rad = new Radio(0, 27);
        rad.previousRadioStation();
        assertEquals(10, rad.getCurrentRadioStation());
    }

    @Test
    public void moreVolumeAndStation() {
        Radio rad = new Radio(10, 100);
        rad.nextRadioStation();
        rad.moreVolume();
        assertEquals(0, rad.getCurrentRadioStation());
        assertEquals(100, rad.getCurrentVolume());
    }
}