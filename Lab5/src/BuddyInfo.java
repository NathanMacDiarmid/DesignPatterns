public class BuddyInfo {
    private String buddy;
    private String number;

    public BuddyInfo() {
        this.buddy = "Babak";
        this.number = "123-456-7890";
    }

    public void setBuddy(String buddy) {
        this.buddy = buddy;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBuddy() {
        return buddy;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "BuddyInfo{" +
                "buddy='" + buddy + '\'' +
                ", number='" + number + '\'' +
                '}';
    }


}
