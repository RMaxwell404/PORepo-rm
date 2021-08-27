public class CreditChecker {

    public CreditChecker(){
    }

    public boolean checkNumber(Long cn){
        if (cn.toString().length() >= 14 && cn.toString().length() <= 17){
            return LuhnTest(cn);
        }
        else return false;
    }

    public boolean LuhnTest(Long cn){
        char check = cn.toString().charAt(cn.toString().length() - 1);

        String cnS = cn.toString().substring(0, cn.toString().length()-1);

        StringBuilder cnR = new StringBuilder(cnS).reverse();

        Integer sum = 0;
        for(int i = 0; i < cnR.length(); i++){
            Integer add = (int) Long.parseLong(cnR.substring(i,i + 1)) * 2;

            if (add % 10 > 0){
                sum += (add % 10) + 1;
            }
            else sum += add;
        }

        return (sum.toString().charAt(sum.toString().length() - 1) == check);



    }

}
