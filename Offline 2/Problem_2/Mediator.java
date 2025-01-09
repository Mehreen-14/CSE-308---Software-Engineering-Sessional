import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
   public abstract void Send(User user,ResultWithMArksheet rsm);
}
class ExamController extends Mediator{
    private Examiner examiner;
    List<Student> studentList;

    public void setExaminer(Examiner examiner){
        this.examiner = examiner;
    }
    public void setStudents(List<Student> studentList){
        this.studentList = studentList;
    }

    @Override
    public void Send(User user, ResultWithMArksheet rsm) {
        if(user instanceof Student){
            System.out.println("Student Id : "+user.id+" Notified");
            examiner.Notify(rsm);
        }
        else if (user instanceof Examiner){
            if(rsm.marksheets!=null){ //received from examiner
                System.out.println("Result with marksheet received from examiner");
                for (int i=0;i<rsm.resultList.size();i++){
                    System.out.print("<ID,Marks> : ");
                    System.out.println("<"+rsm.resultList.get(i).getStudent_id()+","+rsm.marksheets.get(i)+">");
                    }

                System.out.println("Mistakes");
                for (int i=0;i<rsm.resultList.size();i++){
                    if(rsm.marksheets.get(i)!=rsm.resultList.get(i).getMark()){
                        System.out.print("<ID,previous mark,corrected mark> : ");
                        System.out.println("<"+rsm.resultList.get(i).getStudent_id()+","+rsm.marksheets.get(i)+","+rsm.resultList.get(i).getMark()+">");
                    }
                }

                //individual mark
                ResultWithMArksheet res;
                List<Result> Individual = new ArrayList<>();
                for (int i=0;i<rsm.resultList.size();i++){
                   // System.out.println("Size : "+rsm.resultList.size());
                    res = new ResultWithMArksheet();
                    res.resultList = new ArrayList<>();
                    res.resultList.add(rsm.resultList.get(i));

                    System.out.println("Notification goes to student : "+rsm.resultList.get(i).getStudent_id());
                    studentList.get(rsm.resultList.get(i).getStudent_id()-1).Notify(res);
                }
            }
            else if(rsm.marksheets==null){ //case : recheck
               if(rsm.resultList.get(0).getRecheck().equalsIgnoreCase("No change")){
                    System.out.println("Marks unchanged");
                }
                else if(rsm.resultList.get(0).getRecheck().equalsIgnoreCase("Increase")){
                    System.out.println("Marks increased");
                }
                else if(rsm.resultList.get(0).getRecheck().equalsIgnoreCase("Decrease")){
                   System.out.println("Marks decreased");
               }
                System.out.println("Re-examination goes to student "+rsm.resultList.get(0).getStudent_id());
                studentList.get(rsm.resultList.get(0).getStudent_id()-1).Notify(rsm);

            }

        }
    }
}