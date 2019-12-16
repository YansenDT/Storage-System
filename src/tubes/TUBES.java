
package tubes;

import java.util.ArrayList;
import java.util.Scanner;

public class TUBES {
 
    int jumlahBarang;
    String namaBarang;
    ArrayList<Integer> databaseJumlah = new ArrayList<>();
    ArrayList<String> databaseNama = new ArrayList<>();
    
    
    public static void main(String[] args) {
       Barang barang = new Barang();
       ArrayList<ArrayList> semuaBarang = barang.getBarang();
       Scanner input = new Scanner (System.in);
       TUBES a = new TUBES();
       
        System.out.print("Silahkan Masukkan Password Anda: ");
        String pass = input.nextLine();
        
        if(pass.equals("12345")) {
            int inputMenu;
            do { //Password
                showMenu();
                System.out.println("Silahkan Masukkan pilihan anda:");
                inputMenu = input.nextInt();
                System.out.println("============================================");
                switch (inputMenu) {
                    case 1: //Input Barang
                        Scanner inputNama = new Scanner(System.in);
                        System.out.println("Input Nama Barang: ");
                        String Nama = inputNama.nextLine();
                        Scanner inputJumlah = new Scanner(System.in);
                        System.out.println("Input Jumlah Barang: ");
                        int Jumlah = inputJumlah.nextInt();
                        a.inputData(Nama,Jumlah);
                        System.out.println("Data  "+  Nama  + " Dengan Jumlah " +  Jumlah  + " Berhasil Ditambahkan");
                        break;
                    case 2: //Tampilkan Barang
                        System.out.println("Tampil Jumlah Barang");
                        a.tampilData();
                        break;
                    case 3: //Hapus Barang
                        a. tampilData();
                        System.out.print("Data yang ingin dihapus adalah data ke: ");
                        int index = input.nextInt();
                        a.hapusData(index);
                        System.out.println("Barang Sudah Berhasil Dihapus ");
                        break;
                    case 4: //Tarik Barang
                        System.out.print("Data yang ingin ditarik adalah: ");
                        String namaBarang = input.next();
                        System.out.print("Masukkan jumlah yang ingin di tarik: ");
                        int jumlahBarang = input.nextInt();
                        int indexJumlah = semuaBarang.get(0).indexOf(namaBarang);
                        String nilaiAwal = String.valueOf(semuaBarang.get(1).get(indexJumlah));
                        int pengurangan = Integer.valueOf(nilaiAwal) - jumlahBarang;
                        barang.updateBarang(namaBarang, namaBarang, pengurangan);
                        System.out.print("Data " + namaBarang + " Berhasil Di tarik dengan Sisa " + pengurangan + " Pcs ");
                        break;
                        //print sisanya
                    default:
                    System.out.println("Pilihan Tidak Ada");
                        break;
                }
            }while (inputMenu != 0);
        } else {
            System.out.println("Anda terblokir");
        }
       
    }
    public static void showMenu() {
        System.out.println("Selamat Datang di Sistem Informasi Input Data Barang \n" 
                + "1. Input Data Barang \n" 
                + "2. Tampil Data Barang \n" 
                + "3. Hapus Data Barang \n"
                + "4. Tarik Barang \n");
    }
    
    public void inputData(String Nama, int harga){
        databaseNama.add(Nama);
        databaseJumlah.add(harga);
    }
    
    public void tampilData(){
        if (databaseJumlah.size() < 1){
            System.out.println("Barang pada Input baru");
            System.out.println("Data Kosong \n");
        }else{
            for (int i = 0; i < databaseJumlah.size (); i++){
                System.out.println("Barang pada Input baru");
                System.out.println(databaseNama.get(i)+" Dengan Jumlah" + databaseJumlah.get(i) +" \n");
            }
        }
        Barang b = new Barang();
        System.out.println("Barang pada Storage: ");
        System.out.println(b.arrayBarang);
    }
    public void hapusData(int index){
        databaseJumlah.remove(index);
    }
        /*
        Nama.add("HDD");
        Nama.add("MOTHER BOARD");
        Nama.add("POWER SUPPLY");   //BENDA SAMPLE (IKUTI PY)
        Nama.add("TEMPER GEL");
        Nama.add("RAM");
        Nama.add("VGA");        
        databaseJumlahBarang.add(JumlahBarang); //HARGA BENDA DI ATAS
        */
    }
    /*
    public void tampilData(){
        if (JumlahBarang.size() < 1){
            System.out.println("Data Kosong \n");
        }else{
            for (int i = 0; i < databaseJumlahBarang.size (); i++){
                System.out.println("Data ke-" + i + ": " + databaseNama.get(i)+" Dengan Harga " + databaseJumlahBarang.get(i) +" \n");
            }
        }
    }
    public void hapusData(int index){
        databaseJumlahBarang.remove(index);
    }
    */


