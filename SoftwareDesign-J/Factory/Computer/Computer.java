package Factory.Computer;

// DO NOT CHANGE
public abstract class Computer {
    public abstract int getCPU();

    public abstract int getRAM();

    public abstract int getHDD();

    public void dust()
    {
        System.out.println("Remove dust from " + this.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return String.format("%s: CPU:%dGHz RAM: %dGB HDD: %dGB", this.getClass().getName(), getCPU(), getRAM(),
                getHDD());
    }

}
