package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1(){
        Character character = Character.randomInstance();
        try{
            int coin = character.getCoins()[Character.getWalletCapacity()];
        }
        catch (Exception e){
            System.out.println("В задании 1 обработалось исключение - " + e.getClass().getName());
        }
    }

    public static void task2(){
        try{
            FileReader fileReader = new FileReader("kakDela.txt");
        } catch (Exception e) {
            System.out.println("В задании 2 обработалось исключение - " + e.getClass().getName());
        }
    }

    public static void task3(){
        Thread thread = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (Exception e) {
                System.out.println("В задании 3 обработалось исключение - " + e.getClass().getName());
            }
        });
        thread.start();
        thread.interrupt();
    }
}
