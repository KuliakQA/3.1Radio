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

        rad.setCurrentRadioStation(9);
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
        assertEquals(9, rad.getCurrentRadioStation());
    }
    @Test
    public void moreMaxRadioStation() {
        rad.setCurrentRadioStation(10);
        assertEquals(0, rad.getCurrentRadioStation());
    }
    @Test
    public void moreMinRadioStation() {
        rad.setCurrentRadioStation(-1);
        assertEquals(0, rad.getCurrentRadioStation());
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

        rad.setCurrentVolume(9);
        rad.moreVolume();
        assertEquals(10, rad.getCurrentVolume());
    }
    @Test
    public void moreMaxVolume() {

        rad.setCurrentVolume(10);
        rad.moreVolume();
        assertEquals(10, rad.getCurrentVolume());
    }
    @Test
    public void nextMaxVolume() {
        rad.setMoreMaxVolume(11);
        assertEquals(10, rad.getCurrentVolume());
    }
    @Test
    public void moreMinVolume() {
        rad.setCurrentVolume(-1);
        assertEquals(0, rad.getCurrentVolume());
    }


}































