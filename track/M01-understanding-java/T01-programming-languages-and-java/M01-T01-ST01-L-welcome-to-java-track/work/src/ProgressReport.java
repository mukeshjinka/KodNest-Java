public class ProgressReport {
public static void main(String[] args) {
int completedtopic = 17;
int Totaltopics = 20;
int Dailylearninghours = 3;
int learningdays = 5;
int remainingtopic = Totaltopics - completedtopic;
int weeklylearninghours = learningdays*Dailylearninghours;
double progressPercentage = ((int)completedtopic*100)/Totaltopics;
System.out.println("Completed Topics: "+completedtopic);
System.out.println("Remaining Topics: "+remainingtopic);
System.out.println("Weekly Learning Hours: "+weeklylearninghours);
System.out.println("Progress Percentage: "+progressPercentage);
    }
}
