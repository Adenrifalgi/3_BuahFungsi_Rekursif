Fibonacci kelas  publik {
     fibonacci int statis  publik ( int n ) {  
        jika ( n <= 1 ) {
            kembali  n ;
        } lain {
            kembalikan  fibonacci ( n - 1 ) + fibonacci ( n - 2 );
        }
    }

    public  static  void  main ( String [] args ) {
        int  angka = 7 ;
        int  hasil = fibonacci ( angka );
        Sistem . keluar . println ( "Angka Fibonacci ke-" + angka + " adalah " + hasil );
    }
}
