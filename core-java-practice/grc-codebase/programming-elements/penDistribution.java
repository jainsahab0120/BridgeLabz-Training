public class penDistribution {
    public static void main(String[] args) {

        int totalPens = 14;
        int students = 3;

        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;

        System.out.print("the pen per Student is  " + pensPerStudent );
        System.out.println(" and Remaining pens not distributed is : " + remainingPens);

    }
}