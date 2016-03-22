package pratikum3;

public class Apotek {
        private String nama, alamat;
        private static int total;
        private static int a, b, c, d, e;

        public Apotek() {
            nama = "";
            alamat = "";
        }

        public Apotek(String a, String b) {
            nama = a;
            alamat = b;
        }

        public static void setHarga(int a1, int b1, int c1, int d1, int e1) {
            a = a1;
            b = b1;
            c = c1;
            d = d1;
            e = e1;
        }

        public static void getDaftarObat() {
            System.out.println("==========DaftarObat===========");
            System.out.println("1. ObatSakitKepala   : " + a);
            System.out.println("2. ObatSakitPerut    : " + b);
            System.out.println("3. Paracetamol         : " + c);
            System.out.println("4. Obat Influenza      : " + d);
            System.out.println("5. ObatMagh           : " + e);
        }

        public void pilihObat(int pilih) {
            int harga;
            switch (pilih) {
                case 1:
                    harga = a;
                    break;
                case 2:
                    harga = b;
                    break;
                case 3:
                    harga = c;
                    break;
                case 4:
                    harga = d;
                    break;
                case 5:
                    harga = e;
                    break;
                default:
                    harga = 0;
                    break;
            }
            Total(harga);
        }

        private void Total(int harga) {
            total = total + harga;
        }

        public void getTotal() {
            System.out.println("===========TOTAL BIAYA===========");
            System.out.println("Nama   : " + nama);
            System.out.println("Alamat : " + alamat);
            System.out.println("Total biayaobat yang harus anda bayar sebesar Rp. " + total +",00");
        }

    }
