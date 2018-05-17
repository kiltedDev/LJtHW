import java.util.Scanner;

class TemperatureSample {
  int month, day, year;
  double temperature;
}

public class TemperaturesByDate {
  public static void main(String[] args) throws Exception {
    String site = "http://academic.udayton.edu/kissock/http/Weather";
    String path = "/gsod95-current/PAPHILAD.txt";
    Scanner inFile = new Scanner((new java.net.URL(site+path)).openStream());

    TemperatureSample[] tempDB = new TemperatureSample[10000];
    int numRecords, i = 0, m = 1;
    String monthName;

    while (inFile.hasNextInt() && i < tempDB.length) {
      TemperatureSample e = new TemperatureSample();
      e.month = inFile.nextInt();
      e.day   = inFile.nextInt();
      e.year  = inFile.nextInt();
      e.temperature = inFile.nextDouble();
      if (e.temperature == -99 )
        continue;
      tempDB[i] = e;
      i ++;
    }
    inFile.close();
    numRecords = i;

    System.out.println(numRecords + " daily temperatures loaded.");

    double total = 0, avg;
    int count = 0;
    for ( i=0; i<numRecords; i++ ) {
      if ( tempDB[i].month == 11 ) {
        total += tempDB[i].temperature;
        count++;
      }
    }

    avg = total / count;
    avg = roundToOneDecimal(avg);
    System.out.print("Average daily temperature over " + count);
    System.out.println(" days in November: " + avg);

    int warmestMonth = 0;
    double warmestAvg = 0;
    for (m=1; m<13; m++) {
      total = 0;
      count = 0;
      for ( i=0; i<numRecords; i++ ) {
        if ( tempDB[i].month == m ) {
          total += tempDB[i].temperature;
          count++;
        }
      }

      avg = total / count;
      avg = roundToOneDecimal(avg);
      if (avg>warmestAvg) {
        warmestMonth = m;
        warmestAvg = avg;
      }
    }

    switch(warmestMonth) {
      case 1: monthName = "January";
              break;
      case 2: monthName = "February";
              break;
      case 3: monthName = "March";
              break;
      case 4: monthName = "April";
              break;
      case 5: monthName = "May";
              break;
      case 6: monthName = "June";
              break;
      case 7: monthName = "July";
              break;
      case 8: monthName = "August";
              break;
      case 9: monthName = "September";
              break;
      case 10: monthName = "October";
              break;
      case 11: monthName = "November";
              break;
      case 12: monthName = "December";
              break;
      default: monthName = "error";
    }

    System.out.print("The warmest month in Philadelphia was " + monthName);
    System.out.println(" with a temperature of: " + warmestAvg);
  }

  public static double roundToOneDecimal( double d) {
    return Math.round(d*10)/10.0;
  }
}
