package Factory_Computer_loesung;


public class Server extends Computer {

    @Override
    public int getCPU() {
        // TODO Auto-generated method stub
        return 16;
    }
    @Override
    public int getHDD() {
        // TODO Auto-generated method stub
        return 10240;
    }
    @Override
    public int getRAM() {
        // TODO Auto-generated method stub
        return 128;
    }

}
