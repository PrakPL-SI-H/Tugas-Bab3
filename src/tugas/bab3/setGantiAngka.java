package pratikum3;

public class setGantiAngka {

    public static void main(String[] args) {
        GantiAngka set = new GantiAngka();
        System.out.println("HasilKonversiAngkaKeHuruf : ");
        set.overloadingMeth(45);
        set.overloadingMeth(3);
        set.overloadingMeth(50);
        set.overloadingMeth(15);
        System.out.println("");
        System.out.println("HasilKonversiHurufKeAngka : ");
        set.overloadingMeth("nol");
        set.overloadingMeth("tujuh");
        set.overloadingMeth("seratus");
        set.overloadingMeth("tiga","puluh");;
        set.overloadingMeth("lima", "puluh", "tiga");
        set.overloadingMeth("lima", "belas");
    }

}
