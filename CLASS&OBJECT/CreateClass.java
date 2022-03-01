class CreateClass{   /// this is creation of class
    public  void fun() // this is method 
    {
        System.out.println("thsis is function fun:");
    }
    public static void main(String[] args) {
        System.out.println("this is the  block of main method:");
        CreateClass obj=new CreateClass();  //creation of the object
        // if you will create lots of obj so you program will take more memory ;
        obj.fun(); //now through the object fruits method is callig
    }
}