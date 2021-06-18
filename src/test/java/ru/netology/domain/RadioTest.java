package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio rad = new Radio();

    @Test
    public void nextRadioStation() {
        rad.setCurrentRadioStation(8);
        rad.nextRadioStation();
        assertEquals(9, rad.getCurrentRadioStation());
    }
    @Test
    public void afterMaxRadioStation() {
        rad.setCurrentRadioStation(10);
        rad.nextRadioStation();
        assertEquals(0, rad.getCurrentRadioStation());
    }
    @Test
    public void previousRadioStation() {
        rad.setCurrentRadioStation(2);
        rad.previousRadioStation();
        assertEquals(1, rad.getCurrentRadioStation());
    }
    @Test
    public void backMinRadioStation() {
        rad.setCurrentRadioStation(0);
        rad.previousRadioStation();
        assertEquals(10, rad.getCurrentRadioStation());
    }
    @Test
    public void moreMaxRadioStation() {
        rad.setCurrentRadioStation(11);
        rad.nextRadioStation();
        assertEquals(0, rad.getCurrentRadioStation());
    }
    @Test
    public void moreMinRadioStation() {
        rad.setCurrentRadioStation(-1);
        rad.previousRadioStation();
        assertEquals(10, rad.getCurrentRadioStation());
    }
    @Test
    public void previousVolume() {
        rad.setCurrentVolume(2);
        rad.previousVolume();
        assertEquals(1, rad.getCurrentVolume());
    }
    @Test
    public void backMinVolume() {
        rad.setCurrentVolume(0);
        rad.previousVolume();
        assertEquals(0, rad.getCurrentVolume());
    }
    @Test
    public void moreVolume() {
        rad.setCurrentVolume(99);
        rad.moreVolume();
        assertEquals(100, rad.getCurrentVolume());
    }
    @Test
    public void moreMaxVolume() {
        rad.setCurrentVolume(100);
        rad.moreVolume();
        assertEquals(100, rad.getCurrentVolume());
    }
    @Test
    public void nextMaxVolume() {
        rad.setCurrentVolume(101);
        rad.moreVolume();
        assertEquals(100, rad.getCurrentVolume());
    }
    @Test
    public void moreMinVolume() {
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
        Radio rad = new Radio(6,77);
        rad.moreVolume();
        assertEquals(78, rad.getCurrentVolume());
    }
    @Test
    public void backStationVolume() {
        Radio rad = new Radio(0,27);
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