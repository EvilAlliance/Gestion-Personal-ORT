package Model;

import java.util.ArrayList;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class Interview {
    private Interviewer interviewer;
    private Interviewee interviewee;
    private ArrayList<Interviewee> intervieweeList = new ArrayList<>();
    private ArrayList<Interviewer> interviewerList = new ArrayList<>();
    private String interviewScore;
    private String interviewCommentary;
    private static int interviewNumber = 0;

    
    public Interviewer getInterviewer() {
        return this.interviewer;
    }

    public void setInterviewer(Interviewer givenInterviewer) {
        this.interviewer = givenInterviewer;
        this.interviewerList.add(givenInterviewer);
    }
    
    public Interviewee getInterviewee(){
        return this.interviewee;
    }
    
    public void setInterviewee(Interviewee givenInterviewee){
        this.interviewee = givenInterviewee;
        this.intervieweeList.add(givenInterviewee);
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

    public void setInterviewScore(String givenInterviewScore) {
        this.interviewScore = givenInterviewScore;
    }

    public String getInterviewCommentaries() {
        return this.interviewCommentary;
    }

    public void setInterviewCommentaries(String givenInterviewCommentaries) {
        this.interviewCommentary = givenInterviewCommentaries;
    }

    public static int getInterviewNumber() {
        return interviewNumber;
    }
    
    public Interview(Interviewer anInterviewer, Interviewee anInterviewee, String anInterviewScore, String interviewCommentaries){
        this.setInterviewer(anInterviewer);
        this.setInterviewee(anInterviewee);
        this.setInterviewScore(anInterviewScore);
        this.setInterviewCommentaries(interviewCommentaries);
        interviewNumber++;
    }
    
    @Override
    public String toString(){
        return "Entrevistador: " + this.getInterviewer().getName() + "\nEntrevistado: " + this.getInterviewee().getName() + "\nPuntaje: " + this.getInterviewScore() + "\nComentarios: " + this.getInterviewCommentaries();
    }
}
