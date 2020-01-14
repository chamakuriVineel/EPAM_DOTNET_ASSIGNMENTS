
/*
I tried make a toy implementation of the game I play frequently whose name is  PYSCH.This game has inheritance and composition
in it so I tried to implement those two concepts in the context of this game
It is multiplayer game .In this game a person starts a game by requesting a space to play.The system will generate a gamecode and
gives it to the gameleader(player who requests for space)to share to the players. The player would join the game with the help of game code 
and play the game.A game consists of rounds and each round consists of questions.
*/
import java.util.*;
public class Inheritance_Composition
{
	public static void main(String[] args)
	{
	    //creating round questions.
	    ArrayList<Question> roundQuestions=new ArrayList<>(2);
	    roundQuestions.add(new Question("what is full form of JIT","Just In Time compiler"));
	    roundQuestions.add(new Question("what is the capital of India","New Delhi"));
	    //creating questions for QuestionApprover
	    ArrayList<Question> approverQuestions=new ArrayList<>(2);
	    approverQuestions.add(new Question("what is full form of JVM","Java Virtual machine"));
	    approverQuestions.add(new Question("what is meant by CAA","citizenship ammendment act"));
	    //creating a Round
	    ArrayList<Round> round =new ArrayList<>();
	    
	    round.add(new Round(1000,roundQuestions));
	    //creating Players
	    ArrayList<Player> players=new ArrayList<>();
	    players.add(new Player(115,"vineel","******8331"));
	    players.add(new Player(116,"vineeth","******4382"));
	    players.add(new Player(105,"saiteja","******8796"));
	    Player leader=new Player(97,"omkar","******6574");
	    //creating Game
	    Game game=new Game("cool iron",players,leader,round);
	    //creating QuestionApprover
	    QuestionApprover approver=new QuestionApprover(103,"aditya","******5230");
	    approver.approveQuestion(approverQuestions.get(0));
	    approver.rejectQuestion(approverQuestions.get(1));
	    
	    
	    System.out.println("\nthe Game code is "+ game.getGameCode()+" with gameLeader as "+game.getGameLeader()+"\n with players as "+ game.getPlayers());
	    
	    System.out.println("The questions in game round are "+ game.getRounds().get(0).getQuestions());
		System.out.println("The profile of QuestionApprover is\n name:"+ approver.getName()+"\n mobile number: "+approver.getMoileNumber()+"\n approved questions "+approver.getAcceptedQuestions()+"\n rejected questions"+ approver.getRejectedQuestions());
	}
	
	
}
class Game
{
    //composition
    private ArrayList<Round> rounds;
    private String gameCode;
    //composition
    private ArrayList<Player> players;
    private Player gameLeader;
    public Game(String gameCode,ArrayList<Player>players,Player gameLeader,ArrayList<Round> rounds)
    {
        this.rounds=rounds;
        this.gameCode=gameCode;
        this.gameLeader=gameLeader;
        this.players=players;
    }
    public String getGameLeader()
    {
        String details="\nname: "+gameLeader.getName()+"\n mobile_number: "+gameLeader.getMoileNumber();
        return details;
    }
    public String getGameCode()
    {
        return gameCode;
    }
    public String getPlayers()
    {
        String details="";
        for(int i=0;i<players.size();i++)
        {
            details+="\nname: "+players.get(i).getName()+"\n mobile_number "+players.get(i).getMoileNumber();
        }
        return details;
    }
    public ArrayList<Round>  getRounds()
    {
        
        return rounds;
    }
    
}
class person
{
    private long id;
    private String name;
    private String mobile_number;
    public person(long id,String name,String mobile_number)
    {
        this.id=id;
        this.name=name;
        this.mobile_number=mobile_number;
    }
    public String getName()
    {
        return name;
    }
    public String getMoileNumber()
    {
        return mobile_number;
    }
    public long getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setMobileNumber(String mobile_number)
    {
        this.mobile_number=mobile_number;
    }
}
//inheritance
class Player extends person
{
    private int gamesPlayed;
    private int pysched;
    private int pyschedOthers;
    
    public Player(long id,String name,String mobile_number)
    {
        super(id,name,mobile_number);
        gamesPlayed=0;
        pyschedOthers=0;
        pysched=0;
    }
    public int getGamesPlayed()
    {
        return gamesPlayed;
    }
    public int getPysched()
    {
        return pysched;
    }
    public int getPyschedOthers()
    {
        return pyschedOthers;
    }
    public void setGamesPlayed(int gamesPlayed)
    {
        this.gamesPlayed=gamesPlayed;
    }
    public void setPsyched(int pysched)
    {
        this.pysched=pysched;
    }
    public void setPyschedOthers(int pyschedOthers)
    {
        this.pyschedOthers=pyschedOthers;
    }
}
//inheritance
class QuestionApprover extends person
{
    private ArrayList<Question> acceptedQuestions;
    private ArrayList<Question> rejectedQuestions;
    public QuestionApprover(long id,String name,String mobile_number)
    {
        super(id,name,mobile_number);
        acceptedQuestions=new ArrayList<Question>();
        rejectedQuestions=new ArrayList<Question>();
    }
    public void approveQuestion(Question question)
    {
        acceptedQuestions.add(question);
    }
    public void rejectQuestion(Question question)
    {
        rejectedQuestions.add(question);
    }
    public String  getAcceptedQuestions()
    {
        String details="";
        for(int i=0;i<acceptedQuestions.size();i++)
        {
            
            details+="\nQuestion "+i+" "+acceptedQuestions.get(i).getQuestion()+"\n Answer: "+acceptedQuestions.get(i).getAnswer();
        }
        return details;
    }
    public String getRejectedQuestions(){
        String details="";
        for(int i=0;i<rejectedQuestions.size();i++)
        {
            
            details+="\nQuestion "+i+" "+rejectedQuestions.get(i).getQuestion()+"\n Answer: "+rejectedQuestions.get(i).getAnswer();
        }
        return details;
    }
}
class Question
{
    //we could also include the QuestionApprover as an attirbute here 
    //which tells who has approved this question.That comes under composition but I am not including it here to reduce the complexity.
    private long id;
    private String questionText;
    private String answerText;
    public Question(String questionText,String answerText)
    {
        this.questionText=questionText;
        this.answerText=answerText;
    }
    public String getQuestion()
    {
        return questionText;
    }
    public String getAnswer()
    {
        return answerText;
    }
    public long getId()
    {
        return id;
    }
}
class Round
{
    private long id;
    private ArrayList<Question> questions;
    public Round(long id,ArrayList<Question> questions)
    {
        this.id=id;
        this.questions=questions;
    }
    public String  getQuestions()
    {
        String details="";
        for(int i=0;i<questions.size();i++)
        {
            details+="\nQuestion "+i+" "+questions.get(i).getQuestion()+"\n Answer: "+questions.get(i).getAnswer();
        }
        return details;
    }
        
}
