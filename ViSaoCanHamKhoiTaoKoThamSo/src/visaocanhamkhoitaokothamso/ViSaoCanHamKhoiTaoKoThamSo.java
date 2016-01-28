
package visaocanhamkhoitaokothamso;

import java.util.Scanner;

public class ViSaoCanHamKhoiTaoKoThamSo {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        String ten, lop;
// Student2 st = new Student2(ten,lop);//LOI NGAY vi bien can kieu,diachi,g.tri
        Student2 st = new Student2();
        System.out.println("Nhap SV:");
        ten = scn.nextLine();
        st.setName(ten);
        System.out.println("Nhap Lop:");
        lop = scn.nextLine();
        st.setLop(lop);
        st.InAn();
        scn.close();
    }
    
}
