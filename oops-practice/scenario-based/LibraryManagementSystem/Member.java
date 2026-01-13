public abstract class Member extends User implements FineCalculator {

    public Member(int userId, String name) {
        super(userId, name);
    }

    public abstract String getMemberType();
}
