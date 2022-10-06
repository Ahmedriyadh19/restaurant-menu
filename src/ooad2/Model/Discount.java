/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooad2.Model;

/**
 *
 * @author alahm
 */
public class Discount {

    private String coupon;
    private int dis;
    private String error = "";

    public Discount(String coupon) {
        if (coupon.equals("10%")) {
            dis = 10;
            error = "ok";
        } else if (coupon.equals("20%")) {
            dis = 20;
            error = "ok";
        } else {
            error = "Invalid coupon";
        }
        this.coupon = coupon;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public int getPriceAfterDiscount() {
        return dis;
    }

    public double getPriceAfterDiscount(double orginalPrice) {
        return orginalPrice / 100 * dis;
    }

    public String getError() {
        return error;
    }

}
