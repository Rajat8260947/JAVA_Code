package java_pratice.Absrtract;
 abstract class Bank {
         abstract  void getbalance();
  }
  class BankA extends  Bank {
      void getbalance() {
          System.out.println(" deposited money is $100");
      }
  }
      class BankB extends  Bank {
          void getbalance() {
              System.out.println(" deposited money is $200");
          }
      }
          class BankC extends BankB {
              void getbalance() {
                  System.out.println(" deposited money is $300");
              }
          }

public class Abstract2 {
    public static void main(String[] args) {

        BankA A = new BankA();
        A.getbalance();
        BankB B = new BankB();
        B.getbalance();
        BankC C=new BankC();
        C.getbalance();
    }
}

