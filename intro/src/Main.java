public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //değişken isimlendirme java'da camelCase yazılır.
        String ortaMetin = "İlginizi çekebilir.";
        String altMetin = "Vade Süresi";

        System.out.println(ortaMetin);

        int vade = 32;

        double dolarDun = 18.14;
        double dolarBugun = 18.10;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if(dolarBugun < dolarDun) {
            okYonu = "down.svg";
            System.out.println(okYonu);
        }else if (dolarBugun > dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        }else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        String[] krediler = { "Hızlı Kredi", "Maaşını Halkbanktan", "Mutlu Emekli" };
        for(String kredi : krediler) {
            System.out.println(kredi);
        }
    }
}