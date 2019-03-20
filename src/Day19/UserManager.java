package Day19;

public class UserManager  {
    public String checkUser(User one,User two){
     String onename=one.getUsername();
     String onepwd=one.getPwd();
     String twoname=two.getUsername();
     String twopwd=two.getPwd();
      if(!onename.equals(twoname)){
         return "用户不一致";
     }
     if(onename.equals("")||twoname.equals("")){
         return "用户名为空";
     }


        if(!onepwd.equals(twopwd)){
            return"密码不一致";
        }
        if(onepwd.equals("")||twopwd.equals("")){
            return "密码为空";
        }
     return "验证成功";
}


}