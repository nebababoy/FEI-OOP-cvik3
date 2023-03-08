
public class Main {
    public static void zadanie_32(Student[] s){
        for (int i = 0; i < s.length - 1; i++){
            for (int j = 0; j < s.length - i - 1; j++)
                if (s[j].name.compareTo(s[j+1].name) > 0){
                    Student temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
        }
        for(int i = 0;i < s.length;i++){
            System.out.println(s[i].name + " "+ s[i].surname);
        }

    }
    public static void main(String[] args) {
        Student s1 = new Student(19, 12345,"Micho","Blabla");
        Student s2 = new Student(19, 12345,"Arina","Blabla1");
        Student s3 = new Student(19, 12345,"Zarina","Blabla2");
        Student[] s = {s1, s2, s3};
        //-------------------zadanie_3.2--------------------
        //zadanie_32(s);
        //-------------------zadanie_3.3--------------------







    }
}