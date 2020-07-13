package Utilities;

import Medziai.Berzas;
import Medziai.Lapuotis;
import Medziai.Medis;
import Medziai.Spygliuotis;

import java.util.ArrayList;

public class MedziuSarasai {
    public static void ivairusMiskas(ArrayList<?> medziai) {
        System.out.println("Ivairus miskas:");
        for (Object medis : medziai) {
            ((Medis)medis).turi();
        }
    }

    public static void spygliuociuMiskas(ArrayList<? super Spygliuotis> medziai) {
        System.out.println("Spygliuociu miskas");
        for (Object medis : medziai) {
            ((Medis) medis).turi();
        }
    }

    public static void berzuMiskas(ArrayList<Berzas> medziai) {
        System.out.println("Lapuociu miskas");
        for (Berzas medis : medziai) {
            medis.turi();
        }
    }
}
