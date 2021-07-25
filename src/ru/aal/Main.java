package ru.aal;

public class Main {

    public static void main(String[] args) {
        Sender sender = new Sender();

        System.out.println("Mode 1:");
        sender.send(1);

        System.out.println("\n---------------------------------");
        System.out.println("Mode 2:");
        sender.send(2);

        System.out.println("\n---------------------------------");
        System.out.println("Mode 3:");
        sender.send(3);

    }
}
