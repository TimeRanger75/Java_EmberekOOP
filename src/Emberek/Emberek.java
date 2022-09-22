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
}
