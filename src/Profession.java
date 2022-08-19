public class Profession {
    String doctor;
    String engineer;
    String lawyer;
    String student;

    Profession(String s)
    {
        this.engineer=s;
    }

    void worksAt(Human h){
        System.out.println(h.name+" works as "+engineer);
    }
}
