import java.util.Scanner;

public class Main {
private static Sarkicilar sarkicilar= new Sarkicilar();
//main metodun içine yazmadık çünkü diğer fonk.-lardan bu objeye erişemeyeceğiz
private static Scanner scanner = new Scanner(System.in);
//private static Scanner scanner scanner = new Scanner(System.in);
//ilk böyle yazdım ve 2 defa scanner yazdığım için hata aldım bir daha olmasın dikkat et
public static  void islemleri_bastir() {
    System.out.println("\t 0-İşlemleri Görüntüle");
    System.out.println("\t 1-Şarkıcıları Görüntüle");
    System.out.println("\t 2-Şarkıcı Ekle");
    System.out.println("\t 3-Şarkıcı Güncelle");
    System.out.println("\t 4-Şarkıcı Sil");
    System.out.println("\t 5-Şarkıcı Ara");
    System.out.println("\t 6-İşlemleri Görüntüle");
}

    public static void sarkici_goruntule(){
        sarkicilar.sarkici_bastir();
    }

    public static void sarkici_ekle(){
        System.out.println("Eklemek istediğimiz şarkıcının ismi : ");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
    }
    public static void sarkici_gunceller(){
        System.out.print("Hangi sıradaki şarkıcıyı güncellemek istersin : ");
        int pozisyon =scanner.nextInt();
        scanner.nextLine();
        System.out.print("Yeni isimi giriniz : ");
        String yeni_isim = scanner.nextLine();
        sarkicilar.sarkici_guncelle(yeni_isim,pozisyon-1);
    }

    public static void sarkici_sil(){
        System.out.println("Silmek istediğiniz pozisyonu giriniz : ");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();

        sarkicilar.sarkici_sil(pozisyon-1);
    }

    public static void sarkici_ara(){
        System.out.println("Aramak istediğiniz şarkıcı : ");

        String isim = scanner.nextLine();

        sarkicilar.sarkici_ara(isim);
    }

    public static void main(String[] args) {
        System.out.println("\t Şarkıcı Uygulamasına Hoşgeldiniz ...");

        islemleri_bastir();

        boolean cikis = false;

        int islem;

        while(!cikis){// cikis true olunca sonlanıcak işlem
            System.out.print("Bir işlem seçiniz : ");

            islem = scanner.nextInt();
            scanner.nextLine();

            switch (islem){
                case 0:
                    islemleri_bastir();;
                    break;
                case 1:
                    sarkici_goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_gunceller();
                    break;
                case 4:
                    sarkici_sil();
                    break;
                case 5:
                    sarkici_ara();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan çıkılıyor ... ");
                    break;



            }

        }

    }
}