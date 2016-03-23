import java.util.Scanner;

public class PraktikumBab3 {
int satuan, hasilsatuan;
String bilangan, hasilbilangan;

public PraktikumBab3() {
}
public PraktikumBab3(String x) {
bilangan = x;
}
String[] bilangans = {"", "satu", "dua", "tiga", "empat", "lima", "enam","tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
String[] bilanganspuluhan = {"","sepuluh","dua puluh ","tiga puluh ","empat puluh ","lima puluh ","enam puluh ","tujuh puluh ","delapan puluh ","sembilan puluh "};
public PraktikumBab3(int y) {
satuan = y;
}
int[] satuans = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
public void overloadingMeth(String x) {
if (x.equalsIgnoreCase("seratus")) {
hasilsatuan = 100;
} else {
for (int a = 0; a < bilangans.length; a++) {
for (int b = 0; b < bilangans.length; b++) {
if (x.equalsIgnoreCase(bilangans[a])) {
hasilsatuan = a;
} else if (x.equalsIgnoreCase(bilangans[a] + " puluh")) {
hasilsatuan = a * 10;
} else if (x.equalsIgnoreCase(bilangans[a] + " belas")) {
hasilsatuan = a + 10;
} else if (x.equalsIgnoreCase(bilangans[a] + " puluh " + bilangans[b])) {
hasilsatuan = a * 10 + b;
}
}
}
}
System.out.println("Outpunya adalah "+hasilsatuan);
}

public void overloadingMeth(int y) {
int satuan, puluhan;
satuan = y % 10;
puluhan = (y % 100) / 10;
if (y == 100) { hasilbilangan = "seratus";
System.out.println("Nilainya adalah : seratus");
} else {
if (puluhan == 1) {
if (satuan == 1) {
System.out.println("Nilainya adalah : sebelas");
}
else{
System.out.println("Nilainya adalah : "+bilangans[satuan]+" belas");  
}   
}
else{
System.out.println("Nilainya adalah : "+bilangans[puluhan]+" puluh "+bilangans[satuan]);
}
}
}
public void setTeksBil(int a) {
overloadingMeth(a);
}
public void setTeksAng (String b){
overloadingMeth(b);
}
}

