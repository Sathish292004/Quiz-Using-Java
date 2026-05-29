import java.util.Scanner;

public class QuestionServices 
{

    Question[] questions = new Question[5];
    String selection[]  = new String[5];

    public QuestionServices() 
    {
        questions[0] = new Question(1, "Which is the capital of India ?", "Mumbai", "Chennai", "New Delhi", "Kolkata", "New Delhi");
        questions[1] = new Question(2, "Which planet is known as the Red Planet ?", "Venus", "Mars", "Jupiter", "Saturn", "Mars");
        questions[2] = new Question(3, "Who is known as the Father of the Nation in India ?", "Jawaharlal Nehru", "Subhas Chandra Bose", "Mahatma Gandhi", "Bhagat Singh", "Mahatma Gandhi");
        questions[3] = new Question(4, "How many continents are there in the world ?", "5", "6", "7", "8", "7");
        questions[4] = new Question(5, "Which is the largest ocean in the world ?", "Indian Ocean", "Atlantic Ocean", "Arctic Ocean", "Pacific Ocean", "Pacific Ocean");

    }

    public void playQuiz()
    {
        int i = 0;
        for(Question q : questions)
        {
            System.out.println("Question no : " + q.getId());
            System.out.println(q.getQuestion());
                Scanner sc = new Scanner(System.in);
                for(String option : q.getOpt())
                {
                    System.out.println(option);
                }
             System.out.println("");
             System.out.print("Enter answer: ");

           
            selection[i] = sc.nextLine();
            i++;
        }
            for(String s : selection)
            {
                System.out.println("Your answer: " + s);
            }       
    }

    public void PrintMarks()
    {
        int marks = 0;
        for(int i = 0; i < questions.length; i++)
        {
           Question que = questions[i];
           String correctAnswer = que.getAnswer();
           String userAnswer = selection[i];

           if(correctAnswer.equals(userAnswer))
           {
            marks++;
           }
        }
        System.out.println("Your total marks: " + marks);
    }

}