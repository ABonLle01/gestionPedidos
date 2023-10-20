package org.example;

import org.example.ui.Login;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cargando ventana de inicio");
        (new Login()).load();
    }
}