package com.Lz42;
/*
Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.

Создать массив объектов. Вывести:

a) список пациентов, имеющих данный диагноз;

b) список пациентов, номер медицинской карты которых находится в заданном интервале.
*/

class Patient {
    int id;
    String lname;
    String fname;
    String oname;
    String adress;
    String phone;
    int cnumber;
    String diagnos;

    void Patient(String plname,String pfname,String poname, String padress,
                 String pphone, int pcnumber, String pdiagnos){
     lname=plname;
     fname=pfname;
     oname=poname;
     adress=padress;
     phone=pphone;
     cnumber=pcnumber;
     diagnos=pdiagnos;
    }
    void Patient(String plname,String pfname,String poname, String padress,
                 String pphone){
        lname=plname;
        fname=pfname;
        oname=poname;
        adress=padress;
        phone=pphone;
        cnumber=0;
        diagnos="";
    }

    void displayInfo(){
        System.out.printf("Name: %s \tPhone: %d\n", fname, phone);
    }


}

//Patient[] PList;
//
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java!");
    }
}
