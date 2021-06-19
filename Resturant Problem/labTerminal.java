
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class labTerminal {

    //Function for inserting the short listed resturants in file
    public static void getShortlistedRestaurants(int N) {
        File listRest = new File("shortlistedRestaurants.txt"); //making of file
        Scanner scan = new Scanner(System.in);
        String[] restArray = new String[N];
        System.out.println("Please Enter the TH ranks.");

        // Loop for adding the TH rank and Location
        for(int i = 0; i < N; i++){

                restArray[i] = scan.nextLine();

        }

        // To add the info in File
        try {
            PrintWriter fileWriter = new PrintWriter("shortlistedRestaurants.txt");
            for(int i = 0; i<N; i++)
                for(int j = 0;j<1;j++){
                    fileWriter.write(restArray[i]+"\n");
                    fileWriter.flush();
                }


        }catch (IOException ex){

        }


    }

    // Function to Get Islamabad Resturants TH rank
    public static int[] getIsbRestaurants(int N) {
        File listRest = new File("shortlistedRestaurants.txt");

        // Some varaibles
        String[] sep;
        int[] numISB = new int[N];
        String cLine = "";

        // To check the read the values of Islamabad
        try{
            Scanner readFile = new Scanner(listRest); //Object which will keep record of Islamabad resturants
            Scanner lineScan = new Scanner(listRest); //Object to check for the values



            for(int i = 0; i < N; i++){
                if(readFile.nextLine().charAt(0) == 'I'){
                    cLine = lineScan.nextLine();
                    sep = cLine.split("\\s+"); //It will seperate the values of Islamabad using Space
                    numISB[i] = Integer.parseInt(sep[1]); //Get the value after space which is TH rank
                    if(numISB[i] > 20 || numISB[i] < 1){
                        System.out.println("You entered wrong Rank. Rank should be in between 1-20.");
                        System.out.println("Re Run the program to fix this:");
                        System.exit(1);
                    }


                }
                else
                    lineScan.nextLine(); //If It gets Rawalpindi Linescan object also moves to next line



            }

        }
        catch (IOException e){

        }
        return numISB;





    }

    //Method to get Rawalpindi values (Read previoous comments to know about this also)
    public static int[] getRwpRestaurants(int N) {
        File listRest = new File("shortlistedRestaurants.txt");
        String[] sep;


        int[] numRWP = new int[N];

        String cLine;
        try{
            Scanner readFile = new Scanner(listRest);
            Scanner lineScan = new Scanner(listRest);



            for(int i = 0; i < N; i++){
                if(readFile.nextLine().charAt(0) == 'R'){
                    cLine = lineScan.nextLine();
                    sep = cLine.split("\\s+");
                    numRWP[i] = Integer.parseInt(sep[1]);
                    if(numRWP[i] > 20 || numRWP[i] < 1){
                        System.out.println("You entered wrong Rank. Rank should be in between 1-20.");
                        System.out.println("Re Run the program to fix this:");
                        System.exit(1);
                    }


                }
                else
                    lineScan.nextLine();



            }

        }
        catch (IOException e){

        }
        return numRWP;




    }

    //Descending order insertion sort Method
    public static int[] desSort(int[] arrNum) {
        int size = arrNum.length;
        for (int i = 1; i < size; i++) {
            int key = arrNum[i];
            int j = i - 1;
            while (j >= 0 && key > arrNum[j]) {

                arrNum[j + 1] = arrNum[j];
                --j;
            }
            arrNum[j + 1] = key;
        }
        return arrNum;

    }

    //Method to print the Final result we get from final file
    public static void getFinalList() {
        File finalRes = new File("finalist.txt");
        System.out.println("The final list is:");
        String finalResult = "";
        try{
            Scanner finalScan = new Scanner(finalRes);
            finalResult = finalScan.nextLine();
            System.out.println(finalResult);


        }
        catch (IOException e){

        }



    }

    //Main Method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        File finalRes = new File("finalist.txt");



        int N;


        System.out.print("Number of Shortlisted Restaurants, N: ");
        N = scan.nextInt();
        int[] arrISB ;
        int[] arrRWP ;

        //ShortList method Call
        getShortlistedRestaurants(N);
        arrISB = getIsbRestaurants(N);
        arrRWP = getRwpRestaurants(N);

        //Insertion Sort Call methods
        arrISB = desSort(arrISB);
        arrRWP = desSort(arrRWP);

        //Combining both sorted arrays
        int[] result = new int[arrISB.length + arrRWP.length];
        System.arraycopy(arrISB, 0 ,result,0,arrISB.length);
        System.arraycopy(arrRWP, 0 ,result,arrISB.length,arrRWP.length);

        // Block of code to remove zeros from array
        int[] finalArray = new int[N];
        int len = 0;
        for(int i = 0; i < result.length ; i++) {
            if (result[i] != 0)
                len++;
        }
        for(int i = 0, j=0; i< result.length; i++)
            if(result[i] != 0){
                finalArray[j] = result[i];
                j++;
            }


        //BLock of code to write final result in file
        try{
            PrintWriter finalWrite = new PrintWriter(finalRes);
            for(int i = 0; i<finalArray.length; i++){

                finalWrite.write(finalArray[i]+ "  ");
                finalWrite.flush();
            }
        }
        catch (IOException e){

        }

        //Method call for printing the result from file
        getFinalList();




    }
}
