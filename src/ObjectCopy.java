public class ObjectCopy {
    public static void main(String[] args) {
        User user1 = new User("Gandalf", 99999.000001);
        User user1copy = new User(user1);

        System.out.println(user1 == user1copy);
    }
}

class Setting{
    int value;
    public Setting(){
        value = 100;
    }
    public Setting(int value){
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Setting)
            return obj == this || (((Setting) obj).value == this.value);
        return false;
    }
}

class User{
    String username;
    double value;
    Setting setting;

    public User(String username, double value){
        this.username = username;
        this.value = value;
        this.setting = new Setting();
    }

    public User(User vorlage){
        this(vorlage.username, vorlage.value);
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof User){
            User vorlage = (User) obj;
            if(vorlage == this)
                return true;
            else if (vorlage.username == this.username &&
                    vorlage.value == this.value &&
                    vorlage.setting.equals(this.setting))
                return true;
        }
        return false;
    }
}

