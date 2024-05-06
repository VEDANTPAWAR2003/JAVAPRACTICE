//array of objects

class Student
{
    int rollNo;
    String name;
    int marks;
}




public class arrayobj05 {
    public static void main(String arg[])
    {

        Student s1=new Student();
        s1.rollNo = 1;
        s1.name = "Vedant";
        s1.marks=98;

        Student s2=new Student();
        s2.rollNo = 2;
        s2.name = "Riddhi";
        s2.marks=89;
        
        Student s3=new Student();
        s3.rollNo = 3;
        s3.name = "Adi";
        s3.marks=91;

        Student stud[] =new Student[3];
        stud[0]=s1;
        stud[1]=s2;
        stud[2]=s3;
        for(int i=0;i<stud.length;i++)
        {
            System.out.println(stud[i].name +":"+stud[i].marks);
        }
        

        

    }
}
