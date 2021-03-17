package data;

public class PCVideoGame extends VideoGame{

    int minimumRAM;
    int minimumHD;

    public PCVideoGame(String title, String genre, float price, int minimumRAM,
                       int minimumHD, Company company) {
        super(title, genre, price, company);
        this.minimumRAM = minimumRAM;
        this.minimumHD = minimumHD;
    }

    public int getMinimumRAM() {
        return minimumRAM;
    }

    public void setMinimumRAM(int minimumRAM) {
        this.minimumRAM = minimumRAM;
    }

    public int getMinimumHD() {
        return minimumHD;
    }

    public void setMinimumHD(int minimumHD) {
        this.minimumHD = minimumHD;
    }
}
