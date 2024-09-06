public class Singleton {
    public static void main(String[] args){
        Logger logger=Logger.getInstance();
        Logger logger1=Logger.getInstance();
        logger1.log("Hi");
    }
}
