import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ComputingStatistics {
   /**
   * The ArrayList containing all of the loan data.
   */
   private ArrayList<Loan> data;
   
   /**
    * Creates a new ComputingStatistics object with an empty ArrayList 
    */
   public ComputingStatistics() {
      data = new ArrayList<Loan>();
   }
   
   /**
    * Creates a new ComputingStatistics object with the data passed in
    */
   public ComputingStatistics(ArrayList<Loan> d) {
      data = d;
   }
   
   /**
    * Calclates the total amount funded from all of the loans in the file.
    * @return the total loan amount.
    */
   public double totalAmount() {
      double amount = 0.0;
      for(int i = 0; i < data.size(); i++) {
         amount = amount + data.get(i).getLoanAmount();
      }
      return amount;
   }

   //returns the average loan amount
   public double avgLoan() {
      double amount = 0.0;
      for(int i = 0; i < data.size(); i++) {
         amount = amount + data.get(i).getLoanAmount();
      }
      return amount/data.size();
   }

   //returns largest loan
   public double largestLoan() {
     //set int largest to 0
     int largest = 0;
     //for loop from 1 to data.size()-1 (i as control variable)
     for(int i = 1; i < data.size(); i++) {
       //if data.get(i).getLoanAmount() is greater than data.get(largest).getLoanAmount()
       if(data.get(i).getLoanAmount() > data.get(largest).getLoanAmount()) {
         //set largest to i
         largest = i;
       }
     }
     //return data.get(largest)
     return data.get(largest).getLoanAmount();
   }

   //returns smallest loan
   public double smallestLoan() {
     //set int least to 0
     int least = 0;
     //for loop from 1 to data.size()-1 (i as control variable)
     for(int i = 1; i < data.size(); i++) {
       //if data.get(i).getLoanAmount() is less than data.get(least).getLoanAmount()
       if(data.get(i).getLoanAmount() < data.get(least).getLoanAmount()) {
         //set least to i
         least = i;
       }
     }
     //return data.get(least)
     return data.get(least).getLoanAmount();
   }
   
   //returns the country with the largest loan
   public String largestLoanCountry() {
     //set int largest to 0
     int largest = 0;
     //for loop from 1 to data.size()-1 (i as control variable)
     for(int i = 1; i < data.size(); i++) {
       //if data.get(i).getLoanAmount() is greater than data.get(largest).getLoanAmount()
       if(data.get(i).getLoanAmount() > data.get(largest).getLoanAmount()) {
         //set largest to i
         largest = i;
       }
     }
     //return data.get(largest)
     return data.get(largest).getCountry();
   }

   //returns the country with the smallest loan
   public String smallestLoanCountry() {
     //set int least to 0
     int least = 0;
     //for loop from 1 to data.size()-1 (i as control variable)
     for(int i = 1; i < data.size(); i++) {
       //if data.get(i).getLoanAmount() is less than data.get(least).getLoanAmount()
       if(data.get(i).getLoanAmount() < data.get(least).getLoanAmount()) {
         //set least to i
         least = i;
       }
     }
     //return data.get(least)
     return data.get(least).getCountry();
   }
   
   //returns average days to fund
   public double avgDaysToFund() {
      double amount = 0.0;
      for(int i = 0; i < data.size(); i++) {
         amount = amount + data.get(i).getDaysToFund();
      }
	   //return total/data.size()
     return amount/data.size();
   }
   
   //returns largest loan in Kenya
   public double largestLoanKenya() {
     //set int max to 0
     int max = 0;
     //for loop from 0 to data.size()-1 (i as control variable)
     for(int i = 0; i < data.size(); i++) {
       //if loan at i is from Kenya
       if(data.get(i).getCountry().equals("Kenya")) {
         //if loan at i is greater than max
         if(data.get(i).getLoanAmount() > data.get(max).getLoanAmount()) {
           //set max to current loan
           max = i;
         }
       }
     }
     //return max
     return data.get(max).getLoanAmount();
   }
   
   //returns the average loan in Philippines
   public double avgLoanPhilippines() {
     //set int total to 0
     double total = 0;
     //set int amt to 0
     int amt = 0;
     //for loop from 0 to data.size()-1 (i as control variable)
     for(int i = 0; i < data.size(); i++) {
       //if loan is from Philippines
       if(data.get(i).getCountry().equals("Philippines")) {
	       //increment amt by 1
         amt++;
         //increment total by data.get(i).getLoanAmount()
         total += data.get(i).getLoanAmount();
       }
     }
	   //return total/amt
     return total/amt;
   }
   
   //returns the country of the longest funding loan
   public String longestToFundCountry() {
     //set int largest to 0
     int largest = 0;
     //for loop from 1 to data.size()-1 (i as control variable)
     for(int i = 1; i < data.size(); i++) {
       //if data.get(i).getDaysToFund() is greater than data.get(largest).getDaysToFund()
       if(data.get(i).getDaysToFund() > data.get(largest).getDaysToFund()) {
         //set largest to i
         largest = i;
       }
     }
     //return data.get(largest).getCountry()
     return data.get(largest).getCountry();
   }

   //returns variance
   public double variance() {
	   //set int mean to 0
     double mean = 0;
	   //for loop from 0 to data.size()-1 (i as control variable)
     for(int i = 0; i < data.size(); i++) {
	     //increment mean by data.get(i).getLoanAmount()
       mean += data.get(i).getLoanAmount();
     }
	   //set mean to mean/data.size()
     mean = mean/data.size();
	   //set int sumSquares to 0
     double sumSquares = 0;
	   //for loop from 0 to data.size()-1 (j as control variable)
     for(int j = 0; j < data.size(); j++) {
	     //increment sumSquares by (data.get(j).getLoanAmount() - mean) squared
       sumSquares += Math.pow(data.get(j).getLoanAmount() - mean, 2);
     }
 	   //return sumSquares/data.size()
     return sumSquares / data.size();
   }

   //returns standard deviation
   public double standardDeviation() {
     //set int mean to 0
     double mean = 0;
	   //for loop from 0 to data.size()-1 (i as control variable)
     for(int i = 0; i < data.size(); i++) {
	     //increment mean by data.get(i).getLoanAmount()
       mean += data.get(i).getLoanAmount();
     }
	   //set mean to mean/data.size()
     mean = mean/data.size();
	   //set int sumSquares to 0
     double sumSquares = 0;
	   //for loop from 0 to data.size()-1 (j as control variable)
     for(int j = 0; j < data.size(); j++) {
	     //increment sumSquares by (data.get(j).getLoanAmount() - mean) squared
       sumSquares += Math.pow(data.get(j).getLoanAmount() - mean, 2);
     }
     //return the sqrt of data.variance()
     return Math.sqrt(sumSquares / data.size());
   }
}