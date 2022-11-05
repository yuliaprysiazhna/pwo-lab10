package pwo.lab10.chain;

public class TxtProcRemoveDigits extends TxtProc {
    public static String ACTION = "REMOVE DIGITS";
    
    @Override
    public String processRequest(Request request) {
        if (request.action.toUpperCase().equals(ACTION)) {
            return request.text.replaceAll("\\d", "");
        } else {
            return next(request);
        }
    }
}
