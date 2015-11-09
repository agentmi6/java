public class Utils {
    public void doThis() throws Exception {
        System.out.println("Arrived in doThis()");
        //try {
            doThat();
        //}
        //catch (Exception e) {
        //    System.out.println(e);
        //}
        System.out.println("Back in doThis()");
    }

    public void doThat() throws Exception {
        System.out.println("In doThat()");
        throw new Exception();
    }

}
