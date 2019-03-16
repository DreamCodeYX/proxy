public interface UserManager {
     void addUser(String userId, String userName);

     void delUser(String userId);

     String findUser();

     void modifyUser(String userId, String userName);
}
