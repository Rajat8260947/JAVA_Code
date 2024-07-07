public class sort {
    public static void main(String[] args) {
        int num[]={7,5,3,1,4};
        int i,j,index,temp;
        for(i=0;i<num.length;i++){
            index=i;
            for(j=1+1;j<num.length;j++){
                if (num[index]>num[j]){
                    index=j;
                }
            }
            temp=num[index];
            num[index]=num[i];
            num[i]=temp;
        }
        for(i=0;i<num.length;i++){
            System.out.print(num[i]+",");
        }
    }
}
