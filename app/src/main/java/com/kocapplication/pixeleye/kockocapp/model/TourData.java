package com.kocapplication.pixeleye.kockocapp.model;

/**
 * Created by Hyeongpil on 2016-09-29.
 */
public class TourData {
    private String title; //이름
    private String addr; // 주소
    private String detailAddr; // 상세 주소
    private String img; // 원본 대표 이미지
    private String thumbImg; //썸네일 이미지
    private String longitude; // 경도
    private String latitude; //위도

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getDetailAddr() {
        return detailAddr;
    }

    public void setDetailAddr(String detailAddr) {
        this.detailAddr = detailAddr;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getThumbImg() {
        return thumbImg;
    }

    public void setThumbImg(String thumbImg) {
        this.thumbImg = thumbImg;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
