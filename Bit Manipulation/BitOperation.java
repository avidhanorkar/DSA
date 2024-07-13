public class BitOperation {

    public static void ithBit(int bin, int i){
        int a = 1 << i;
        if ((bin & a) == 0){
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }

    public static int setIthBit(int bin, int i){
        int a = 1 << i;
        return (bin | a);
    }

    public static int clearIthBit(int bin, int i){
        int a = ~(1 << i);
        return (bin & a);
    }

    public static void updateIthBit(int bin, int i){
        int a = 1 << i;
        if ((bin & a) == 0){
            System.out.println(setIthBit(bin, i));
        } else {
            System.out.println(clearIthBit(bin, i));
        }
    }

    public static int numOfSetBits(int a){
        int count = 0;

        while (a > 0){
            if ((a & 1) == 0){
                count++;
            }
            a = a >> 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int a = 14;
        int i = 2;
        ithBit(a, i);
        System.out.println(setIthBit(a, i));
        System.out.println(clearIthBit(a, i));
        updateIthBit(a, i);
        System.out.println(numOfSetBits(a));
    }
}
