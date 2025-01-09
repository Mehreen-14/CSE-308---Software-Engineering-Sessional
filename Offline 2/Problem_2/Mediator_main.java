import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Mediator_main {
    public static void main(String[] args) {
        Random random = new Random();
        ExamController examController = new ExamController();
        Examiner examiner = new Examiner(examController);
        List<Student> studentList = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for (int i=0;i<5;i++){
            studentList.add(new Student(examController,i+1));
        }
        examController.setExaminer(examiner);
        examController.setStudents(studentList);

        List<Result> results = new ArrayList<>();
        for (int i=0;i<5;i++){
            int min=70;
            int max=100;
            int mark =(int)(Math.random()*(max-min+1)+min);
            results.add(new Result(i+1,mark));
        }
        examiner.sendResult(results);
        String op;

        while(true){
            System.out.println("Re_examine? y/n");
            op=input.next();
            if(op.equalsIgnoreCase("y")){
                System.out.println("ID:");
                int id=input.nextInt();
                    if(id>=1 && id<=5){
                        studentList.get(id-1).Re_Examine_Request(id);
                        //System.out.println("ok");
                    }
                    else {
                        System.out.println("Wrong id");
                    }

            }
            else if(op.equalsIgnoreCase("n")){
                System.out.println("Result system exits");
                break;
            }
            else{
                System.out.println("Invalid input....");
            }
        }
    }
}
