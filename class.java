class Employee{
    String name;
    int year;
    String address;

     void getdetails(String na,int yr,String ad){
        name=na;
        year=yr;
        address=ad;
    }
     void putdetails(){
        System.out.println(name+" "+year+" "+address);
    }
}

class Test{
        public static void main(String []args){ 
       Employee e1=new Employee();
       Employee e2=new Employee();
       Employee e3=new Employee();
       e1.getdetails("Robert",1994,"64C-Wallstreet");
       e2.getdetails("Sam",2000,"68D-Wallstreet");
       e3.getdetails("John",1999,"26B-Wallstreet");
       e1.putdetails();
       e2.putdetails();
       e3.putdetails();
        }
}
       
