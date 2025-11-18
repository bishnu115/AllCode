package Array;

public class pairs20 {
    public static void main(String[] args) {
        int[] num={12,33,45,8,0,10,10,8};
        int trg=20;

        for (int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){

                if (num[i]+num[j]==trg)
                {
                    System.out.println("pair is "+num[i]+" "+num[j]);
                }
            }

        }
    }
}
