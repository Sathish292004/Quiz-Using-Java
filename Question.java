public class Question 
{
    private int id;
    private String question;
    private String[] opt = new String[4];
    private String answer;


    public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) 
    {
        this.id = id;
        this.question = question;
        this.opt[0] = opt1;
        this.opt[1] = opt2;
        this.opt[2] = opt3;
        this.opt[3] = opt4;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOpt() {
        return opt;
    }

    public void setOpt(String[] opt) {
        this.opt = opt;
    }

    public String getOpt1() {
        return opt[0];
    }

    public void setOpt1(String opt1) {
        this.opt[0] = opt1;
    }

    public String getOpt2() {
        return opt[1];
    }

    public void setOpt2(String opt2) {
        this.opt[1] = opt2;
    }

    public String getOpt3() {
        return opt[2];
    }

    public void setOpt3(String opt3) {
        this.opt[2] = opt3;
    }

    public String getOpt4() {
        return opt[3];
    }

    public void setOpt4(String opt4) {
        this.opt[3] = opt4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() 
    {
        return "Question [id=" + id + ", question=" + question + ", opt=" + java.util.Arrays.toString(opt) + ", answer=" + answer + ", getId()=" + getId() + ", getQuestion()=" + getQuestion()
                + ", getOpt()=" + java.util.Arrays.toString(getOpt()) + ", getAnswer()=" + getAnswer() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }
    




    
}
