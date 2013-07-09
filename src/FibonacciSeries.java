
public class FibonacciSeries {

    private int FirstFibonacciNumber;
    private int SecondFibonacciNumber;
    private int CurrentFibonacciNumber;

    FibonacciSeries()
      {
          FirstFibonacciNumber=0;
          SecondFibonacciNumber=1;
          CurrentFibonacciNumber=0;
      }
    public int generateFibonacciNumberForTheGivenPosition(int position) {

        int i=2;
        if(position==1)
        CurrentFibonacciNumber= FirstFibonacciNumber;
        if(position==2)
        CurrentFibonacciNumber=SecondFibonacciNumber;
        else
        {
             while(i <position)
                {
                    CalculateFibonacciNumber();
                    i++;

                  }
        }
        return CurrentFibonacciNumber;
    }

    private void CalculateFibonacciNumber() {
        CurrentFibonacciNumber=FirstFibonacciNumber+SecondFibonacciNumber;
        FirstFibonacciNumber=SecondFibonacciNumber;
        SecondFibonacciNumber=CurrentFibonacciNumber;
    }

}