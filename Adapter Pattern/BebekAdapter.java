class BebekAdapter implements Kucing
{
    // You need to implement the interface your
    // client expects to use.
    Bebek cing;
    public BebekAdapter(Bebek cing)
    {
        // we need reference to the object we
        // are adapting
        this.cing = cing;
    }

    public void Miaw()
    {
        // translate the methods appropriately
        cing.makeSound();
    }
}
