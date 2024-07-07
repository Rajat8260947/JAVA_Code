package java_pratice.MidTerm;

public class prime_number {
    public static void main(String[] args) {
        int num=0;

        String primeNumber= " ";
        for (int i = 0; i <= 50; i++)
        {
            int count=0;
            for (num = i; num >=1 ; num--)
            {
                if(i%num==0)
                {
                    count= count+1;
                }

            }
            if(count==2)
            {
                primeNumber= primeNumber + i+ " ";

            }

        }
        System.out.println(" prime numbers from 0 to 50 are :");
        System.out.println(primeNumber);
    }
}
