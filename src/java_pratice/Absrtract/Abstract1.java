package java_pratice.Absrtract;



abstract class parent {
     abstract void  message();
}
     class Son extends  parent{
          void message()
         {
             System.out.println(" this is first sub class");

         }

     }
         class Daughter extends  parent
         {
                void  message()
                {
                    System.out.println(" this is Second sub class");
                }
         }




public class Abstract1 {
    public static void main(String[] args) {

        Son son= new Son();
        son.message();
        Daughter d=new Daughter();
        d.message();
    }

}


