package com.company;

public class Main {

    public static void main(String[] args) {
        ComponentsFactory componentsFactory = ComponentsFactory.getInstance();
        com.company.MessageRenderer messageRenderer = componentsFactory.getMessageComponent();
        messageRenderer.render();

    }
}
