public class TestSample {
    public static void main(String[] args){
        Long l = new Long(1189);
        System.out.println(l.toString());
        long r = 25000;
        long total = 0;
        for(int i=0;i<20;i++){
            long y = r*12;
            total += y;
            System.out.println(i + " : "+ total);
            r = (long) (r*1.1);

        }
        System.out.println("total="+ total);

    }
}
