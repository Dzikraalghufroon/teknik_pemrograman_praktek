public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id = 0;

    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }


    public void tambahMenuMakanan(String nama, double harga, int stok) {
        if (stok < 0) {
            System.err.println("Stok tidak boleh kosong");
            return;
        }
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
    }

    public void pesanMenuMakanan(String makanan, int jumlah){
        int index = cariMakanan(makanan);
        if (index < 0) {
            System.out.println("makanan yang anda pesan tidak ada");
            return;
        }
        if (jumlah <= 0 ) {
            System.out.println("Anda tidak bisa memesan kurang dari nol atau nol");
            return;
        }
        if (stok[index] == 0) {
            System.out.println("makanan yang anda pesan sedang kehabisan stok");
            return;
        }
        if (stok[index] < jumlah) {
            System.out.println("Makanan yang anda pesan melebihi jumlah stok yang tersedia");
            return;
        }
        System.out.println("Makanan anda berhasil dipesan");
        stok[index] -= jumlah;

    }
    private int cariMakanan(String nama){
        for(int i=0;i < id; i++){
            if (nama_makanan[i] == nama) {
                return i;
            }
        }
        return -1;
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i <= id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(
                    nama_makanan[i] + "[" + stok[i] + "]" + "\tRp. " + harga_makanan[i]
                );
            }
        }
    }

    public boolean isOutOfStock(int id) {
        if (stok[id] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void nextId() {
        id++;
    }
}