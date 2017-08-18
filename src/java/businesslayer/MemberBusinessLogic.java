/**
 * File: MemberBusinessLogic.java
 * Name: Adrianne Huang
 * Date: August 2017
 * Description: A class to get all members from the members table.
 */
package businesslayer;

import transferobjects.Member;
import dataaccesslayer.MemberDAO;
import dataaccesslayer.MemberDAOImpl;

import java.util.ArrayList;

public class MemberBusinessLogic {

    private MemberDAO memberDAO = null;

    /**
     * A non-argument constructor that will instantiate the memberDAO.
     */
    public MemberBusinessLogic() {
        memberDAO = new MemberDAOImpl();
    }

    /**
     * Returns a List of all the members.
     *
     * @return list of Member objects
     */
    public ArrayList<Member> getAllMembers() {
        return memberDAO.getAllMembers();
    }
}
