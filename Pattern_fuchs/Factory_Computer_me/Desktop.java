package Factory_Computer_me;

public class Desktop extends Computer{
    @Override
    public int getCPU() {
        return 4;
    }

    @Override
    public int getRAM() {
        return 8;
    }

    @Override
    public int getHDD() {
        return 2048;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
