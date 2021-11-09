package com.company;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Character {

    private String name;

    private int ageInYears;

    private int[] coins;

    private static int walletCapacity = ThreadLocalRandom.current().nextInt(10);

    public Character(String name, int ageInYears, int[] coins) {
        this.name = name;
        this.ageInYears = ageInYears;
        this.coins = coins;
    }

    public static Character randomInstance(){
        String[] names = {"Алексей", "Иван", "Борис", "Федор"};
        int[] possibleCoins = {1, 2, 5, 10};
        return new Character(names[ThreadLocalRandom.current().nextInt(names.length)],
                ThreadLocalRandom.current().nextInt(100) + 1,
                IntStream.range(0, walletCapacity)
                        .peek(c -> c = possibleCoins[ThreadLocalRandom.current().nextInt(possibleCoins.length)])
                        .toArray());
    }

    public static int getWalletCapacity() {
        return walletCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    public int[] getCoins() {
        return coins;
    }

    public void setCoins(int[] coins) {
        this.coins = coins;
    }

}
