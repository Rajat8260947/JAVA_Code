class Test
{
    // static method
      static void m1()
    {
        System.out.println("from m1");
    }

    public static void main(String[] args)
    {
        // calling m1 without creating
        // any object of class Test
//        Test obj =new Test(); without using static keyword
//           obj.m1();
         m1() ;//with creat static keyword
    }
}
