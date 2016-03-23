class  Konversi{
    private final String[] angka = {"","0","1","2","3","4","5","6","7","8","9","10","11"};
    private String nilaiAngka;
    private final String[] huruf = {"","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh","Delapan","Sebilan","Sepuluh","Sebelas"};
    private String nilaiHuruf;
    public String getHasilAngka() {
        return nilaiAngka;
    }
    public String angka(int satuan){
		String hasil="";
		if(satuan<12)
			hasil=hasil+huruf[satuan];
		else if(satuan<20)
			hasil=hasil+angka(satuan-10)+" Belas";
		else if(satuan<100)
			hasil=hasil+angka(satuan/10)+" Puluh "+angka(satuan%10);
		else if(satuan<200)
			hasil=hasil+"Seratus "+angka(satuan-100);
		else if(satuan<1000)
			hasil=hasil+angka(satuan/100)+" Ratus "+angka(satuan%100);
		else if(satuan<2000)
			hasil=hasil+"Seribu "+angka(satuan-1000);
		else if(satuan<1000000)
			hasil=hasil+angka(satuan/1000)+" Ribu "+angka(satuan%1000);
		else if(satuan<1000000000)
			hasil=hasil+angka(satuan/1000000)+" Juta "+angka(satuan%1000000);
		else if(satuan>=1000000000)
			hasil="Angka terlalu besar, harus kurang dari 1 milyar!";
		return hasil;
}


    public String getHasilHuruf() {
        return nilaiHuruf;
    }
}