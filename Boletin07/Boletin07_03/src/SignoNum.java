public class SignoNum {
    public void SigNum(int num) {
        if (num>0)
            System.out.println(num + " tiene signo: +");
        else
        if(num<0)
            System.out.println(num + " tiene signo: -");
        else
            System.out.println(num + " su signo es: 0");
    }
}