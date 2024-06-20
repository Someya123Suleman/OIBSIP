import java.util.Scanner;
public class OnlineExam{
    public static void main(String[] args) {
        String[][] questions ={
            {"What is the capital of France?","Paris"},
            {"Which planet is known as the Red planet?","Mars"},
            {"Who wrote 'Romeo and Juliet'?","William Shakespeare"}};
            int score=0;
            Scanner scanner=new Scanner(System.in);
            System.out.println("Welcome to the online exam!");
            System.out.println("Answer the following questions:");
            for(int i=0; i<questions.length;i++){
                String question=questions[i][0];
                String correctAnswer=questions[i][1];
                System.out.println((i + 1)+". "+question);
                System.out.println("Your answer:");
                String userAnswer=scanner.nextLine();
                if(userAnswer.equalsIgnoreCase(correctAnswer)){
                    System.out.println("correct!");
                    score++;
                }
                else{
                    System.out.println("Incorrect.The correct answer is:" +correctAnswer);
                }
                System.out.println();

            }
            System.out.println("Exam completed!");
            System.out.println("Your score:"+score +"out of"+questions.length);
            scanner.close();

        }
    }
}