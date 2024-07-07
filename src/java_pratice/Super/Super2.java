package java_pratice.Super;
class person {
    int id ;
    String name;
    person(int id ,String name )
    {
         this.id=id;
         this.name=name;

    }

}
 class Emp extends  person{

     Emp(int id, String name) {
         super(id, name);
     }
 }
public class Super2 {


}
