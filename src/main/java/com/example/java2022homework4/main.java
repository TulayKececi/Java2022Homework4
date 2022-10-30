package com.example.java2022homework4;

import com.example.java2022homework4.Abstract.WomanGameCalculate;
import com.example.java2022homework4.Inheritance.*;
import com.example.java2022homework4.Interfaces.ICustomerDal;
import com.example.java2022homework4.Interfaces.OracleCustomerDal;
import com.example.java2022homework4.Polimorfizm.BaseLogger;
import com.example.java2022homework4.Polimorfizm.EmailLogger;
import com.example.java2022homework4.StaticDemo.DatabaseHelper;
import com.example.java2022homework4.StaticDemo.ProductManager;

public class main {
    public static void main(String[] args){
        Product product= new Product(1);
        product.id=1;

        Customer customer=new Customer();
        Employee employee=new Employee();

        OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
        ogretmenKrediManager.Hesapla();

        KrediUI krediUI=new KrediUI();
        krediUI.KrediHesapla(ogretmenKrediManager);

        EmailLogger logger=new EmailLogger();
        logger.Log("Log mesajı");

        BaseLogger baseLogger=new BaseLogger();


        WomanGameCalculate womanGameCalculate=new WomanGameCalculate();

        ICustomerDal customerDal=new OracleCustomerDal();

        ProductManager manager=new ProductManager();


        DatabaseHelper.Crud.delete();


    }

}
