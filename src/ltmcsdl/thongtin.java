/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltmcsdl;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class thongtin {
    private String title;
    private double price;
    private int id;

    thongtin(int id, String title, Date price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public thongtin(){}

    public thongtin(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    @Override
    public String toString(){
        return "id: "+this.id+", title: "+this.title+", price:"+this.price;
    }
}
