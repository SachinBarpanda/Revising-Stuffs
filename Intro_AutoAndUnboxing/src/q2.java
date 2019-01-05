public class q2 {
    public static void main(String[] args) {

        int prev=0;int current=1;int next;
        System.out.println("Numbe of fibonnaci number printed will be :"+args[0]);
        System.out.print(prev+"\t"+current+"\t");
        for(int i=0;i<Integer.parseInt(args[0]);i++){
            next=current+ prev;
            System.out.print(next+"\t");
            prev=current;
            current=next;

        }

    }
}
