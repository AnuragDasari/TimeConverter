/**
* @author  Anurag Dasari // 
* ITSC1212 - 001, Mazumder
* @version 1.0 // add .1 for each update
* @since   2021-02-22 // date last updated
* Project 1B(M1-M4)
* This application is time conversion program.
*/
public class TimeConversion {
    
    /**
     * Constructor
     */
    TimeConversion(){

    }


    /**
     * Given a number of seconds calculates 
     * and display decaseconds
    */
    public void showDecaseconds(int numSeconds){
        double decaSeconds = numSeconds * 10.0;                                                //Formula to convert seconds to decaseconds
        System.out.println();
        System.out.println("A decasecond is 10 seconds");                                      //Description of decasecond   
        System.out.println("The number of decaseconds in given seconds are: "+decaSeconds);    //Displays result in decaseconds 
        System.out.println();
    }    // end method


    /**
     * Given a number of seconds calculates 
     * and display jiffies
    */
    public void showJiffies(int numSeconds){
        double jiffies = numSeconds * 100.0;                                           //Formula to convert seconds to jiffies
        System.out.println("A jiffy is a unit of time used in computer operating systems. It is 10 milliseconds."); //Description of jiffy
        System.out.println("The number of jiffies in given seconds are: "+jiffies);    //Displays result in jiffies
        System.out.println();
    }    // end method

    /** 
     * Given a number of seconds calculates 
     * and display New York minutes
    */
    public void showNewYorkMinutes(int numSeconds){
        double NewYorkMinutes = numSeconds * (1/20.0);                                                      //Formula to convert seconds to NewYork minutes
        System.out.println("A new york minute is the period of time between the traffic lights turning green and the cab behind you honking. It is 1/20th of 1 second."); //Description of New York minutes
        System.out.println("The number of New York minutes in given seconds are: "+NewYorkMinutes);         //Displays result in NewYork minutes
        System.out.println();
    }   // end method
    /**
     * Given a number of seconds calculates 
     * and display Nanocenturies
    */ 
    public void showNanoCenturies(int numSeconds){
        double nanoCenturies = numSeconds / 3.156;                                                   //Formula to convert seconds to Nano Centuries
        System.out.println("A nanocentury is a computing measurement coined from the expression -  "+"never to let the user wait more than a few nanocenturies for a response."+" It is 3.156 seconds."); //Description of Nano centuries
        System.out.println("The number of Nano Centuries in given seconds are: "+nanoCenturies);     //Displays result in Nano Centuries
        System.out.println();
    }   // end method

     /**
     * Given a number of seconds calculates 
     * and display Scaramuccis
    */ 
    public void showScaramuccis(int numSeconds){
        double scaramuccis = numSeconds / 950400.0;                                            //Formula to convert seconds to Scaramuccis
        System.out.println("A scaramucci is the tenure of former White House Communications Director Anthony Scaramucci. It is 11 days."); //Description of Scaramuccis
        System.out.println("The number of scaramuccis in given seconds are: "+scaramuccis);    //Displays result in Scaramuccis
        System.out.println();
    }   // end method 



    
}//end class