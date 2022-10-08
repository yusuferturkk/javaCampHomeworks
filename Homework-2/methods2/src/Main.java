public class Main {
    public static void main(String[] args) {
        int sayi = topla(5,7);
        int toplam = topla2(2,5,6,7,8);
        System.out.println(sayi);
        System.out.println(toplam);
    }

    public static void ekle(){
        System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Silindi");
    }

    public static void guncelle(){
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar){
        int toplam = 0;
        for (int sayi: sayilar){
            toplam += sayi;
        }

        return toplam;
    }
}