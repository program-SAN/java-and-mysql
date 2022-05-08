 import java.util.Scanner;

    class Student {
        String name;
        String standard;
        String roll_no;
        int eng;
        int hindi;
        int maths;
        int geog;
        int sci;
        float total;
        float percentage;
        int z = 100;
        String grade;

        public void readData() {
            Scanner sd = new Scanner(System.in);
            System.out.print("Enter student name: ");
            name = sd.nextLine();
            System.out.print("Enter student class: ");
            standard = sd.nextLine();
            System.out.print("Enter student roll no: ");
            roll_no = sd.nextLine();
            System.out.print("Enter marks in English: ");
            eng = sd.nextInt();
            System.out.print("Enter marks in Geography: ");
            geog = sd.nextInt();
            System.out.print("Enter marks in Hindi: ");
            hindi = sd.nextInt();
            System.out.print("Enter marks in Maths: ");
            maths = sd.nextInt();
            System.out.print("Enter marks in Science: ");
            sci = sd.nextInt();
        }

        public void calculate() {
            total = eng + hindi + geog + maths + sci;
            percentage = (total / 500) * 100;
            if (percentage >= 35 && percentage < 50) {
                grade = "D";
            } else if (percentage >= 50 && percentage < 70) {
                grade = "C";
            } else if (percentage >= 70 && percentage < 85) {
                grade = "B";
            } else if (percentage >= 85 && percentage <= 100) {
                grade = "A";
            } else {
                grade = "E";
            }

        }

        public void displayData() {
            System.out.println("|--------------------------------------------------------------------------------------------------|");
            System.out.println("         MES COLLEGE OF ARTS AND COMMERCE                     ");
            System.out.println("Name: " + name + "  " + "          class:" + standard);
            System.out.println("Roll no: " + roll_no);
            System.out.println("|--------------------------------------------------------------------------------------------------|");
            System.out.println(" subjects          " + "total marks  " + "marks scored");
            System.out.println(" English:               " + z + "    " + eng);
            System.out.println(" Hindi:                 " + z + "    " + hindi);
            System.out.println(" Maths:                 " + z + "    " + maths);
            System.out.println(" Science:               " + z + "    " + sci);
            System.out.println(" Geography:             " + z + "    " + geog);
            System.out.println("|--------------------------------------------------------------------------------------------------|");
            System.out.println("Total Marks: " + total + "        Grade:" + grade);
            System.out.println("Percentage : " + percentage);
            System.out.println("|--------------------------------------------------------------------------------------------------|");

        }
    }
class main{
        public static void main(String args[]) {
             Scanner s1=new Scanner(System.in);
            System.out.println("enter the number of result u want to have.");
             int b= s1.nextInt();
            for (int i = 1; i <= b; i++) {
                System.out.println("result NO."+i);
                Student obj = new Student();
                obj.readData();
                obj.calculate();
                obj.displayData();
            }
        }
    }

