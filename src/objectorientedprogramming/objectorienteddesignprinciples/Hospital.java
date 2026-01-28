package objectorientedprogramming.objectorienteddesignprinciples;
class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        System.out.println(name + " consulted " + p.name);
    }
}

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Hospital {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Rao");
        Patient p = new Patient("Anita");

        d.consult(p);
    }
}
