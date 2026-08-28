public class MultipleObject{
    public static void main(String args[]){
        Student student1=new Student();
        Student student2=new Student();

        student1.name="Priya";
        student2.name="Bhagya";

        System.out.println(student1.name);
        System.out.println(student2.name);
    }
}