package Main.Practise14;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args)
    {
        CreditAccount creditAccount = new CreditAccount(1234.22, "wews");
        DebitAccount debitAccount = new DebitAccount(123123,2222);

        User user = new User("wawd", "sda", 11);

        UserService<User, Account> service = new UserService<>();
        service.printAccounts(Arrays.asList(creditAccount, debitAccount));
        service.printUsers(Collections.singletonList(user));
        System.out.println(service.fee(creditAccount));
    }
}
