//Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
//boolean isGood (T item);
//Создайте следующие детские классы:
//IsEven — ему дают целое число, он одобряет его, если оно чётное
//IsPositive — ему дают целое число, он одобряет его, если оно положительное
//BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
//BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет,
//что она начинается с того, что он запомнил

//Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и одобрятель IsGood.
//Функция возвращает новую коллекцию, куда входят только одобренные элементы из коллекции.

package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //IsEven — ему дают целое число, он одобряет его, если оно чётное
        IsEven num = new IsEven(22);
        System.out.printf("число %s - %s чётным\n", num.item, num.isGood(num) ? "является" : "не является");

        //IsPositive — ему дают целое число, он одобряет его, если оно положительное
        IsPositive num2 = new IsPositive(8);
        System.out.printf("число %s является %s\n", num2.item, num2.isGood(num2) ? "положительным" : "отрицательным");

        //BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
        BeginsWithA str = new BeginsWithA("Abra");
        System.out.printf("Строка %s %s с A\n", str.item, str.isGood(str) ? "начинается" : "не начинается");

        //BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет,
        // что она начинается с того, что он запомнил
        BeginsWith str2 = new BeginsWith("abcdE");
        System.out.printf("Строка %s %s\n", str2.item, str2.isGood(str2) ? "содержится" : "не содержится");
        List arr = filter(num, num2, str, str2);
        System.out.println(arr);


    }

    public static <T> List filter(IsEven num, IsPositive num2, BeginsWithA str, BeginsWith str2) {
        List arr = new ArrayList<>();
        if (num.isGood(num)) {
            arr.add(num.item);
        }
        if (num2.isGood(num2)) {
            arr.add(num2.item);
        }
        if (str.isGood(str)) {
            arr.add(str.item);
        }
        if (str2.isGood(str2.item)) {
            arr.add(str2.item);
        }
        return arr;
    }
}