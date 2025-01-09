import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class User {
    protected Mediator mediator;
    protected int id;
    public User(Mediator _mediator) {
        mediator = _mediator;
    }
    public User(Mediator _mediator,int id){
        mediator = _mediator;
        this.id = id;
    }

    public abstract void Notify(ResultWithMArksheet resultWithMArksheet);
}

class Student extends User{
    private Result result;
    public Student(Mediator _mediator, int id) {
        super(_mediator, id);
    }

    @Override
    public void Notify(ResultWithMArksheet resultWithMArksheet) {
        System.out.println("Student Side : notified; ID : "+id);
        result = resultWithMArksheet.resultList.get(0);
        result.ResultPublish();
    }

    public void Re_Examine_Request(int id){
        ResultWithMArksheet resultWithMArksheet = new ResultWithMArksheet();
        List<Result> results = new ArrayList<>();
        result.setStudent_id(id);
        results.add(result);
        resultWithMArksheet.resultList = results;
        System.out.println("re-examination request sent from student id "+id);
        mediator.Send(this,resultWithMArksheet);
    }
}
class Examiner extends User{
    private Result result;
    public Examiner(Mediator _mediator) {
        super(_mediator);
    }

    @Override
    public void Notify(ResultWithMArksheet resultWithMArksheet) {
        System.out.println("Examiner Notified : Re_examination");
        result = resultWithMArksheet.resultList.get(0);

        if(result!=null){
            Random random = new Random();
            int randomno = random.nextInt(3);
            int change = random.nextInt(5)+1;
            List<Result> results = new ArrayList<>();
            if(randomno==0){
                //no change
                System.out.println("No Change");
                result.setRecheck("No Change");
            }
            else if(randomno==1){
                //increase
                result.setMark(result.getMark()+change);
                if(result.getMark()>100)
                    result.setMark(100);
                System.out.println("Increase");
                result.setRecheck("Increase");
            }
            else if(randomno==2){
                //decrease
                result.setMark(result.getMark()-change);
                if(result.getMark()<33)
                    result.setMark(33);
                System.out.println("Decrease");
                result.setRecheck("Decrease");
            }
            ResultWithMArksheet rwm = new ResultWithMArksheet();
            results.add(result);
            rwm.resultList = results;
            System.out.println("Examiner Re-examined");
            mediator.Send(this,rwm);
        }
    }

    public void sendResult(List<Result> results){
        ResultWithMArksheet resultWithMArksheet = new ResultWithMArksheet();
        List<Integer> marks = new ArrayList<>();

        Random random = new Random();
        int change = random.nextInt(5)+1;
        for (int i=0;i< results.size();i++){
            int ran = random.nextInt(5);
            if (ran%2==0){
                marks.add(results.get(i).getMark());//no mistake
            }
            else {
                marks.add(results.get(i).getMark()+change);//mistake
            }
        }
        resultWithMArksheet.resultList = results;
        resultWithMArksheet.marksheets = marks;
        System.out.println("Examiner sent results");
        mediator.Send(this,resultWithMArksheet);
    }
}