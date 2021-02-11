package p11_referencje;

public class Konto {
    int numer;
    int saldo;
    Osoba wlasciciel;

    public Konto(int numer, int saldo, Osoba wlasciciel) {
        this.numer = numer;
        this.saldo = saldo;
        this.wlasciciel = wlasciciel;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "numer=" + numer +
                ", saldo=" + saldo +
                ", wlasciciel=" + wlasciciel +
                '}';
    }

    public void wplata(int kwota) {
        saldo += kwota;
    }

    public void wyplata(int kwota) {
        saldo -= kwota;
    }

}
