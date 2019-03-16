import java.lang.reflect.Method;

public class Client {
    public static void main(String[] args){
        try{

//            UserManager obj = (UserManager)new LogHandler().getInstance(new UserManagerImpl());
//            obj.addUser("你好","大家好");
            Object obj = new LogHandler().getInstance(new UserManagerImpl());
            /**
             * 调用无参数的方法
             */
//            Method method =  obj.getClass().getMethod("findUser",null);
//            method.invoke(obj);


            /**
             * 调用有参数的方法
             */
            Method method =  obj.getClass().getMethod("addUser",String.class,String.class);
            method.invoke(obj,"你好啊","我不好");
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
