package sample1;

import sample1.Animal;

class Cat extends Animal {

    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает");
    }

    @Override
    public void voice() {
        super.voice();
    }
}
