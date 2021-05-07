import data.DataCreator;
import data.DataReader;

public class Main {
    public static void main(String[] args) {
        DataReader dataReader = new DataReader();
        List<Training> trainingList = dataReader.createTrainingList();


        DataCreator dataCreator = new DataCreator();
        List<Employee> employeeList = dataCreator.createEmployeeList();
        List<TrainingGroup> trainingGroupList = dataCreator.createTrainingGroupList();
        System.out.println("Employee list este: " + employeeList);
        System.out.println("Training group list este: " + trainingGroupList);
        System.out.println("Training list este: " + trainingGroupList);

        GenerateTrainingGroupFile generateTrainingGroupFile = new GenerateTrainingGroupFile();
        generateTrainingGroupFile.generateTrainingGroupFile("");

    }
}