import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {
    private String name;
    private int age;
    private int weight;

    public User(){
        // Default Constructor required for calls to DataSnapshot.getValue(User.class)
    }
    public User(String name, int age, int weight)
    {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge()
    {
        return this.age;
    }

    public void SetAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return this.name;
    }

    public void SetName(String name)
    {
        this.name = name;
    }

}
