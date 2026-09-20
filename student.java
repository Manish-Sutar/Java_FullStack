class stud
{
    private String name;
    private int id;

    void show()
    {
        System.out.println(" your name is  "+name +"\n your id is "+id);
    }
    stud(String name,int id)
    {
        this.name=name;
        this.id =id;
    }
}

public class student {
    public static void main(String args[])
    {
    stud b1 = new stud("raj",101);
    b1.show();
    }
}
