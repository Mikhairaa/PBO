package id.ac.unand.fti.si.pbo;

public class App {
    
    public static void main(String[] args) {

        //membuat objek
        Member member1 = new MemberReguler();
        Member member2 = new MemberPlatinum();
        Member member3 = new MemberGold();
        Member member4 = new MemberSilver();
        
        //menghitung total bayar member
        Integer totalBayarReguler = member1.hitungTotalBayar(900000);
        Integer totalBayarSilver = member2.hitungTotalBayar(200000);
        Integer totalBayarGold = member3.hitungTotalBayar(5000000);
        Integer totalBayarPlatinum = member4.hitungTotalBayar(10000000);

        //menampilkan data member
        System.out.println("Total bayar member reguler: " + totalBayarReguler);
        System.out.println("Total bayar member Silver: " + totalBayarSilver);
        System.out.println("Total bayar member Gold: " + totalBayarGold);
        System.out.println("Total bayar member Platinum: " + totalBayarPlatinum);
    }
    
}
