package id.main;

import id.bird.*;
import id.block.Block;
import id.pig.Armor_Pig;
import id.pig.Hat_Pig;

public class Main {

    public static void main(String[] args) {

        // instansiasi objek burung
        Red_Bird bird1 = new Red_Bird("Angry Bird", "Red", 1);
        Blue_Bird bird2 = new Blue_Bird("The Blues", "Blue", 2);
        Chuck_Bird bird3 = new Chuck_Bird("Chuck Bird", "Yellow", 2);
        Bomb_Bird bird4 = new Bomb_Bird("Bomb Bird", "Black", 3);
        Matilda_Bird bird5 = new Matilda_Bird("Matilda Bird", "White", 1);

        // instansiasi blcok atau struktur objek
        Block wood1 = new Block("Wood", 2, 1); // wood1 >> wood with size 1
        Block glass1 = new Block("Glass", 1, 1); // glass1 >> wood with size 1
        Block stone1 = new Block("Stone", 3, 1); // stone1 >> wood with size 1

        // instansiasi objek babi
        Hat_Pig hatPig = new Hat_Pig("Hat Pig");
        Armor_Pig armorPig = new Armor_Pig("Armor Pig");

        // menggunakan method objek bird untuk menyerang pig
        System.out.println("=========================== PLAYING ===========================");
        bird4.attack(hatPig);
        System.out.println("=========================== GAME END ==========================");

    }
}
