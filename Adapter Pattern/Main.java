class Main
{
    public static void main(String args[])
    {
        Anggora anggora = new Anggora();
        Bebek siBebek = new SiBebek();

        Kucing bebekAdapter = new BebekAdapter(siBebek);
  
        System.out.print("Suara kucing Anggora : ");
        anggora.Miaw();
  
        System.out.print("Suara Si bebek : ");
        siBebek.makeSound();
  
        //kucing bersuara bebek
        System.out.print("Suara si kucing sekarang : ");
        bebekAdapter.Miaw();
    }
}