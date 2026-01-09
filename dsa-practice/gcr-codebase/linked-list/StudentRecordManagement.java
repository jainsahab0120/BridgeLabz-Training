import java.util.Scanner;

// Node for student record
class StudentNode {
    int roll;
    String name;
    int age;
    String grade;
    StudentNode next;

    StudentNode(int roll, String name, int age, String grade) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentRecordSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentNode head = null;

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        while (n-- > 0) {
            System.out.println("\nEnter student details:");
            int roll = sc.nextInt();
            String name = sc.next();
            int age = sc.nextInt();
            String grade = sc.next();

            System.out.println("Choose position:");
            System.out.println("1 → Add at End");
            System.out.println("2 → Add at Start");
            System.out.println("3 → Add at Specific Position");

            int choice = sc.nextInt();

            if (choice == 1) {
                head = insertEnd(head, roll, name, age, grade);
            } 
            else if (choice == 2) {
                head = insertStart(head, roll, name, age, grade);
            } 
            else if (choice == 3) {
                System.out.print("Enter position: ");
                int pos = sc.nextInt();
                head = insertAtPosition(head, roll, name, age, grade, pos);
            }
        }

        displayList(head);

        System.out.print("\nEnter roll number to delete: ");
        int delRoll = sc.nextInt();
        head = deleteByRoll(head, delRoll);
        displayList(head);

        System.out.print("\nEnter roll number to search: ");
        int searchRoll = sc.nextInt();
        searchStudent(head, searchRoll);

        System.out.print("\nEnter roll number to update grade: ");
        int updateRoll = sc.nextInt();
        System.out.print("Enter new grade: ");
        String newGrade = sc.next();
        head = updateStudentGrade(head, updateRoll, newGrade);

        displayList(head);
        sc.close();
    }

    // Insert at start
    static StudentNode insertStart(StudentNode head, int roll, String name, int age, String grade) {
        StudentNode node = new StudentNode(roll, name, age, grade);
        node.next = head;
        return node;
    }

    // Insert at end
    static StudentNode insertEnd(StudentNode head, int roll, String name, int age, String grade) {
        StudentNode node = new StudentNode(roll, name, age, grade);

        if (head == null) return node;

        StudentNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = node;
        return head;
    }

    // Insert at specific position
    static StudentNode insertAtPosition(StudentNode head, int roll, String name, int age, String grade, int pos) {
        if (pos <= 1) return insertStart(head, roll, name, age, grade);

        StudentNode node = new StudentNode(roll, name, age, grade);
        StudentNode temp = head;

        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position!");
            return head;
        }

        node.next = temp.next;
        temp.next = node;
        return head;
    }

    // Display all students
    static void displayList(StudentNode head) {
        System.out.println("\nStudent Records:");
        StudentNode temp = head;

        if (temp == null) {
            System.out.println("No records available.");
            return;
        }

        while (temp != null) {
            System.out.println(temp.roll + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }

    // Delete student by roll number
    static StudentNode deleteByRoll(StudentNode head, int roll) {
        if (head == null) return null;

        if (head.roll == roll) return head.next;

        StudentNode prev = head;
        StudentNode curr = head.next;

        while (curr != null) {
            if (curr.roll == roll) {
                prev.next = curr.next;
                return head;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Student not found!");
        return head;
    }

    // Search student
    static void searchStudent(StudentNode head, int roll) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.roll == roll) {
                System.out.println("Found: " + temp.roll + " " + temp.name + " " + temp.age + " " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found!");
    }

    // Update grade
    static StudentNode updateStudentGrade(StudentNode head, int roll, String grade) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.roll == roll) {
                temp.grade = grade;
                System.out.println("Grade updated successfully.");
                return head;
            }
            temp = temp.next;
        }

        System.out.println("Student not found!");
        return head;
    }
}
