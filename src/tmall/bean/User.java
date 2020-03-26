package tmall.bean;

public class User {
    private String password;
    private String name;
    private int id;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //获取用户的匿名名称（评论时用的）
    public String getAnonymousName(){
        if(null == name)
            return null;

        if(name.length()<=1)
            return "*";

        if(name.length()==2)
            return name.substring(0,1)+"*";

        char[] Aname = name.toCharArray();
        for(int i = 1;i<Aname.length-1;i++)
            Aname[i] = '*';
        return Aname.toString();
    }
}
