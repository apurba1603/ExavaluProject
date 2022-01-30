package com.tablebooking.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.tablebooking.beans.User;
import com.tablebooking.dao.UserServices;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Apu
 */
public class UserAction implements SessionAware {

    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private boolean validUser;
    private boolean status;
    private String submitType;
    private ResultSet rs = null;
    private User user = null;
    private List<User> userList = null;
    private boolean noData = false;

    private String msg = "";
    UserServices userServices = null;
    private int ctr = 0;

    private SessionMap<String, Object> sessionMap;

    public String registerUser() throws Exception {
        userServices = new UserServices();

        try {
            setCtr(userServices.registerUser(userName, password, firstName, lastName,
                    email, phoneNumber));
            if (getCtr() > 0) {
                setMsg("Registration Successfull");
            } else {
                setMsg("Some error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "REGISTER";
    }

    public String userLogin() throws Exception {
        UserServices dao = new UserServices();
        String login;
        User myUser = new User();
        myUser.setUserName(userName);
        myUser.setPassword(password);

        User validUser = UserServices.validateLoginCredentials(myUser);
        try {

            if (validUser.isValidUser()) {
                sessionMap.put("User", validUser);
                userName = validUser.getUserName();
                password = validUser.getPassword();
                firstName = validUser.getFirstName();
                lastName = validUser.getLastName();
                email = validUser.getEmail();
                phoneNumber = validUser.getPhoneNumber();
                login = "LOGIN";
            } else {
                setMsg("Login failed");
                login = "LOGINFAILED";
            }

        } catch (Exception e) {
            e.printStackTrace();
            login = "ERROR";
        }

        return login;
    }

    public String userProfile() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        User user = (User) session.getAttribute("User");
        System.out.println("user:" + user);
        String valid;

        try {
            System.out.println("in try block user:" + user.isValidUser());
            if (user != null && user.isValidUser()) {
                userName = user.getUserName();
                password = user.getPassword();
                firstName = user.getFirstName();
                lastName = user.getLastName();
                email = user.getEmail();
                phoneNumber = user.getPhoneNumber();
                valid = "VALID";
            } else {
                setMsg("Login failed");
                valid = "INVALID";
            }

        } catch (Exception e) {
            e.printStackTrace();
            valid = "INVALID";
        }
        System.out.println(valid);
        return valid;
    }

    public String logout() throws Exception {
        try {
            if (sessionMap != null) {
            sessionMap.invalidate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        return "LOGOUT";
    }

    public String deleteUser() throws Exception {
        UserServices dao = new UserServices();
        try {
            int isDeleted = dao.deleteUserDetails(userName);
            if (isDeleted > 0) {
                msg = "Record deleted successfully";
            } else {
                msg = "Some error";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "DELETE";
    }

    public String showUsers() throws Exception {
        userServices = new UserServices();
        try {
            setUserList(new ArrayList<User>());
            setUserList(userServices.report());

            if (!userList.isEmpty()) {
                setNoData(false);
                System.out.println("Users retrieve = " + getUserList().size());
                System.out.println("setting nodata=false");
            } else {
                setNoData(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "REPORT";
    }

    public String updateUser() throws Exception {
        UserServices dao = new UserServices();

        try {
            if (getSubmitType().equals("updatedata")) {
                User user = dao.fetchUserDetails(userName.trim());
                if (user != null) {
                    userName = user.getUserName();
                    password = user.getPassword();
                    firstName = user.getFirstName();
                    lastName = user.getLastName();
                    email = user.getEmail();
                    phoneNumber = user.getPhoneNumber();
                }
            } else {
                int i = dao.updateUserDetails(userName, password, firstName, lastName,
                        email, phoneNumber);
                if (i > 0) {
                    msg = "Record Updated Successfuly";
                } else {
                    msg = "error";
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "UPDATE";
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the validUser
     */
    public boolean isValidUser() {
        return validUser;
    }

    /**
     * @param validUser the validUser to set
     */
    public void setValidUser(boolean validUser) {
        this.validUser = validUser;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return the ctr
     */
    public int getCtr() {
        return ctr;
    }

    /**
     * @param ctr the ctr to set
     */
    public void setCtr(int ctr) {
        this.ctr = ctr;
    }

    /**
     * @return the rs
     */
    public ResultSet getRs() {
        return rs;
    }

    /**
     * @param rs the rs to set
     */
    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the userList
     */
    public List<User> getUserList() {
        return userList;
    }

    /**
     * @param userList the userList to set
     */
    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    /**
     * @return the noData
     */
    public boolean isNoData() {
        return noData;
    }

    /**
     * @param noData the noData to set
     */
    public void setNoData(boolean noData) {
        this.noData = noData;
    }

    /**
     * @return the submitType
     */
    public String getSubmitType() {
        return submitType;
    }

    /**
     * @param submitType the submitType to set
     */
    public void setSubmitType(String submitType) {
        this.submitType = submitType;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        sessionMap = (SessionMap) map; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
