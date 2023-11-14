package Model;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class Interview {
    private Interviewer interviewer;
    private Interviewee interviewee;
    private String interviewScore;
    private String interviewCommentary;
    private static int interviewNumber = 0;

    
    public Interviewer getInterviewer() {
        return this.interviewer;
    }

    public void setInterviewer(Interviewer givenInterviewer) {
        this.interviewer = givenInterviewer;
    }
    
    public Interviewee getInterviewee(){
        return this.interviewee;
    }
    
    public void setInterviewee(Interviewee givenInterviewee){
        this.interviewee = givenInterviewee;
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
    
    public static String verifyInterviewee(Interviewee interviewee){
        return (interviewee != null) ? "Entrevistado valido" : "No existe ningun entrevistado con esos datos";
    }
    
    public static String verifyInterviewer(Interviewer interviewer){
        return (interviewer != null) ? "Entrevistador valido" : "No existe ningun entrevistador con esos datos";
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
