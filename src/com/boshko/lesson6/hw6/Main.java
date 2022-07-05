package com.boshko.lesson6.hw6;

import com.boshko.lesson6.hw6.task1.*;
import com.boshko.lesson6.hw6.task2.*;
import com.boshko.lesson6.hw6.task3.Truck;
import com.boshko.lesson6.hw6.task4.B;
import com.boshko.lesson6.hw6.task5.Person;
import com.boshko.lesson6.hw6.task5.User;

public class Main {
    public static void main(String[] args) {
        //1. ---------------------------------------

        Human client = new Client("Bob", "Smith", "UBS");
        Human manager = new Manager("Mike", "Montano", "UBS");
        System.out.println(client.getInfo());
        System.out.println(manager.getInfo());

        //2. ---------------------------------------
        UBSBank clientImpl = new ClientImpl("Bob", "Smith");
        UBSBank managerImpl = new ManagerImpl("Mike", "Montano");
        System.out.println(clientImpl.getInfo());
        System.out.println(managerImpl.getInfo());

        //3.-----------------------------------------

        Truck truck = new Truck(12000,"Scania",'r',100f,6,16000);
        truck.outPut();
        truck.newWheels(8);
        truck.outPut();

        //4.-------------------------------------------

        B objectB = new B();
        System.out.println(objectB.getField());

        //5.-------------------------------------------

        Person person = new Person();
        person.getInfo();
        User user = new User();
        user.getInfo();
    }
}
