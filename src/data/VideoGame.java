package data;

public class VideoGame {
    String title;
    String genre;
    float price;
    Company company;
    static int counter = 0;

    public VideoGame(String title, String genre, float price, Company company) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.company = company;
        counter++;
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

    @Override
    public String toString() {
        return "VideoGame{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price + " " + company.toString() +
                '}';
    }
}
