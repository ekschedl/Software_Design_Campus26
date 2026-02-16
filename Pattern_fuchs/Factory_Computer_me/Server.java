package Factory_Computer_me;

public class Server extends Computer{
    @Override
    public int getCPU() {
        return 16;
    }

    @Override
    public int getRAM() {
        return 128;
    }

    @Override
    public int getHDD() {
        return 10240;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
