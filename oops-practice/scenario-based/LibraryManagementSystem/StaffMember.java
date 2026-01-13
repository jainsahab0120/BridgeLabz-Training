public class StaffMember extends Member {

    public StaffMember(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculateFine(int lateDays) {
        return lateDays * 1;
    }

    @Override
    public String getMemberType() {
        return "Staff";
    }
}
