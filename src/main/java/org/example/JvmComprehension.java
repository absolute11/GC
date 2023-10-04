package org.example;

public class JvmComprehension {

    public static void main(String[] args) {
        int i = 1;                      // создается переменная  i , что приводит в jvm в стеке создание фрейма для метода main
        Object o = new Object();        // Cоздается объект типа Object и в это время в куче выделяется память для него, а переменная o хранит ссылку
        Integer ii = 2;                 // Тоже создается объект со значением 2 а переменной присваивается ссылка, а класслоадер подгружает класс
        printAll(o, i, ii);             //вызывается метод и создается новый фрейм для этого метода, класслоадер подгружает класс jvmcjmprehension
        System.out.println("finished"); // вывод на консоль из фрейма printall
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // тут создается переменная которая хранит ссылку на объект , который хранится в heap
        System.out.println(o.toString() + i + ii);  // вызывается метод toString который хранится в куче на который ссылается o. Это происходит в фрейме printAll

    }
}