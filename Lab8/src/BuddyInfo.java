public class BuddyInfo {
    private String buddy;
    private String number;
    private String address;

    public BuddyInfo() {
        this.buddy = "Babak";
        this.number = "123-456-7890";
        this.address = "1233 Colonel By Dr.";
    }

    public void setBuddy(String buddy) {
        this.buddy = buddy;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public String getBuddy() {
        return buddy;
    }

    public String getNumber() {
        return number;
    }

    public String getAddress() {
        return this.address;
    }

    public static BuddyInfo importBuddyInfo(String buddy) {
        BuddyInfo newBuddy = new BuddyInfo();
        String[] b = buddy.split("#");
        newBuddy.setBuddy(b[0]);
        newBuddy.setAddress(b[1]);
        newBuddy.setNumber(b[2]);
        return newBuddy;
    }

    @Override
    public String toString() {
        return buddy + "#" + address + "#" + number;
    }
}
