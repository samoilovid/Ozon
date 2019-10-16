package ru.itpark;

public class Main {
    public static void main(String[] args) {
        Pen penOne = new Pen(
                159914845,
                "Xiaomi",
                "https://cdn1.ozone.ru/multimedia/c250/1025192791.jpg",
                "Шариковая",
                999,
                61,
                388,
                0

        );    Pen penTwo = new Pen(
                139574473,
                "Action",
                "https://cdn1.ozone.ru/multimedia/c250/1017328084.jpg",
                "Шариковая",
                187,
                42,
                108,
                1

        );    Pen penTree = new Pen(
                146093392,
                "Affache",
                "https://cdn1.ozone.ru/multimedia/c1200/1023484393.jpg",
                "Ручка-линер",
                329,
                0,
                329,
                2

        );
        CartService cart = new CartService();
        cart.add(penOne);
        cart.add(penTwo);
        cart.add(penTree);
        cart.remove(penTree);
        System.out.println(cart);
    }

}
