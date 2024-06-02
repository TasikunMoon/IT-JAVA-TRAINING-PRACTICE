package constructor.topic;

public class CostcoSignup {

public String emailAddress;
public String password;
public String confirmPassword;
public int membership;
public int cell;
    public CostcoSignup(String emailAddress, String password, String confirmPassword){
        this.emailAddress = emailAddress;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public CostcoSignup(String emailAddress, String password, String confirmPassword, int membership){

        this.emailAddress = emailAddress; // here this emailAddress field variable and only emailAddress local variable
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.membership = membership;
    }

    public CostcoSignup(String emailAddress, String password, String confirmPassword, int cell, int membership){

        this.emailAddress = emailAddress;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.membership = membership;
        this.cell = cell;
    }
    //Constructor overloading
/* when you declare a constructor lets szee 3 constructor same name
but different parameters for example 1st one default 2nd one 2 parameters
and 3rd one more or less different parameters there will be satisfying
overloading construction.
 */

}
