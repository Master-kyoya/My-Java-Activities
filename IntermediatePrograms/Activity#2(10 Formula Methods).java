package activity.pkg2;

import java.util.Scanner;

public class Activity2 {

    public static void main(String[] args) {
        printme("Tangalin, Michael Jan R. | 1-BSEMC-1");
        MainMenu();
        int choice = inputNum("Choose your # Options");
        Menuchoices(choice);
    }

    static void MainMenu() {
        printme("---Computation Options---");
        printme("1. BMI");
        printme("2. Volume of Cube");
        printme("3. Area of Triangle");
        printme("4. Area of Trapezoid");
        printme("5. Perimeter Of Rectangle");
        printme("6. Area of Rhombus");
        printme("7. Grade Average");
        printme("8. Initial Velocity");
        printme("9. Average Speed");
        printme("10. Acceleration Formula");
    }

    static void Menuchoices(int choice) {
        switch (choice) {

            case 1:
                printme("---BMI---");
                int weightVAL = inputNum("Weight ");
                int heightVAL = inputNum("Height ");
                bmi(weightVAL, heightVAL);
                break;
            case 2:
                printme("---Volume of Cube---");
                int WidthOCube = inputNum("Width ");
                int LengthOfCube = inputNum("Cube Length ");
                int HeightOfCube = inputNum("Cube Height ");
                volumeofCube(WidthOCube, LengthOfCube, HeightOfCube);
                break;
            case 3:
                printme("---Area of Triangle---");
                int baseValOfTri = inputNum("Base of Triangle ");
                int heightValOfTri = inputNum("Height of Triangle ");
                areaOftriangle(baseValOfTri, heightValOfTri);
                break;
            case 4:
                printme("---Area of Trapezoid---");
                int LongBase = inputNum("Long Base Trapezoid");
                int ShortBase = inputNum("Short Base of Trapezoid");
                int height = inputNum("Height of Trapezoid");
                AreaOfTrapezoid(LongBase, ShortBase, height);
                break;
            case 5:
                printme("---Perimeter Of Rectangle---");
                int getLength = inputNum("Length of Rectangle");
                int getWidth = inputNum("Width of Rectangle");
                PerimeterOfRectangle(getLength, getWidth);
                break;
            case 6:
                printme("---Area of Rhombus---");
                int LargeD = inputNum("Large Diagonal ");
                int SmallD = inputNum("Small Diagonal ");
                areaOfRhombus(LargeD, SmallD);
                break;
            case 7:
                printme("---Grade Average---");
                int midterm = inputNum("Midterm Grade ");
                int finals = inputNum("Finals Grade ");
                initialGrade(midterm, finals);
                break;
            case 8:
                printme("---Initial Velocity---");
                int getVf = inputNum("Final Velocity ");
                int getAcc = inputNum("Acceleration ");
                int gettime = inputNum("Time ");
                initialvelocity(getVf, getAcc, gettime);
                break;
            case 9:
                printme("---Average Speed---");
                int getDistance = inputNum("Distance ");
                int getTime = inputNum("Time ");
                AverageSpeed(getDistance, getTime);
                break;
            case 10:
                printme("---Acceleration Formula---");
                int finalVelocity = inputNum("Final Velocity ");
                int initialVelocity = inputNum("Initial Velocity  ");
                int Timetaken = inputNum("Time ");
                Acceleration(finalVelocity, initialVelocity, Timetaken);
                break;       
        }
    }

    static int inputNum(String msg) {
        Scanner input = new Scanner(System.in);
        System.out.print(msg + ": ");
        int val = input.nextInt();
        return val;
    }

    static void bmi(int weight, int height) {
        double bmi = weight * (height) * 2;
        printme("BMI: " + bmi);
    }

    static void volumeofCube(int width, int length, int height) {
        int vol = width * length * height;
        printme("Volume = " + vol + " cm");
    }

    static void areaOftriangle(int base, int height) {
        int areaOftriangle = (base * height) / 2;
        printme("Area = " + areaOftriangle + " cm");
    }

    static void AreaOfTrapezoid(int LongBase, int ShortBase, int height) {
        int AreaOfTrapezoid = (LongBase + ShortBase) / 2 * height;
        printme("A = " + AreaOfTrapezoid + " cm");
    }

    static void areaOfRhombus(int Largediagonal, int Smalldiagonal) {
        int areaOfRhombus = (Largediagonal * Smalldiagonal) / 2;
        printme("Area = " + areaOfRhombus + " cm");
    }

    static void initialGrade(int midterm, int finals) {
        double initialGrade = (midterm + finals) / 2;
        printme("Average Grade: " + initialGrade);
    }

    static void initialvelocity(int FinalVelocity,
            int Acceleration, int time) {
        int initialvelocity = FinalVelocity - (Acceleration * time);
        printme("Vi = " + initialvelocity + " m/s");
    }

    static void AverageSpeed(int distance, int time) {
        int AverageSpeed = distance / time;
        printme("S = " + AverageSpeed + " mph");
    }

    static void Acceleration(int finalVelocity, int initialVelocity,
            int Timetaken) {
        int Acceleration = finalVelocity - initialVelocity / Timetaken;
        printme("A = " + Acceleration + " m/s");
    }

    static void PerimeterOfRectangle(int Length, int Width) {
        int PerimeterOfRectangle = 2 * (Length + Width);
        printme("P = " + PerimeterOfRectangle + " m");
    }

    static void printme(String Message) {
        System.out.println(Message);
    }
}
