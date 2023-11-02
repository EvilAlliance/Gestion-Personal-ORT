package dominio;

import java.util.ArrayList;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class Interview extends Verifiers{
    private Interviewer interviewer;
    private ArrayList<Interviewee> intervieweeList;
    private ArrayList<Interviewer> interviewerList;
    private String interviewScore;
    private String interviewCommentary;
    private static int interviewNumber = 0;

    
    public Interviewer getInterviewer() {
        return this.interviewer;
    }

    public boolean setInterviewer(Interviewer givenInterviewer) {
        this.interviewer = givenInterviewer;
        this.interviewerList.add(givenInterviewer);
        
        return !containsNumbers(givenInterviewer.getName()) && containsCharacters(givenInterviewer.getName());
    }
    /*
    public ArrayList<Interviewee> getIntervieweeList() {
        return this.intervieweeList;
    }
    
    public ArrayList<Interviewer> getInterviewerList() {
        return this.interviewerList;
    }
    */
    private void addInterviewee(Interviewee anInterviewee) {
        this.intervieweeList.add(anInterviewee);
    }
    
    private void addInterviewer(Interviewer anInterviewer) {
        this.interviewerList.add(anInterviewer);
    }

    public String getInterviewScore() {
        return this.interviewScore;
    }

    public boolean setInterviewScore(String givenInterviewScore) {
        this.interviewScore = givenInterviewScore;
        
        return givenInterviewScore.length() == 1 && !containsCharacters(givenInterviewScore) && containsNumbers(givenInterviewScore);
    }

    public String getInterviewCommentaries() {
        return this.interviewCommentary;
    }

    public boolean setInterviewCommentaries(String givenInterviewCommentaries) {
        this.interviewCommentary = givenInterviewCommentaries;
        
        return givenInterviewCommentaries.length() == 1  && !containsNumbers(givenInterviewCommentaries.split(" ")[0]); 
    }

    public static int getInterviewNumber() {
        return interviewNumber;
    }
    
    public Interview(Interviewer anInterviewer, String anInterviewScore, String interviewCommentaries){
        this.setInterviewer(anInterviewer);
        this.setInterviewScore(anInterviewScore);
        this.setInterviewCommentaries(interviewCommentaries);
        interviewNumber++;
    }
    
    /* realmente quiero q cuando c inicialize sin ningun dato me cambie el numero de la entrevista?
    public Interview(){
        interviewNumber++;
    }
    */
}
