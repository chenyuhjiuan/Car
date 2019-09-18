public class CarDB {
    private String make;
    private String model;
    private int year;

    public CarDB() {
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String displayCarInf (){

        String result ="make:"+getMake()+'\t'+"model:"+getModel()+'\t'+"year:"+getYear()+".";

        return result;
    }
}
