package Model;

public class Currency {

    private final String code,name,symbol;

    public Currency (String c, String n, String s) {
        code = c;
        name = n;
        symbol = s;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return code;
    }

}