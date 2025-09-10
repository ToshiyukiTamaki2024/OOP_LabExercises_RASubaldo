public class Car {
    private String color;
    private String plateNo;
    private String chassisNo;
    private String brand; // <-- ADD THIS LINE

    // no argument constructor
    public Car() {
        this.brand = "No Brand"; // <-- ADD THIS LINE
        this.color = "No Color";
        this.plateNo = "No PlateNumber";
        this.chassisNo = "No Chassis No Yet!";
    }

    // parameterized constructor
    public Car(String brand, String color, String plateNo, String chassisNo) { // <-- ADD 'brand' PARAMETER
        this.brand = brand; // <-- ADD THIS LINE
        this.color = color;
        this.plateNo = plateNo;
        this.chassisNo = chassisNo;
    }

    //----------- methods ---------------------------------
    public void displayInfo() {
        String info = "";
        info += "Brand: " + this.brand; // <-- ADD THIS LINE
        info += "\nColor: " + this.color;
        info += "\nPlateNo: " + this.plateNo;
        info += "\nChassisNo: " + this.chassisNo;
        System.out.println(info);
        System.out.println("--------------------"); // Added for better readability
    }
}