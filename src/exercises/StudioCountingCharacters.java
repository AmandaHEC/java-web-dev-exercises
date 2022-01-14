//package exercises.Lecture2;
//import java.util.HashMap;
//public class HashMap {
//    public static void main(String[] args) {
//        HashMap<Integer, String> classRoster = new HashMap<>();
//        Scanner input = new Scanner(System.in);
//        String newStudent;
//
//        System.out.println("Enter your students (or ENTER to finish):");
//
//        // Get student names and grades
//        do {
//
//            System.out.print("Student name: ");
//            newStudent = input.nextLine();
//
//            if (!newStudent.equals("")) {
//                System.out.print("ID: ");
//                Integer newID = input.nextInteger();
//                classRoster.put(newID, newStudent);
//
//            }
//
//            input.nextLine();
//    }
//
//}
//        while(!newStudent.equals(""));
//
//        // Print class roster
//        System.out.println("\nClass roster:");
//        double sum = 0.0;
//
//        for (Map.Entry<Integer,String> student : classRoster.entrySet()) {
//        System.out.println(student.getValue() + " (" + student.getKey() + ")");
//
//        }
//
//        System.out.println("Average grade: " + avg);
//        }
//        }
