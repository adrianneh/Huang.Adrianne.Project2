/**
 * File: MemberDAOImpl.java
 * Author: Adrianne Huang
 * Date: August 2017
 * Description: A class to update, add, and delete addresses in a table.
 */
package dataaccesslayer;
import transferobjects.Member;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class MemberDAOImpl implements MemberDAO {

    /**
     * Returns all the members in the Members database.
     * @return list of members
     */
    @Override
    public ArrayList<Member> getAllMembers(){
        Statement statement = null;
        Connection connection = null;
        ResultSet result = null;
        ArrayList<Member> members = new ArrayList<Member>();
        String query = "SELECT * FROM members";
        DataSource source = new DataSource() ;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            connection = source.createConnection();
            statement = connection.createStatement();
            result = statement.executeQuery(query);
            Member member = null;

            while (result.next()){
                member = new Member();
                member.setMemberId(result.getInt("MemberID"));
                member.setIsAdmin(result.getInt("IsAdmin"));
                member.setAlias(result.getString("Alias"));    
                member.setFirstName(result.getString("FirstName"));
                member.setLastName(result.getString("LastName"));   
                member.setEmail(result.getString("Email"));    
                member.setUserName(result.getString("UserName"));  
                member.setPassword(result.getString("Password"));    
                member.setSalt(result.getString("Salt"));
                members.add(member);
            }
        }
        catch (SQLException exception) {
            exception.printStackTrace();
        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
        finally{
            try{ 
                if(statement != null){ 
                    statement.close(); 
                }
            }
            catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
            try{ 
                if(connection != null){ connection.close(); 
                }
            }
            catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
	}
        return members;        
    }
    
    /**
     * Return the member with the memberId from the Members database.
     * @param memberId
     * @return member with the memberId
     
    @Override
    public Member getMemberByMemberID(Integer memberId){    
    }
    
    /**
     * Adds the member to the Members database.
     * @param mem 
    
    @Override
    public void addMember(Member mem){
    }
     
    /**
     * Deletes the member from the Members database.
     * @param member 
     
    @Override
    public void deleteMember(Member member){
    }
    */
}