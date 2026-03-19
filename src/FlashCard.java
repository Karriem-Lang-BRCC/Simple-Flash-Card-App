// Flashcard.java
// This class represents a single flash card.
// Each card has a "question" (Like a Bible verse reference)
// With the "answer" (the verse on the back)

public class FlashCard {

    // Two pieces of data that the flash card holds
    private String question;
    private String answer;

    // Constructor: this runs when we create a new FlashCard object.
    public FlashCard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }//end constructor

    //Getter for answer
    public String getAnswer() {
        return answer;
    }

    //Getter for question
    public String getQuestion() {
        return question;
    }//end getQuestion

    //Setter for question
    public void setQuestion(String question) {
        this.question = question;
    }

    //Setter for answer
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
