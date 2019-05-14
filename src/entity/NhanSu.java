/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author TUAN
 */
public class NhanSu {

    private String maNV;
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private String sDT;
    private boolean gioiTinh;
    private String maCV;
    private String maTDHV;
    private String maPB;

    public NhanSu() {
    }
    int hjash = 219;

    public NhanSu(String maNV, String hoTen, String ngaySinh, String diaChi, String sDT, boolean gioiTinh, String maCV, String maTDHV, String maPB) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.sDT = sDT;
        this.gioiTinh = gioiTinh;
        this.maCV = maCV;
        this.maTDHV = maTDHV;
        this.maPB = maPB;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }

    public String getMaTDHV() {
        return maTDHV;
    }

    public void setMaTDHV(String maTDHV) {
        this.maTDHV = maTDHV;
    }

    public String getMaPB() {
        return maPB;
    }

    public void setMaPB(String maPB) {
        this.maPB = maPB;
    }

}
