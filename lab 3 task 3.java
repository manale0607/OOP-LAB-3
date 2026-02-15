public class course{
        String courseCode;
        String courseName;
        int creditHours;

        course(String code, String name, int hours) {
            courseCode = code;
            courseName = name;
            creditHours = hours;
        }

        void display() {
            System.out.println("Course Code: " + courseCode);
            System.out.println("Course Name: " + courseName);
            System.out.println("Credit Hours: " + creditHours);
            System.out.println("----------------------");
        }
    }
        public void main(String[] args) {


            course c1 = new course("CS101", "Introduction to Programming", 3);
            course c2 = new course("MTH101", "Calculus I", 4);

            c1.display();
            c2.display();
        }
