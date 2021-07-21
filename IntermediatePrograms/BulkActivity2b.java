package bulk.activity.pkg2b;

public class BulkActivity2b {

    static int[] DataNums = {2, 20, 5, 1000};

    public static void main(String[] args) {
        pl("TANGALIN, MICHAEL JAN R. | 1 - BSEMC - 1\n");
        Process(DataNums);
    }

    static void Process(int[] Data_Nums) {
        int x = 1;
        pl("---Result---");
        do {
            pl(Data_Nums[0] + ", " + Data_Nums[1] + ", " + Data_Nums[2] + ", " + Data_Nums[3]);
            Data_Nums[0] *= 2;
            Data_Nums[1] -= 2;
            Data_Nums[2] *= 3;
            Data_Nums[3] /= 2;

            x = 1 + x;
        } while (x <= 10);
        pl("---END---");
    }

    static void pl(String Msg) {
        System.out.println(Msg);
    }
}
