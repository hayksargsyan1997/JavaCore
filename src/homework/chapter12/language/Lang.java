package homework.chapter12.language;

public enum Lang {
    ARM("Հայաստան",1),
    RU("ՌԴ"),
    ENG("ԱՄՆ");

    private String countryName;
    private int count;


    Lang(String countryName) {
        this.countryName = countryName;
    }

    Lang(String countryName, int count) {
        this.countryName = countryName;
        this.count = count;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getCount() {
        return count;
    }
}
