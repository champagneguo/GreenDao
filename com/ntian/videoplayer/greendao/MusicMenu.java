package com.ntian.videoplayer.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table MUSIC_MENU.
 */
public class MusicMenu {

    private Long id;
    private String Name;
    private java.util.Date AddTime;

    public MusicMenu() {
    }

    public MusicMenu(Long id) {
        this.id = id;
    }

    public MusicMenu(Long id, String Name, java.util.Date AddTime) {
        this.id = id;
        this.Name = Name;
        this.AddTime = AddTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public java.util.Date getAddTime() {
        return AddTime;
    }

    public void setAddTime(java.util.Date AddTime) {
        this.AddTime = AddTime;
    }

}