public class Elemen {
    public String nama;

    public Elemen(String nama) {
        /*
         * merupakan DOWNCASTING,karena constructor subclassnya
         * merujuk kepada class Elemen superclassnya
         */
        this.nama = nama;
    }

}

class Dosen extends Elemen {// merupakan polymorphism karena turunan dari class induk
    public int JAMSIBUK;
    private int jumlahHariKerja;

    public Dosen(String nama, int jumlahHariKerja) {
        super(nama);//super merupakan DOWNCASTING karena mewariskan dari parent (Elemen) ke child (Dosen)
        JAMSIBUK = jumlahHariKerja * 8;

    }

    public void output() {
        System.out.println(nama + " adalah seorang dosen dengan jam sibuk" + " " + JAMSIBUK);
    }

    public int getJamSibuk() {
        return JAMSIBUK;
    }
}

class Mahasiswa extends Elemen {// merupakan polymorphism karena turunan dari class induk
    private int SKS;
    public int JAMSIBUK;

    public Mahasiswa(String nama, int SKS) {
        super(nama);//super merupakan DOWNCASTING karena mewariskan dari parent (Elemen) ke child (mahasiswa)
        JAMSIBUK = SKS * 3;
    }

    public int getJamSibuk() {
        return JAMSIBUK;

    }

    public void output() {
        System.out.println(nama + " adalah seorang Mahasiswa dengan jam sibuk " + " " + JAMSIBUK);
    }

}

class Asdos extends Mahasiswa {// merupakan polymorphism karena turunan dari class induk
    private int jamNgasdos;

    public Asdos(String nama, int SKS, int jamNgasdos) {
        super(nama, SKS);//super merupakan DOWNCASTING karena mewariskan dari parent (Mahasiswa) ke child (Asdos)
        JAMSIBUK = JAMSIBUK + jamNgasdos;

    }

    public int getJamSibuk() {
        return JAMSIBUK;
    }

    public void output() {
        /*
         * merupakan UPCASTING,karena melakukan
         * perubahan isi method yang ada pada superclassnya
         */
        System.out.println(nama + " adalah seornagsdos dengan jam sibu " + " " + JAMSIBUK);
    }

}
