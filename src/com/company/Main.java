package com.company;

import java.io.*;
import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        /*System.out.println("Hello World");
        System.out.print("Hello World");
        System.out.println("Hello World");
        //String s;
        //int i;
        String s = "Elly";*/
        int integerValua = 5;
        short shortValue = 45;
        long longValue = 99999999999999L;
        byte byteValue = 127;
        float floatValua = 1.01f;
        char charValua = 'a';
        boolean booleanValue = true;
        double doubleValue = 2.02;
        System.out.println(shortValue);
        System.out.println("Integer Value is" + integerValua);
        System.out.println(longValue);
        System.out.println(doubleValue);
        System.out.println(byteValue);
        System.out.println(floatValua);
        int integerNewValua = shortValue % integerValua;
        System.out.println("остаток от деления" + integerNewValua);
        String string = "Мама";

       /* int a = 6;
        int b = 7;
        int c = a + b;
        System.out.println(c);
        int a = 2;
        int b = 4;
        a = a + b;
        b = b +1;
        System.out.println(a);*/
        String a = "Мама";
        String b = "Мыла";
        String c = (a + b + "Раму");
        System.out.println(c);
        String s1 = "Мой любимый фильм";
        String s2 = " Трасса";
        int roadNamber = 60;
        String text = s1 + " " + s2 + " " + roadNamber;
        System.out.println(text);
        System.out.println("Ты должен сделать это!");
        String q = "Ты должен сделать это!";
        System.out.println(q);
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Введите имя :");
        String name = bufferedReader.readLine(); // Читаем строку с клавиатуры
        System.out.print("Введите возраст :");
        String sAge = bufferedReader.readLine();// Читаем строку с клавиатуры
        int nAge = Integer.parseInt(sAge);// Преобразуем строку в число*/

        System.out.println("Ваш возраст : " + nAge + ", Вас зовут:" + name);
        System.out.println("nAge = " + nAge);

        {
        }
    }
}
