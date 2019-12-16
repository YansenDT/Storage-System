/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.util.ArrayList;

public class Barang {
    ArrayList<ArrayList> arrayBarang = new ArrayList<>(2);
    
    boolean firstSubmit = true;
    
    public Barang() {
        for(int i = 0; i < 2; i++) {
            arrayBarang.add(new ArrayList());
        }
        
        if(firstSubmit) {
            arrayBarang.get(0).add("RAM4GBDDR3");
            arrayBarang.get(1).add(1000);
            arrayBarang.get(0).add("RAM8GBDDR3");
            arrayBarang.get(1).add(500);
            arrayBarang.get(0).add("RAM4GBDDR4");
            arrayBarang.get(1).add(500);
            arrayBarang.get(0).add("RAM8GBDDR4");
            arrayBarang.get(1).add(500);
            arrayBarang.get(0).add("HDD1Terabyte");
            arrayBarang.get(1).add(800);
            arrayBarang.get(0).add("SSD1Gigabyte");
            arrayBarang.get(1).add(700);
            arrayBarang.get(0).add("MOTHER BOARD");
            arrayBarang.get(1).add(300);
            arrayBarang.get(0).add("POWER SUPPLY");
            arrayBarang.get(1).add(900);
            arrayBarang.get(0).add("TEMPER GEL");
            arrayBarang.get(1).add(1200);
            arrayBarang.get(0).add("VGA");
            arrayBarang.get(1).add(300);
            firstSubmit = false;
        }
    }
    
    public ArrayList<ArrayList> getBarang() {
        return arrayBarang;
    }
    
    public void insertBarang(int jumlah, String namaBarang) {
        arrayBarang.get(0).add(namaBarang);
        arrayBarang.get(1).add(jumlah);
    }
    
    public void updateBarang(String namaLama, String namaBaru, int jumlah) {
        arrayBarang.get(0).set(arrayBarang.get(0).indexOf(namaLama), namaBaru);
        arrayBarang.get(1).set(arrayBarang.get(0).indexOf(namaLama), jumlah);
    }
    
    public void deleteBarang(int index) {
        arrayBarang.remove(index);
    }
}
