package Main.Practise14;

import java.util.List;

public class UserService <K, V extends  Account>
{
    public <K> void printUsers(List<K> users){
        for (K user : users){
            System.out.println(user);
        }
    }

    public <V> void printAccounts(List<V> accounts){
        for (V account : accounts){
            System.out.println(account);
        }
    }

    public double fee(V account){
        return account.getMoney() * 0.05;

    }
}
