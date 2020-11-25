class kotak {
        double panjang;
        double sisi;
        double luas;

        void cetakPrint(){
            System.out.println("Aku fungsi");
        }
        
        // double luas(){
        //     luas = panjang+sisi;
        //     return luas;
        // }
}

class segitiga{
    double tinggi;
    double alas;
    double luas;
}

class test{
    public static void main(String[] args) {
        kotak k = new kotak();
        kotak k2 = new kotak();
        segitiga s = new segitiga();
        s.alas = 10;
        s.tinggi = 10;

        k.panjang = 10;
        k.sisi = 20;
        k2.panjang = 30;
        k2.sisi = 15;
        k.cetakPrint();

        // double luas;
        k.luas = k.panjang+k.sisi;
        k2.luas = k2.panjang+k2.sisi;
        s.luas = 0.5*s.alas*s.tinggi;


        System.out.println("Luas kotak = "+k.luas);
        System.out.println("Luas kotak2 = "+k2.luas);
        System.out.println("Luas segitiga = "+s.luas);


        
    }

}