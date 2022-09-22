package Emberek;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Emberek {
    private List<Ember> emberek;

    public Emberek(Ember[] emberTomb) {
        emberek=new ArrayList<>();
        this.emberek.addAll(Arrays.asList((emberTomb)));
    }

    @Override
    public String toString() {
        StringBuilder s= new StringBuilder(String.format("%30s  %10s %-20s", "Név", "Szül.dátum", "Szül.hely"));
        for (int i = 0; i < this.emberek.size(); i++) {
            s.append(System.lineSeparator()).append(this.emberek.get(i));
        }
        return s.toString();
    }
}
