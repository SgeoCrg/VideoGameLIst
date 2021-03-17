package data;

public class VideoGame {
    protected String title;
    protected String genre;
    protected float price;
    protected Company company;
    static int counter = 0;

    public VideoGame(String title, String genre, float price, Company company) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.company = company;
        counter++;
    }

    public VideoGame(String title, String genre, float price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void counterDown() {
        counter--;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price + " " + company.toString() +
                '}';
    }
}
