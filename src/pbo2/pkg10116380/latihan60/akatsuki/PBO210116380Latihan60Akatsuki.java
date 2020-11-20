/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan60.akatsuki;

/**
 * Nama : Zain Achmad Rizqullah 
 * Nim : 10116380
 * Kelas : PBO2 
 * Deskripsi Program : Program ini berisi tentang karakter di akatsuki di naruto
 */
public class PBO210116380Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String pakaian = "Pakaian hitam beserta corak awan merah";
        String tujuan = "Menangkap Semua Jinchuriki";
        
        Anggota itachi = new Anggota("Itachi Uchiha", "Konohagakure", "Kunai", 
                        "Anbu Captain Missing Ninja", "Mangekyo Sharingan", 
                        "Kehabisan Chakra" ,"Suzaku(Merah darah)" , 
                        true, pakaian, tujuan);
        Anggota kisame = new Anggota("Kisame Hoshigaki", "Kirigakure", "Samehada", 
                        "S-Rank Missing Ninja", "Shark-o-mation", "Bunuh Diri",
                        " Nanju(Bintang Selatan)",  true, pakaian, tujuan); 
        Anggota deidara = new Anggota("Deidara", "Iwagakure", "Explosive Clay", 
                        "S-Rank Missing Ninja", "Explosive Release","Dibunuh oleh Sasuke Uchiha" , 
                        "Seiryū(Naga Biru/Hijau) ", true, pakaian, tujuan);
        Anggota sasori = new Anggota("Sasori", "Sunagakure", "Hiruko", 
                        "S-Rank Missing Ninja from Sunagakure's Puppet Brigade",
                        "Puppet Mastery","Dibunuh oleh Sakura Haruno","Gyokunyo(Virgo)",
                        true, pakaian, tujuan);
        Anggota kakuzu = new Anggota("Kakuzu", "Takigakure", "Benang hitam pada dalam tubuhnya",
                        "Zonbi Konbi", "Dapat menggunakan ke lima elemen", 
                        "Dibunuh oleh Naruto Uzumaki dengan bantuan Team 10 dan Kakashi Hatake ",
                        "Hokuto(Bintang Utara)", true, pakaian, tujuan);
        Anggota hidan = new Anggota("Hidan", "Yugakure", "Sabit besar bermata tiga",
                        "Zonbi Konbi", "Immortality ","Tidak diketahui atau disegel Shikamaru" ,
                        "Santai(Tiga Tingkatan)", true, pakaian, tujuan);
        Anggota orochimaru = new Anggota("Orochimaru", "Konohagakure", "Ular",
                        "Legendary Sannin", "Kekuatan Ular Putih","Dibunuh dan dihidupkan oleh Sasuke Uchiha", 
                        "Sora(Langit)", false, pakaian, tujuan);
         
        System.out.println("Profile Akatsuki");
        System.out.println("===============================");
        System.out.println();
        System.out.println("Identitas : " + itachi.getpakaian());
        System.out.println("Tujuan : " + itachi.gettujuan());
        System.out.println();

        itachi.displayAnggota();
        kisame.displayAnggota();
        deidara.displayAnggota();
        sasori.displayAnggota();
        kakuzu.displayAnggota();
        hidan.displayAnggota();
        orochimaru.displayAnggota();
       
    
        
    }
    
}
