public class q3 {
    public static void main(String[] args) {
        System.out.println("Numberes in argument :");
        for(int i= 0;i<args.length;i++){
            System.out.print(Integer.parseInt(args[i])+" ");
        }

        System.out.println("maximum Value");
        int max = Integer.parseInt(args[0]);
        for(int i=0;i<args.length;i++){
            if(max<Integer.parseInt(args[i]))
            max=Integer.parseInt(args[i]);
        }

        System.out.println("Minimum Value");
        int Minimum = Integer.parseInt(args[0]);
        for(int i=0;i<args.length;i++){
            if(Minimum>Integer.parseInt(args[i]))
            Minimum=Integer.parseInt(args[i]);
        }



        int average=1;
        for(int i=0;i<args.length;i++){
            average +=Integer.parseInt(args[i]);
        }
        double ans = average/args.length;
        System.out.println("Max : "+ max +"\n"+

                           "Average :" + ans);
        System.out.println( "minimum :"+Minimum);
    }
}
