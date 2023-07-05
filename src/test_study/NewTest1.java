package test_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void TC1() 
  {
	  Reporter.log("Running TC1",true);
  }
  @Test
 public void TC2() {
	  Reporter.log("Runnning TC2",false);
  }
  @Test
  public void TC3()
  {
	  Reporter.log("Running TC3",true);
  }
  @Test
  public void TC4()
  {
	Reporter.log("Running TC4");  
  }
	  
  }


