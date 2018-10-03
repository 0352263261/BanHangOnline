package ptit.hoang.entity;

public class FunctionAccount {
    private String nameIcon;
    private String function;
    private String functionDetail;

    public FunctionAccount(String nameIcon, String function, String functionDetail) {
        this.nameIcon = nameIcon;
        this.function = function;
        this.functionDetail = functionDetail;
    }

    public String getNameIcon() {
        return nameIcon;
    }

    public void setNameIcon(String nameIcon) {
        this.nameIcon = nameIcon;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getFunctionDetail() {
        return functionDetail;
    }

    public void setFunctionDetail(String functionDetail) {
        this.functionDetail = functionDetail;
    }
}
