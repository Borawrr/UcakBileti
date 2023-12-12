import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        int yas,yTipi;
        double km;
        
        System.out.print("Katedeceginiz mesafeyi km cinsinden giriniz : ");
        km = scanner.nextDouble();
        
        System.out.print("Yasinizi giriniz : ");
        yas = scanner.nextInt();
    
        System.out.print("Yolculuk Tipinizi Seciniz (1- Tek Yon / 2- Gidis Donus) : ");
        yTipi = scanner.nextInt();

        if (km <= 0 || yas <= 0 || (yTipi != 1 && yTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
        } else {
            
            double birimFiyat = 5;
            double toplamFiyat = km * birimFiyat;
      
                if(yas < 12){
                    toplamFiyat = toplamFiyat * 0.5 ;
                }else if (12 <= yas && yas <= 24){
                    toplamFiyat = toplamFiyat * 0.9 ;
                }else if (yas >= 65){
                    toplamFiyat = toplamFiyat * 0.7 ;
                }
        
            if (yTipi == 2){
                toplamFiyat = toplamFiyat * 0.8;

            }
            
            System.out.println(toplamFiyat);
        }
    
        scanner.close();
    
    }

    

}
        
        

        
        
        
        