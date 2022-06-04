package study.interfaces;

public interface Interface {

	public void m1();
	
	public void m2();
	
}

abstract class serviceprovider implements Interface
{
  public   void m1()/*compulsary access specifier is public because we cant reduce scope*/
	{
		
	}


}


 /*class subserviceprovider extends serviceprovider{
 public void m2()
 {
	 
 }

}*/