package java_pratice.MidTerm;


class complex{
       long r1;
        long r2;
        long i1;
        long i2;
        public void getinfo(long real1,long real2,long img1,long img2) {
            this .r1 = real1;
            r2 = real2;
            i1 = img1;
            i2 = img2;
        }
            void show() {
                System.out.println(r1 + "+i" + i1);
                System.out.println(r2 + "+i" + i2);
            }

        public void addition(){
            System.out.println("addition is : "+ (r1+r2)+ "+i"+ (i1+i2));

        }

}
public class Complex1 {
    public static void main(String[] args) {
        complex c = new complex();
        c.getinfo(10, 12, 6, 7);
        c.show();
        c.addition();
    }
}