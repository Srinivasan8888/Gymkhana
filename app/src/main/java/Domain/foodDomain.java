package Domain;

public class foodDomain {
    private String title;
    private String pic;
    private String description;
    private Double fee;
    private int numberIncart;

    public foodDomain(String pepperoni_pizza, String title, String pic, int i) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.fee = fee;

    }
    public foodDomain(String title, String pic, String description, Double fee, int numberIncart) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.fee = fee;
        this.numberIncart = numberIncart;

}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public int getNumberIncart() {
        return numberIncart;
    }

    public void setNumberIncart(int numberIncart) {
        this.numberIncart = numberIncart;
    }
}

