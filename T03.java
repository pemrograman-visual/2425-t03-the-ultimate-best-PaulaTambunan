// 12S24025 - Paula Gevriella Tambunan
// 12S24031 - Amelia Renata LumbanBatu


public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int stok;
        String judulBuku, penulis, penerbit, formatBukuElektronik, iSBN, kategori, tahunTerbit, jenisDiskon, kesimpulan;
        double hargaPembelian, minimumMargin, rating;

        iSBN = input.nextLine();
        while (!iSBN.equals("---")) {
            judulBuku = input.nextLine();
            penulis = input.nextLine();
            tahunTerbit = input.nextLine();
            penerbit = input.nextLine();
            formatBukuElektronik = input.nextLine();
            hargaPembelian = Double.parseDouble(input.nextLine());
            minimumMargin = Double.parseDouble(input.nextLine());
            if (-(minimumMargin / hargaPembelian) > 0.4) {
                jenisDiskon = "Once in a lifetime";
            } else {
                if (0.2 < -(minimumMargin / hargaPembelian) && minimumMargin / hargaPembelian < 0.4) {
                    jenisDiskon = "Never come twice";
                } else {
                    if (-(minimumMargin / hargaPembelian) <= 0.2 && -(minimumMargin / hargaPembelian) > 0) {
                        jenisDiskon = "No regret";
                    } else {
                        jenisDiskon = "---";
                    }
                }
            }
            stok = Integer.parseInt(input.nextLine());
            rating = Double.parseDouble(input.nextLine());
            if (rating >= 4.7) {
                kategori = "Best Pick";
            } else {
                if (rating >= 4.5 && rating < 4.7) {
                    kategori = "Must Read";
                } else {
                    if (rating >= 4.0 && rating < 4.5) {
                        kategori = "Recommended";
                    } else {
                        if (rating >= 3.0 && rating < 4.0) {
                            kategori = "Average";
                        } else {
                            if (rating < 3.0) {
                                kategori = "Low";
                            } else {
                                kategori = "Low";
                            }
                        }
                    }
                }
            }
            if (jenisDiskon.equals("Once in a lifetime") && kategori.equals("Best Pick")) {
                kesimpulan = "The Ultimate Best";
            } else {
                kesimpulan = "---";
            }
            System.out.println(iSBN + "|" + judulBuku + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBukuElektronik + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + rating + "|" + kategori + "|" + jenisDiskon + "|" + kesimpulan);
            iSBN = input.nextLine();
        }
    }
}
