package com.company;

import java.io.FileReader;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
            FileReader fileReader = new FileReader("character'sDairy.txt");
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
        thread.setName("Don't wake up. I sleep");
        thread.start();
        thread.interrupt();
    }

    public static void task4(){
        Arrays.stream(Character.randomInstance().getCoins())
                .limit(0)
                .findAny()
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println(
                                "В задании 4 обработалось исключение - " + NullPointerException.class.getName()));
    }

    public static void task5(){
        try{
            Character.randomInstance().getName().charAt(-1);
        }
        catch(Exception e) {
            System.out.println("В задании 5 обработалось исключение - " + e.getClass().getName());
        }
    }
}
