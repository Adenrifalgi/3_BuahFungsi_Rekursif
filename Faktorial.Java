Faktorial kelas  publik {
    public  static  int  faktorial ( int  n ) {
        jika ( n == 0 ) {
            kembali  1 ;
        } lain {
            return  n * faktorial ( n - 1 );
        }
    }

    public  static  void  main ( String [] args ) {
        int  angka = 5 ;
        int  hasil = faktorial ( angka );
        Sistem . keluar . println ( "Faktorial dari " + angka + " adalah " + hasil );
    }
}
