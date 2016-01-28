package visaocanhamkhoitaokothamso;

import java.util.Calendar;

public class Student2 extends Person {

    private String lop;
    public Student2(){}//fai co de ben ham main() new Student2(ko can tham so j)
    public Student2(String na, String co) {// o co gia tri. loi ngay
        super(na, co);
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public void InAn() {//public void In()  cung chay dung  
        super.InAn();
        System.out.print("Lop: " + lop);
    }
}
