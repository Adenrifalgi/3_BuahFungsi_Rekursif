kelas  publik CetakSegitiga {
    public  static  void  cetakSegitiga ( int  n ) {
        jika ( n > 0 ) {
            cetakSegitiga ( n - 1 );
            untuk ( int  i = 1 ; i <= n ; i ++) {
                Sistem . keluar . cetak ( i + " " );
            }
            Sistem . keluar . println ();
        }
    }

    public  static  void  main ( String [] args ) {
        int  tinggiSegitiga = 5 ;
        cetakSegitiga ( tinggiSegitiga );
    }
}

