
public class Main
{
	public static void main(String[] args) 
	{
	    
	    LinkedInUser nonPremium =new NonPremiumLinkedInUser(97,"omkar","omkar@gmail.com","******9008","I am a student at CBIT");
	    LinkedInUser premium =new PremiumLinkedInUser(105,"saiteja","saiteja@gmail.com","******9007","I am a student at CBIT");
	    System.out.println("NonPremiumLinkedInUser call for getdetails");
	    System.out.println(nonPremium.getDetailsById(115));
	    System.out.println("******************************************************************");
	    
	    System.out.println("PremiumLinkedInUser call for getdetails");
	    System.out.println(premium.getDetailsById(115));
	}
}
 abstract class LinkedInUser
{
    private long userId;
    private String  name;
    private String mobile_number;
    private String email;
    private String about;
    private boolean isPremiumMember;
    
    //verification class is a custom class  which has methods for various kinds of verification
    //private verificationClass verify = new verificationClass();
    
    
    public LinkedInUser(long userId,String name,String email,String mobile_number,String about)
    {
        this.userId=userId;
        this.name=name;
        this.email=email;
        this.mobile_number=mobile_number;
        this.about=about;
    }
    
    // The following method is used to display the profile details of the user with userid  userId .
    
    abstract public String getDetailsById(long userId /*this is the userid of the user whose  profile we are interested in*/);
    
    
    public void  setEmail(String email)
    {
        /*boolean canChange=verify.verifyMail(email)
        if(canChange)
        {
            this.email=email;
              System.out.print("Successfully updated the email ");
        }
        else    
            System.out.print("We cannot update the email as we can't verify the new mailid to be yours");*/
        this.email=email;
    }
    
    public void setMobileNumber(String mobile_number)
    {
       /* boolean canChange=verify.verifyMobile(mobile_number)
        if(canChange)
        {
            this.mobile_number=mobile_number];
              System.out.print("Successfully updated the mobile number ");
        }
        else    
            System.out.print("We cannot update the mobile number as we can't verify the new mobile number  to be yours");
        */
        this.mobile_number=mobile_number;
    }
    
     public void setName(String name)
    {
        this.name=name;
    }
    
    public void setAbout(String about)
    {
        this.about=about;
    }
     public String getName()
    {
       return name;
    }
    
    public String getAbout()
    {
        return about;
    }
    public String getMobile()
    {
       return mobile_number;
    }
     public String getEmail()
    {
       return email;
    }
    public long getUserId()
    {
        return userId;
    }
    
}
class NonPremiumLinkedInUser extends LinkedInUser 
{
    
    public NonPremiumLinkedInUser(long userId,String name,String email,String mobile_number,String about)
    {
        super(userId,name,email,mobile_number,about);
        //isPremiumMember=false;
    }
     public String getDetailsById(long userId )
    {
        // As database conectivity is not the primary goal of this assignment ,Assume database class to be a database.
        database db =new database();
        LinkedInUser user =db.getDetails(userId);
        String details;
        details="user_name: "+user.getName()+"\nemail: "+user.getEmail()+"\nmobile number: "+user.getMobile()+"\n about the user: "+user.getAbout()+"\n";
        /*
            Database entry code......
        */
        System.out.print("\nupdated the database that a user with userid "+ getUserId() +" has viewed the profile of user with userid "+userId+"\n");
        return details;
    }
}
class PremiumLinkedInUser extends LinkedInUser
{
    public PremiumLinkedInUser(long userId,String name,String email,String mobile_number,String about)
    {
         super(userId,name,email,mobile_number,about);
        //isPremiumMember=true;
    }
    public String getDetailsById(long userId)
    {
        database db =new database();
        LinkedInUser user =db.getDetails(userId);
        String details;
        /*
            No database code is required as the user is a premium linkedin user.
        */
        System.out.println("No updation in the database is required as the current user is a premium user.");
        details="user_name: "+user.getName()+"\nemail: "+user.getEmail()+"\nmobile number: "+user.getMobile()+"\n about the user: "+user.getAbout()+"\n";
        return details;
    }
}
class database{
    
    public LinkedInUser getDetails(long userId)
    {
        return new NonPremiumLinkedInUser(userId,"vineel","vineel_chamakuri@epam.com","******8331","I am currently working as an intern in EPAM SYSTEMS.");
    }
}