package prakproglan;
public class BilanganTeks {

    private final String angka[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    private final String teks[] = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas" };
    private static String angbil;
       
    public String overloadingMeth(int t){
        angbil="";
        if(t<12){
            angbil+=teks[t];
        }else if(t>11 && t<20){
            angbil+=teks[t-10]+" belas";
        }else if(t<99){
            angbil+=(teks[t/10]+" puluh "+teks[t%10]);
        }else if(t>=100){
            angbil="seratus";
        }else if(t>100){
            System.out.println("Nilai tidak ditemukan"); }
        return angbil;
    }
}
