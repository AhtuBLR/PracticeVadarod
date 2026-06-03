package by.lessons.practics.class4;

public class Factory extends IndustrialBuilding {
    private  int workers;
    private String product; //запчасти, полиэтилен и т.д

    public Factory(String street, String matirialOfWall, int yearOfBuild, String industry, int workers) {
        super(street, matirialOfWall, yearOfBuild, industry);
        this.workers = workers;
    }
}

