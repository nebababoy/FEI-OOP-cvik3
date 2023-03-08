public class Student {
    int ID;
    String name;
    String surname;
    int age;
    public int getID(){
        return ID;
    }
    public void setID(int newID){
        age = newID;
    }
    public String getName() {
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String newSurname){
        surname = newSurname;
    }
    public int getAge(){
         return age;
    }
    public void setAge(int newAge){
         age = newAge;
    }
//        public Student(){
//           System.out.println("Student()");
//        }
    public Student(int age, int id, String name, String surname){
        this.age = age;
        this.ID = id;
        this.name = name;
        this.surname = surname;
        System.out.println(" "+ age + " " + id + " " + name + " " + surname);

    }


}
