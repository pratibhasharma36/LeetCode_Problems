package SearchAlgorithms;

public class K004 {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = accountMoney(accounts[0]);
        for (int i = 1; i < accounts.length; i++) {
            if(accountMoney(accounts[i]) > maxWealth){
                maxWealth = accountMoney(accounts[i]);
            }
        }
        return maxWealth;
    }
    static int accountMoney(int [] personWealth){
        if(personWealth == null){
            return 0;
        }
        int total = 0;
        for (int index = 0; index < personWealth.length; index++) {
            total += personWealth[index];
        }
        return total;
    }

    public static void main(String[] args) {
       int [] [] accounts = {{1,5}, {7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }
}
