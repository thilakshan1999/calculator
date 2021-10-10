package redhood.v5.input;

public class CommandLineInput implements Inputs{

  private final String[] args;

  public CommandLineInput(String[] argument)
  {
    this.args=argument;
  }
  public String getOperator() throws InvalidInputExcetion {
    if (args.length == 0) {
      //System.out.println("Please provide the operation as argument");
      throw new InvalidInputExcetion("Please provide the the operation as argument");
    }
    String operator = args[0];
    if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul")||operator.equals("div"))) {
      //System.out.println("Plese provide add ,sub or mul as operational argument");
      throw new InvalidInputExcetion("Please provide add,sub.mul as operational argument");
    }
    return operator;
  }
}
