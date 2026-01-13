public class StudentMember extends Member {

    public StudentMember(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculateFine(int lateDays) {
        return lateDays * 2;
    }

    @Override
    public String getMemberType() {
        return "Student";
    }
}
