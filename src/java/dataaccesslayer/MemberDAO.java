/**
 * File: MemberDAO.java
 * Author: Adrianne Huang
 * Date: August 2017
 * Description: An interface for the Member class to update, add, delete, and
 * retrieve member.
 * Implemented using the DAO design pattern.
 */
package dataaccesslayer;

import java.util.ArrayList;
import transferobjects.Member;

public interface MemberDAO {

    ArrayList<Member> getAllMembers();
    //Member getMemberByMemberID(Integer memberId);
    //void updateMember(Member memberId);    
    //void addMember(Member memberId);
    //void deleteMember(Member memberId);    
}
