package com.zeljkobilbija001.swissroadinfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Spisak autoputeva po zemljama (DE, FR, IT – JSON-i iz AutobahnInfo, AutoroutesInfo i AutostradeInfo; NL, BE, LU). Novi autoput: dodaj JSON u assets/autoputevi
 * (node alati/benelux_skripta.js NL-A2) i upiši ime datoteke umesto null ("autoputevi/nl-a2.json").
 * Za Belgiju se u nazivu rute navodi i evropska oznaka (E40), jer je na tablama češća od A-broja.
 */
public final class Autoputevi {

    private Autoputevi() { }

    public static final List<Autoput> SVE = Arrays.asList(
            new Autoput("CH", "A1", "Genève – Lausanne – Bern – Zürich – St. Gallen", "autoputevi/ch-a1.json"),
            new Autoput("CH", "A2", "Basel – Luzern – Gotthard – Chiasso", "autoputevi/ch-a2.json"),
            new Autoput("CH", "A3", "Basel – Zürich – Sargans", "autoputevi/ch-a3.json"),
            new Autoput("CH", "A4", "Schaffhausen – Winterthur – Zug – Brunnen", "autoputevi/ch-a4.json"),
            new Autoput("CH", "A5", "Yverdon – Neuchâtel – Biel – Solothurn", "autoputevi/ch-a5.json"),
            new Autoput("CH", "A6", "Biel – Bern – Thun – Spiez", "autoputevi/ch-a6.json"),
            new Autoput("CH", "A7", "Winterthur – Frauenfeld – Kreuzlingen", "autoputevi/ch-a7.json"),
            new Autoput("CH", "A9", "Lausanne – Montreux – Sion – Brig", "autoputevi/ch-a9.json"),
            new Autoput("CH", "A12", "Vevey – Fribourg – Bern", "autoputevi/ch-a12.json"),
            new Autoput("CH", "A13", "St. Margrethen – Chur – San Bernardino – Bellinzona", "autoputevi/ch-a13.json"),
            new Autoput("CH", "A14", "Luzern – Zug", "autoputevi/ch-a14.json"),
            new Autoput("CH", "A15", "Zürich – Uster – Rapperswil", "autoputevi/ch-a15.json"),
            new Autoput("CH", "A16", "Transjurane: Boncourt – Delémont – Biel", "autoputevi/ch-a16.json"),
            new Autoput("CH", "A18", "Basel – Aesch", "autoputevi/ch-a18.json"),
            new Autoput("CH", "A20", "Neuchâtel – La Chaux-de-Fonds", "autoputevi/ch-a20.json"),
            new Autoput("CH", "A22", "Liestal – Pratteln", "autoputevi/ch-a22.json"),
            new Autoput("CH", "A51", "Zürich-Kloten – Bülach", "autoputevi/ch-a51.json")
    );

    /** Redosled zemalja na početnom ekranu. */
    public static final String[] ZEMLJE = {"CH"};

    /** Autoputevi jedne zemlje ("NL", "BE" ili "LU"), redom kao u spisku. */
    public static List<Autoput> zaZemlju(String zemlja) {
        List<Autoput> l = new ArrayList<>();
        for (Autoput a : SVE) if (a.zemlja.equals(zemlja)) l.add(a);
        return l;
    }

    public static Autoput poId(String id) {
        for (Autoput a : SVE) if (a.id.equals(id)) return a;
        return null;
    }
}
