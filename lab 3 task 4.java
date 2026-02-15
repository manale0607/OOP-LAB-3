public class Computerlab {
        String systemID;
        String processor;
        int ramSize; // in GB
        String operatingSystem;

        Computerlab(String id, String proc, int ram, String os) {
            systemID = id;
            processor = proc;
            ramSize = ram;
            operatingSystem = os;
        }

        void display() {
            System.out.println("System ID: " + systemID);
            System.out.println("Processor: " + processor);
            System.out.println("RAM Size: " + ramSize + " GB");
            System.out.println("Operating System: " + operatingSystem);
            System.out.println("----------------------------");
        }
    }

        public  void main(String[] args) {

            Computerlab c1 = new Computerlab("LAB01-PC01", "Intel i5", 8, "Windows 10");
            Computerlab c2 = new Computerlab("LAB01-PC02", "Intel i7", 16, "Windows 11");

            c1.display();
            c2.display();
        }

