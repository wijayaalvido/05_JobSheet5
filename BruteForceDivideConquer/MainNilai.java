package BruteForceDivideConquer;
public class MainNilai{
    public static void main(String[] args) {

        int uts[] = {78,85,90,76,92,88,80,82};
        int uas[] = {82,88,87,79,95,85,83,84};

        NilaiMahasiswa nm = new NilaiMahasiswa(uts, uas);

        System.out.println("UTS tertinggi : " + nm.maxUTS(0, uts.length-1));
        System.out.println("UTS terendah : " + nm.minUTS(0, uts.length-1));
        System.out.println("Rata-rata UAS : " + nm.rataUAS());
    }
}