package visaocanhamkhoitaokothamso;

import java.util.Calendar;

public class Person {

    public String name,lop1;
    public String masv;
    public int code;

    public Person() {
    }

    public Person(String na, String co) {
        this.name = na;
        this.lop1 = co;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int Tinhtuoi() {
        Calendar a = Calendar.getInstance();
        code = a.get(Calendar.YEAR) - this.getCode();
        return code;
    }
public void InAn(){
    System.out.print("Ten la: "+this.getName()+ "\t");
}
}
