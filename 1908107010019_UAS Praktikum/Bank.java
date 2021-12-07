class BNI implements Pick {
    @Override
    public void PickBank() {
        System.out.println("BANK BNI \n Terima Kasih");
    }
}

class Jenius implements Pick {
    @Override
    public void PickBank() {
        System.out.println("JENIUS \n Terima Kasih");
    }
}

public class Bank {
    private Pick yourPick;

    public void setyourPick(Pick pick) {
        this.yourPick = pick;
    }

    // mengembalikan nama atm/bank yang dipilih
    public void PickBank() {
        yourPick.PickBank();
    }

}
