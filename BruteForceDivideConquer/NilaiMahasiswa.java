package BruteForceDivideConquer;
public class NilaiMahasiswa {

    int uts[];
    int uas[];

    NilaiMahasiswa(int uts[], int uas[]){
        this.uts = uts;
        this.uas = uas;
    }

    int maxUTS(int l, int r){
        if(l == r){
            return uts[l];
        }

        int mid = (l+r)/2;
        int lmax = maxUTS(l,mid);
        int rmax = maxUTS(mid+1,r);

        return Math.max(lmax,rmax);
    }

    int minUTS(int l, int r){
        if(l == r){
            return uts[l];
        }

        int mid = (l+r)/2;

        int lmin = minUTS(l,mid);
        int rmin = minUTS(mid+1,r);

        return Math.min(lmin,rmin);
    }

    double rataUAS(){
        int total = 0;

        for(int i=0;i<uas.length;i++){
            total += uas[i];
        }

        return (double) total / uas.length;
    }
}