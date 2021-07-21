//3 TYPES OF TRIANGLES
package bulk.activity.pkg3;
public class BulkActivity3 {
    
    public static void main(String[] args) {
        pl("Michael Jan R. Tangalin | 1 - BSEMC - 1");
        Right_triangle1();
        Left_triangle2();
        DiamondTriangle3();
    }
    static void Right_triangle1(){
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                p("A");
            }
            pl("");
        }
        for (int a = 1; a <= 4; a++) {
            for (int b = 4; b >= a; b--) {
                p("A");
            }
            pl("");
        } pl("----------");
    }
    static void Left_triangle2(){
         for (int a = 1; a <= 5; a++) {
            for (int b = a; b <= 4; b++) {
                p(" ");
            }
            for (int b = 1; b <= a; b++) {
                p("B");
            }
            pl("");
        }
        for (int a = 1; a <= 4; a++) {
            for (int b = 1; b <= a; b++) {
                p(" ");
            }
            for (int b = a; b <= 4; b++) {
                p("B");
            }
            pl("");
        } pl("----------");
    }
    static void DiamondTriangle3(){
         for (int a = 1; a <= 5; a++) {
            for (int b = a; b <= 5; b++) {
                p(" ");
            }
            for (int b = 1; b <= a + (a - 1); b++) {
                p("C");
            }
            pl("");
        }pl("-----------");
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                p(" ");
            }
            for (int b = a; b <= 5 + (5 - a); b++) {
                p("D");
            }
            pl("");
        }
    }
    static void p(String Msg) {
        System.out.print(Msg);
    }
    static void pl(String Msg) {
        System.out.println(Msg);
    }    
}

