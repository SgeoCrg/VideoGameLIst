package data;

public class Company {
    protected String name;
    protected int foundationYear;

    public Company(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", foundationYear=" + foundationYear +
                '}';
    }
}
