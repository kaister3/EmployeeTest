public class Employee {
    String name;
    int age;
    String designation;
    double salary;
    //employee类的构造
    public Employee(String name)
    {
        this.name = name;
    }
    //设置age的值
    public void empAge(int empAge){
        age = empAge;
    }
    /*设置designation*/
    public void empDesignation(String empDesignation){
        designation = empDesignation;
    }
    /*设置salary*/
    public void  empSalary(double empSalary){
        salary = empSalary;
    }
    /*打印信息*/
    public void printEmployee(){
        System.out.println("Name:"+name);
        System.out.println("age:"+age);
        System.out.println("designation:"+designation);
        System.out.println("salary:"+salary);
    }
}
