/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Akatsuki
 */

public class Latihan60Akatsuki {

    
    public static void main(String[] args) {
        KarakterUtama Zetsu = new KarakterUtama("Zetsu", "Anak dari Kaguya"
                "pengamat atau mata-mata ", "bisa menyatu dengan alam atau permukaan");
        Zetsu.tampilKarakterUtama();
        
        KarakterUtama itachi = new KarakterUtama("itachi", "Ahli Genjutsu", 
                "Ninja Konoha Tercerdas", "Pintar alam mengambil keputusan" " Sikapnya yang tidak pernah panik setiap menghadapi musuh-musuhnya");
                itachi.tampilKarakterUtama();
        
        KarakterUtama Pain = new KarakterUtama("Pain atau Nagato", "Tubuh seorang Ninja yang berasal dari Kusagakure", 
                "Dapat menyerap Chakra",);
                Pain.tampilKarakterUtama();
        
        KarakterUtama Obito = new KarakterUtama("Obito", "Mampu mengendalikan Bijuu", 
                "Memiliki Jutsu Kamui yang dapat pindah dimensi Waktu", "Mempunyai mata Rinnegan",);
                Obito.tampilKarakterUtama();

        KarakterPendukung Kakuzu = new KarakterPendukung("Kakuzu", "Ninja yang Hampir di Bilang Abadi", 
                "ahli dalam bertarung");
        Kakuzu.tampilKarakterPendukung();
        
        KarakterPendukung Kisame = new KarakterPendukung("Kisame", 
                "Sang Monster Tanpa Ekor", "Memiliki Teknik air atau Suiton");
        Kisame.tampilKarakterPendukung();
        
        KarakterPendukung Konan = new KarakterPendukung("Konan", "Memiliki Kemampuan kertasnya",
                "Pernah Mengalahkan Jinchuriki dari Ekor Lima",);
                Konan.tampilKarakterPendukung();
        
        KarakterPendukung Sasori = new KarakterPendukung("Sasori", 
                "Memilik Kugutsu racun-racun yang Berbahaya", "Mempunyai kelemahan terlihat jelas yaitu jantungnya sendiri.");
                Sasori.tampilKarakterPendukung();
        
        KarakterPendukung Deidara = new KarakterPendukung("Deidara", "Salah satu ninja pelarian Iwa",
                "Memiliki Kekuatan Tanah liat dengan ledakan yang besar");
                Deidara.tampilKarakterPendukung();
        
         KarakterPendukung Hidan = new KarakterPendukung("Hidan", "Memiliki kemampuan untuk abadi selama kepalanya tidak hancur",
                "Mempunyai Teknik agama Jashin");
        Hidan.tampilKarakterPendukung();
    }
    
}