
public class Main {
    public static void main(String[] args) {
        int boyut = 7; // B harfinin boyutu

        // Çok boyutlu dizi oluşturma
        char[][] harf = new char[boyut][boyut];

        // Diziyi başlangıçta boşluklarla doldurma
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                harf[i][j] = ' ';
            }
        }

        // B harfinin sol dikey çizgisini oluşturma
        for (int i = 0; i < boyut; i++) {
            harf[i][0] = '*';
        }

        // B harfinin üst yatay çizgisini oluşturma
        for (int j = 1; j < boyut - 1; j++) {
            harf[0][j] = '*';
        }

        // B harfinin alt yatay çizgisini oluşturma
        for (int j = 1; j < boyut - 1; j++) {
            harf[boyut / 2][j] = '*';
        }

        // B harfinin sağ dikey çizgisini oluşturma
        for (int i = 0; i < boyut; i++) {
            harf[i][boyut - 1] = '*';
        }

        // B harfinin orta yatay çizgisini oluşturma
        for (int j = boyut / 2 + 1; j < boyut - 1; j++) {
            harf[boyut - 1][j] = '*';
        }

        // Diziyi ekrana yazdırma
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                System.out.print(harf[i][j] + " ");
            }
            System.out.println();
        }
    }
}
