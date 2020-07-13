package com.company;

import Medziai.*;
import Utilities.MedziuSarasai;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Berzas berzas = new Berzas();
        Azuolas azuolas = new Azuolas();
        Kadagys kadagys = new Kadagys();
        Egle egle = new Egle();
        Pusis pusis = new Pusis();

        ArrayList<Medis> ivairusMiskas = new ArrayList<>(Arrays.asList(
                azuolas, berzas, kadagys, egle, pusis));
        ArrayList<Spygliuotis> spygliuociuMiskas = new ArrayList<>(Arrays.asList(kadagys, egle, pusis));
        ArrayList<Berzas> berzuMiskas = new ArrayList<>(Arrays.asList(berzas));

        MedziuSarasai.ivairusMiskas(ivairusMiskas);
        System.out.println();
        MedziuSarasai.spygliuociuMiskas(spygliuociuMiskas);
        System.out.println();
        MedziuSarasai.berzuMiskas(berzuMiskas);
    }
}
