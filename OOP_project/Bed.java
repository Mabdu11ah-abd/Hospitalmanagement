public class Bed {
    private int DaysOccupied;
    private int bedNumber;
    private boolean isOccupied;

    public Bed(int daysOccupied) {
        DaysOccupied = daysOccupied;
        this.bedNumber = 0;
    }

    // Getters and Setters for all fields
    public int getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
    // Method to occupy the bed
    public void occupyBed() {
        if (!isOccupied) {
            isOccupied = true;
            System.out.println("Bed " + bedNumber + " is now occupied.");
        } else {
            System.out.println("Bed " + bedNumber + " is already occupied.");
        }
    }

    // Method to vacate the bed
    public void vacantBed() {
        if (isOccupied) {
            isOccupied = false;
            System.out.println("Bed " + bedNumber + " is now vacant.");
        } else {
            System.out.println("Bed " + bedNumber + " is already vacant.");
        }

    }
    public int getDaysOccupied() {
        return DaysOccupied;
    }

    public void setDaysOccupied(int daysOccupied) {
        DaysOccupied = daysOccupied;
    }

    // Other relevant methods
}
